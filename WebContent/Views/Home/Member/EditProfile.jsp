<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
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
<script type="text/javascript">
	function validate() {
		var firstname = document.myForm.firstname.value;
		if(firstname==""){
			alert("Plesase Enter Firstname");
			document.myForm.firstname.focus();
			return false;
		}
		if(firstname.length<3 || firstname.length>30){
			alert("Firstname is of invalid length (3 -> 30)");
			document.myForm.firstname.focus();
			return false;
		}
		var lastname = document.myForm.lastname.value;
		if(lastname==""){
			alert("Plesase Enter Lastname");
			document.myForm.lastname.focus();
			return false;
		}
		if(lastname.length<3 || lastname.length>30){
			alert("Lastname is of invalid length (3 -> 30)");
			document.myForm.lastname.focus();
			return false;
		}
		var phone = document.myForm.phone.value;
		if(phone==""){
			alert("Plesase Enter Phone");
			document.myForm.phone.focus();
			return false;
		}
		if(phone.length!=10){
			alert("Phone is of invalid length (10)");
			document.myForm.phone.focus();
			return false;
		}
		var phoneFomart = /0\d{9}/;
		if(!phone.match(phoneFomart))
		{
			alert("You have entered an invalid phone");
			document.myForm.phone.focus();
			return false;
		}
		var description = document.myForm.description.value;
		if(description==""){
			alert("Plesase Enter Pescription");
			document.myForm.description.focus();
			return false;
		}
		if(description.length>200){
			alert("Description is of invalid length (<200)");
			document.myForm.description.focus();
			return false;
		}
	}

</script>
</head>

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
					    	<form name="myForm" method="POST" action="${pageContext.request.contextPath}/member/EditProfileServlet">
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
							    <label id="email">${Member.email}</label>
							  </div>
							  <div class="mb-3">
							    <label for="phone" class="form-label"><b>Phone</b></label>
							    <input type="text" class="form-control" id="phone" name="phone" placeholder="Enter the phone number 0123...">
							  </div>
							  <div class="mb-3">
							    <label for="description" class="form-label"><b>Description</b></label>
							    <textarea  class="form-control" id="description" name="description" rows="3"></textarea>
							  </div>
							  <button type="submit" class="btn btn-outline-success" onclick="return validate();">Submit Button</button>
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