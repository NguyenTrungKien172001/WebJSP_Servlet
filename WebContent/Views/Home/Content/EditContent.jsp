<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit content</title>
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
		var title = document.myForm.title.value;
		if(title==""){
			alert("Plesase Enter Title");
			document.myForm.title.focus();
			return false;
		}
		if(title.length<10 || title.length>200){
			alert("Title is of invalid length (10 -> 200)");
			document.myForm.title.focus();
			return false;
		}
		
		var brief = document.myForm.brief.value;
		if(brief==""){
			alert("Plesase Enter Brief");
			document.myForm.brief.focus();
			return false;
		}
		if(brief.length<30 || brief.length>150){
			alert("Brief is of invalid length (30 -> 150)");
			document.myForm.brief.focus();
			return false;
		}
		
		var content = document.myForm.content.value;
		if(content==""){
			alert("Plesase Enter Content");
			document.myForm.content.focus();
			return false;
		}
		if(content.length<30 || content.length>1000){
			alert("Content is of invalid length (30 -> 1000)");
			document.myForm.content.focus();
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
					<h2>Edit Content</h2>
					<hr>
					<div class="card">
					  <div class="card-header">
					    Content Form Elements
					  </div>
					  <div class="card-body row">
					    <div class="col-sm-9">
					    	<form name="myForm" method="POST" action="${pageContext.request.contextPath}/member/EditContentServlet?id=${content.id }">
							  <div class="mb-3">
							    <label for="title" class="form-label"><b>Title</b></label>
							    <input type="text" class="form-control" id="title" name="title" value="${content.title }" placeholder="Enter the title">
							  </div>
							  <div class="mb-3">
							    <label for="brief" class="form-label"><b>Brief</b></label>
							    <textarea  class="form-control" id="brief" name="brief" rows="3">${content.brief }</textarea>
							  </div>
							  <div class="mb-3">
							    <label for="content" class="form-label"><b>Content</b></label>
							    <textarea  class="form-control" id="content" name="content"  rows="7">${content.content }</textarea>
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