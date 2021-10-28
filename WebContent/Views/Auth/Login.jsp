<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
				<div class="card-header">Please Sign In</div>
				<div class="card-body">
					<form method="POST" action="${pageContext.request.contextPath}/Login">
						<div class="mb-3">
							<input type="email" class="form-control" id="email" name="email" placeholder="Email"
								aria-describedby="emailHelp">
						</div>
						<div class="mb-3">
							<input type="password" class="form-control" name="password" placeholder="Password"
								id="password">
						</div>
						<div class="mb-3 form-check">
							<input type="checkbox" class="form-check-input"
								id="exampleCheck1"> <label class="form-check-label"
								for="exampleCheck1">Remember Me</label>
						</div>
						<button  type="submit" class="btn btn-lg btn-success mb-3 col-md-12">Login</button><br/>
						<a href="${pageContext.request.contextPath}/Register" style="text-decoration: none">Click here to Register</a>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>