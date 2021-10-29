<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
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
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<body>
	<div class="container-fluid">
		<div class="row">
			<jsp:include page="/Views/Home/Layout/nav.jsp"></jsp:include>
		</div>
		<div class="row ">
			<aside class="col-md-2  ">
				<jsp:include page="/Views/Home/Layout/side.jsp"></jsp:include>
			</aside>
			<article class="col-md-10 mt-5">
				<div class="p-4">
					<h2 class="text-center">Hello, ${Member.username }</h2>
					<hr><br/>
					<h3 align="center">Website built by Nguyen Trung Kien</h3>
				</div>
			</article>

		</div>
	</div>
</body>
</html>