package com.servlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ContentDAO;
import com.model.Content;

/**
 * Servlet implementation class ViewContentServlet
 */
@WebServlet("/member/ViewContentServlet")
public class ViewContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	ContentDAO contentDAO;
	public ViewContentServlet() {
		contentDAO = new ContentDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pageStr = request.getParameter("page"); 
		String limitStr = request.getParameter("limit");
		String keySearchStr = request.getParameter("keySearch");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr);
		int limit = limitStr == null ? 3 : Integer.parseInt(limitStr);
		int offset = limit * (page - 1);
		String keySearch = keySearchStr == null ? "" : keySearchStr;

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("keySearch", keySearch);
		
		List<Content> listContent = this.contentDAO.paginate(offset, limit, keySearch);

		
		request.setAttribute("listContent", listContent);
		request.setAttribute("page", page);
		
		request.getRequestDispatcher("/Views/Home/Content/ViewContents.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
