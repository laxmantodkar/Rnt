package com.rnt.operation.Studentdao;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import com.rnt.operation.configuration.DatabaseConnection;
import com.rnt.operation.model.Emp;
import com.rnt.operation.model.Student;

public class StudentDao {

	
	//Get Single Student
	public Student getSingleStudent(int id)
	{
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Student student = new Student();
		try {
			connection = DatabaseConnection.getConnection();
			String q = "select * from student where id=?";
			pst = connection.prepareStatement(q);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				
				student.setId(rs.getInt(1));
				student.setFirstName(rs.getString(2));
				student.setLastName(rs.getString(3));
				student.setMobileNumber(rs.getLong(4));
				student.setCity(rs.getString(5));
				student.setEmail(rs.getString(6));
				student.setCourse(rs.getString(7));
				student.setDate(rs.getString(8));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pst.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
		
	}
	

	// get data
	public List<Student> getAllStudent() {
		List<Student> studentlist = new ArrayList<Student>();
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		try {
			connection = DatabaseConnection.getConnection();
			String q = "select * from student";
			pst = connection.prepareStatement(q);
			rs = pst.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setFirstName(rs.getString(2));
				student.setLastName(rs.getString(3));
				student.setMobileNumber(rs.getLong(4));
				student.setCity(rs.getString(5));
				student.setEmail(rs.getString(6));
				student.setCourse(rs.getString(7));
				student.setDate(rs.getString(8));
				studentlist.add(student);

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pst.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return studentlist;

	}

	// Insert all data
	public int insertStudent(Student student) {
		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		int i = 0;
		try {
			connection = DatabaseConnection.getConnection();
			String q = "insert into student(first_name,last_name,mobile_number,city,email,course,date)"
					+ " values (?,?,?,?,?,?,?)";
			pst = connection.prepareStatement(q);
			pst.setString(1, student.getFirstName());
			pst.setString(2, student.getLastName());
			pst.setLong(3, student.getMobileNumber());
			pst.setString(4, student.getCity());
			pst.setString(5, student.getEmail());
			pst.setString(6, student.getCourse());
			pst.setString(7, student.getDate());
			i = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;

	}

	//delete Student
	public int deleteStudent(int id)
	{
		Connection con=null;
		PreparedStatement pst=null;
		int i=0;
		try {
			
			con=DatabaseConnection.getConnection();
			String q="delete from student where id=?";
			pst=con.prepareStatement(q);
			 pst.setInt(1, id);
			 i = pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				pst.close();
				con.close();
			} catch (Exception e) {
				
			}
		}
		return i;
	}
	//update Student
	
	public int updateStudent(Student student)
	{
		Connection conn=null;
		PreparedStatement pst=null;
		int i=0;
		try {
			 
			conn=DatabaseConnection.getConnection();
			String q="UPDATE student set first_name=?,last_name=?,mobile_number=?,city=?,email=?,course=?,date=?  where id=?";
			pst=conn.prepareStatement(q);
			pst.setString(1, student.getFirstName());
			pst.setString(2, student.getLastName());
			pst.setLong(3, student.getMobileNumber());
			pst.setString(4, student.getCity());
			pst.setString(5, student.getEmail());
			pst.setString(6, student.getCourse());
			pst.setString(7, student.getDate());
			pst.setInt(8, student.getId());
			i = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
