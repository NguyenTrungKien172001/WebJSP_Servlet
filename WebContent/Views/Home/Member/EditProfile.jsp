<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
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
					<h2>Edit Profile</h2>
					<hr>
					<div class="card">
					  <div class="card-header">
					    Profile Form Elements
					  </div>
					  <div class="card-body row">
					    <div class="col-sm-9">
					    	<form>
							  <div class="mb-3">
							    <label for="firstname" class="form-label"><b>First Name</b></label>
							    <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter the first name">
							  </div>
							  <div class="mb-3">
							    <label for="lastname" class="form-label"><b>Last Name</b></label>
							    <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter the last name">
							  </div>
							  <div class="mb-3">
							    <label for="email" class="form-label"><b>Email</b></label><br/>
							    <label id="email">kiennt@gmail.com</label>
							  </div>
							  <div class="mb-3">
							    <label for="phone" class="form-label"><b>Phone</b></label>
							    <input type="text" class="form-control" id="phone" name="phone" placeholder="Enter the phone number">
							  </div>
							  <div class="mb-3">
							    <label for="description" class="form-label"><b>Description</b></label>
							    <textarea  class="form-control" id="description" name="description" rows="3"></textarea>
							  </div>
							  <button type="submit" class="btn btn-outline-success">Submit Button</button>
							  <button type="reset" class="btn btn-outline-success">Reset Button</button>
							</form>
					    </div>
					  </div>
					</div>
				</div>
				
			</article>

		</div>
	</div>
</body>
</html>