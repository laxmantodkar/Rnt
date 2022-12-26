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

				<h1 class="text-center mb-3">Fill the Student datail</h1>

				<form action="student" method="post">
                             
                             

					<div class="form-group">
						<label for="name">First Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="firstName" required>
					</div>


					<div class="form-group">
						<label for="designation">Last Name</label> <input type="text"
							class="form-control" id="designation"
							aria-describedby="emailHelp" name="lastName" required>
					</div>


					<div class="form-group">
						<label for="price">Email</label> <input type="text" name="email"
							class="form-control" id="salary" required>
					</div>

					<div class="form-group">
						<label for="price">Mobile Number</label> <input type="number"
							name="mobileNumber" required class="form-control" id="price">
					</div>
					<div class="form-group">
						<label for="designation">City</label> <input type="text"
							class="form-control" id="city" aria-describedby="emailHelp"
							name="city" required>
					</div>
					<div class="form-group">
						<label for="designation">Course</label> <input type="text"
							class="form-control" id="city" aria-describedby="emailHelp"
							name="course" required>
					</div>
					<div class="form-group">
						<label for="designation">Date of Birth</label> <input type="text"
						placeholder="dd/mm/yyyy"	class="form-control" id="date" aria-describedby="emailHelp"
							name="date" required>
					</div>

					<!-- <div class="form-group">
						<label for="exampleFormControlFile1"> File Upload</label> <input
							type="file" class="form-control-file" name="profile"
							id="exampleFormControlFile1">
					</div> -->



					<div class="container text-center">
						<a href="${pageContext.request.contextPath}/"
							class="btn btn-outline-danger">Back</a>
						<button type="submit" class="btn btn-primary">Add</button>
					</div>
				</form>


			</div>

		</div>

	</div>



</body>
</html>