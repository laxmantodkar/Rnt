<html>
<head>
 <%@include file="./base.jsp"%> 
<%--  <%@include file="./base1.jsp"%> --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-3">WELCOME</h2>
				<h3 class="text-center mb-3">Employee Management System</h3>

				<!-- <form action="search" method="post">
					<div class="form-inline my-2 my-lg-0">
						<input class="form-control mr-sm-2" id="search-input"
							onkeyup="search()" name="name" type="search"
							placeholder="Enter Name" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					</div>

				</form> -->
				<br>
				<table class="table" id="example">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Employee Name</th>
							<th scope="col">Designation</th>
							<th scope="col">Salary</th>
							<th scope="col">Mobile Number</th>
							<th scope="col">City</th>
							<th scope="col">Action</th>
							<th scope="col">Status</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${Employee}" var="emp">
							<tr>
								<th scope="row">${emp.id}</th>
								<td>${emp.name}</td>
								<td>${emp.designation}</td>
								<td>&#x20B9;${emp.salary}</td>
								<td>${emp.mobileNumber}</td>
								<td>${emp.city}</td>
								<td><a href="delete_emp/${emp.id}" onclick="deleteAlert()">Delete</a></td>
								<td><a href="update/${emp.id}">Update</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">

					<a href="add_emp" class="btn btn-outline-success">Add Employee</a>
				</div>
			</div>
		</div>
	</div>
<script>
        $(document).ready(function() {
            $('#example').DataTable();
        });
</script>

</body>
</html>