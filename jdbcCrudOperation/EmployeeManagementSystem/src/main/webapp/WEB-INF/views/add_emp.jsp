<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Fill the Employee datails</h1>

				<form action="save_emp" method="post">
				
				
					<div class="form-group">
						<label for="name">Name</label> <input type="text"
							class="form-control" id="name" minlength="10" aria-describedby="emailHelp"
							name="name" required>
					</div>
					
					
					<div class="form-group">
						<label for="designation">Designation</label> <input type="text"
							class="form-control" id="designation"
							aria-describedby="emailHelp" name="designation" required>
					</div>
					
					
					<div class="form-group">
						<label for="price">Salary </label> <input type="number"
							name="salary" class="form-control" id="salary" required>
					</div>

					<div class="form-group">
						<label for="price" >Mobile Number</label> <input type="number"
							name="mobileNumber"  required class="form-control" id="price">
					</div>
					<div class="form-group">
						<label for="designation">City</label> <input type="text"
							class="form-control" id="city"
							aria-describedby="emailHelp" name="city" required>
					</div>
					

					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button onclick="addAlert()" type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>


			</div>

		</div>

	</div>



</body>
</html>