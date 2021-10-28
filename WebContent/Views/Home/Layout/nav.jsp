<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top border-bottom">
	<div class="container-fluid">
		<a class="navbar-brand" href="${pageContext.request.contextPath}/Home">CMS</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarTogglerDemo02"
			aria-controls="navbarTogglerDemo02" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
			</ul>
			<form class="d-flex">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#"
						id="navbarScrollingDropdown" role="button"
						data-bs-toggle="dropdown" aria-expanded="false">Hello </a>
						<ul class="dropdown-menu"
							aria-labelledby="navbarScrollingDropdown">
							<li><a class="dropdown-item" href="${pageContext.request.contextPath}/member/EditProfileServlet">User Profile</a></li>
							<li><a class="dropdown-item" href="${pageContext.request.contextPath}/Logout">Logout</a></li>
						</ul></li>
				</ul>
			</form>
		</div>
	</div>
</nav>