<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form content</title>
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
					<h2>Add Content</h2>
					<hr>
					<div class="card">
					  <div class="card-header">
					    Content Form Elements
					  </div>
					  <div class="card-body row">
					    <div class="col-sm-9">
					    	<form>
							  <div class="mb-3">
							    <label for="title" class="form-label"><b>Title</b></label>
							    <input type="text" class="form-control" id="title" name="title" placeholder="Enter the title">
							  </div>
							  <div class="mb-3">
							    <label for="brief" class="form-label"><b>Brief</b></label>
							    <textarea  class="form-control" id="brief" name="brief" rows="3"></textarea>
							  </div>
							  <div class="mb-3">
							    <label for="content" class="form-label"><b>Content</b></label>
							    <textarea  class="form-control" id="content" name="content" rows="7"></textarea>
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