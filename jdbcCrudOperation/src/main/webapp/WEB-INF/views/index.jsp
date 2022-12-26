<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
			  <h2 class="text-center mb-3">WELCOME</h2>
				<h3 class="text-center mb-3">Fill The Student Details</h3>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">First Name</th>
							<th scope="col">LastName</th>
							<th scope="col">Email</th>
							<th scope="col">Course</th>
							<th scope="col">Mobile Number</th>
							<th scope="col">City</th>
							<th scope="col">Date of Birth</th>
							<th scope="col">Action</th>
							<th scope="col">Status</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${student}" var="student">
							<tr>
								<th scope="row">${student.id}</th>
								<td>${student.firstName}</td>
								<td>${student.lastName}</td>
								<td>${student.email}</td>
								<td>${student.course}</td>
								<td>${student.mobileNumber}</td>
								<td>${student.city}</td>
								<td>${student.date}</td>
								<td><a href="delete/${student.id}">Delete</a></td>
								<td><a href="update/${student.id}">Update</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">

					<a href="student" class="btn btn-outline-success">Add New Student</a>
				</div>
			</div>
		</div>
	</div>
