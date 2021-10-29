<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View content</title>
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

<script type="text/javascript">
	function check() {
	  var r = confirm("You want to delete!");
	  if (r == true) {
		alert("Delete success");
	    return true;
	  } else {
	    return false;
	  }
	}

</script>
</head>

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
					<h2>View Content</h2>
					<hr>
					<div class="card">
					  <div class="card-header">
					    View Content List
					  </div>
					  <div class="card-body row">
					    <div class="col-sm-12">
					    	<table class="table table-striped table-hover">
  								  <thead>
								    <tr>
								      <th scope="col">#</th>
								      <th scope="col">Title</th>
								      <th scope="col">Brief</th>
								      <th scope="col">Create Date</th>
								      <th scope="col">Action</th>
								    </tr>
								  </thead>
								  <tbody>
								    <c:forEach items="${listContent}" var="content">
										<tr>
											<td>${content.id}</td>
											<td>${content.title}</td>
											<td>${content.brief}</td>
											<td>${content.createdDate}</td>
											<td>
												<a href="${pageContext.request.contextPath}/member/EditContentServlet?id=${content.id }" class="btn btn-outline-warning mr-1">Update</a>
												<a href="${pageContext.request.contextPath}/member/SoftDeleteContentServlet?id=${content.id}" class="btn btn-outline-danger" onclick="return check();">Delete</a>
											</td>
										</tr>
									</c:forEach>
								  </tbody>
							</table>
							<ul class="pagination">
								<li class="page-item"><a
									href="${pageContext.request.contextPath}/member/ViewContentServlet?page=${page == 1 ? page : page-1}" class="page-link">Previos</a>
								</li>
								<li class="page-item">
									<a class="page-link">${page}</a>
								</li>
								<li class="page-item"><a
									href="${pageContext.request.contextPath}/member/ViewContentServlet?page=${page + 1}" class="page-link">Next</a>
								</li>
							</ul>
					    </div>
					  </div>
					</div>
				</div>
				
			</article>

		</div>
	</div>
</body>
</html>