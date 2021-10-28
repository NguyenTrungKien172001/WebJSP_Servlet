<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
<body>
	<div class="container mt-5">
		<div class="d-flex justify-content-center ">
			<div class="card col-md-4 mt-5">
				<div class="card-header">Register</div>
				<div class="card-body">
					<form>
						<div class="mb-3">
							<input type="text" class="form-control" id="username"
								name="username" placeholder="User name">
						</div>
						<div class="mb-3">
							<input type="email" class="form-control" id="email" name="email"
								placeholder="Email" aria-describedby="emailHelp">
						</div>
						<div class="mb-3">
							<input type="password" class="form-control" name="password"
								placeholder="Password" id="password">
						</div>
						<div class="mb-3">
							<input type="password" class="form-control" name="Repassword"
								placeholder="Re Password" id="Repassword">
						</div>
						<button type="submit"
							class="btn btn-lg btn-success mb-3 col-md-12">Register</button>
						<br /> <a href="${pageContext.request.contextPath}/Login"
							style="text-decoration: none">Click here to Login</a>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>