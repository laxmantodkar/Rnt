<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Datails</title>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h2 class="text-center mb-3">Update the Employee datails</h2>

				<form action="${pageContext.request.contextPath}/update_emp"
					method="post">
					<div class="form-group">
						<label for="name"></label> <input type="hidden"
							class="form-control" id="Id" aria-describedby="emailHelp"
							name="id" required value="${emp.id}">
					</div>

					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" required value="${emp.name}">
					</div>


					<div class="form-group">
						<label for="designation">Designation</label> <input type="text"
							class="form-control" id="designation"
							aria-describedby="emailHelp" name="designation" required
							value="${emp.designation}">
					</div>


					<div class="form-group">
						<label for="salary">Salary </label> <input type="number"
							name="salary" class="form-control" id="salary" required
							value="${emp.salary}">
					</div>

					<div class="form-group">
						<label for="mobileNumber">Mobile Number</label> <input
							type="number" name="mobileNumber" required class="form-control"
							id="price" value="${emp.mobileNumber}" required>
					</div>
					<div class="form-group">
						<label for="designation">City</label> <input type="text"
							class="form-control" required id="city"
							aria-describedby="emailHelp" name="city" value="${emp.city}">
					</div>


					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary"
							onclick="updateAlert();">Update</button>
					</div>
				</form>


			</div>

		</div>

	</div>
	<script type="text/javascript">
		function updateAlert() {
			aler("Update Succesfully");
		}
		function updateAlert() {
			swal({
				title : "Update Successfully",
				text : "You clicked the button!",
				icon : "success",
			});
		}
	</script>

</body>
</html>