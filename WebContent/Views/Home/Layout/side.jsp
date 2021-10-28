<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
	.sidebar {
	  position: fixed;
	  top: 0;
	  bottom: 0;
	  left: 0;
	  padding: 58px 0 0;
	  box-shadow: 0 2px 5px 0 rgb(0 0 0 / 5%), 0 2px 10px 0 rgb(0 0 0 / 5%);
	  width: 240px;
	  z-index: 600;
	}
	
	@media (max-width: 991.98px) {
	  .sidebar {
	    width: 100%;
	  }
	}
	
	.sidebar-sticky {
	  position: relative;
	  top: 0;
	  height: calc(100vh - 48px);
	  padding-top: 0.5rem;
	  overflow-x: hidden;
	  overflow-y: auto;
	}
</style>
	
	
<!-- Sidebar -->
  <nav
       id="sidebarMenu"
       class="collapse d-lg-block sidebar collapse bg-light col-12"
       >
    <div class="position-sticky">
    
      <div class="list-group list-group-flush mx-3 mt-4">
      	<div class="mb-2">
        <input class="form-control me-2 " type="search" placeholder="Search" aria-label="Search">
        </div><hr>
        <a
           href="${pageContext.request.contextPath}/member/ViewContentServlet"
           class="list-group-item list-group-item py-2 ripple"
           >
         <span>View contents</span>
        </a>
        <a
           href="${pageContext.request.contextPath}/member/FormContentServlet"
           class="list-group-item list-group-item py-2 ripple "
           >
          <span>Form content</span>
        </a>
      </div>
    </div>
  </nav>
  <!-- Sidebar -->

