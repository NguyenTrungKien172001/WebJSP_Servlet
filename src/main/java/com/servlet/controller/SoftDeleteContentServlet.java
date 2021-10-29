package com.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.ContentDAO;
import com.model.Content;

/**
 * Servlet implementation class SoftDeleteContentServlet
 */
@WebServlet("/member/SoftDeleteContentServlet")
public class SoftDeleteContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ContentDAO contentDAO;
    public SoftDeleteContentServlet() {
    	 contentDAO = new  ContentDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//sort delete
				int id = Integer.parseInt(request.getParameter("id"));
				Content entity = this.contentDAO.findById(id);
				entity.setDeleteAt(true);
				
				try {
					BeanUtils.populate(entity, request.getParameterMap());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					this.contentDAO.update(entity);
					response.sendRedirect(request.getContextPath()+"/member/ViewContentServlet");
				} catch (Exception e) {
					response.sendRedirect(request.getContextPath()+"/member/ViewContentServlet");
				}
				
				
				
	}


}
