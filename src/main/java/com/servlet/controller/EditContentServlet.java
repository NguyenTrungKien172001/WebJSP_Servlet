package com.servlet.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.ContentDAO;
import com.model.Content;


/**
 * Servlet implementation class EditContentServlet
 */
@WebServlet("/member/EditContentServlet")
public class EditContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	ContentDAO contentDAO;
    public EditContentServlet() {
        contentDAO = new ContentDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Content entity = this.contentDAO.findById(id);
		request.setAttribute("content", entity);
		
		request.getRequestDispatcher("/Views/Home/Content/EditContent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Content entity = this.contentDAO.findById(id);
		entity.setUpdateTime(new Date());
		
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			if(entity.getTitle()==""){
				System.out.println("Plesase Enter title");
				return ;
			}
			if(entity.getTitle().length()<10 || entity.getTitle().length()>200){
				System.out.println("Title is of invalid length (10 -> 200)");
				return ;
			}
			
			if(entity.getBrief()==""){
				System.out.println("Plesase Enter Brief");
				return ;
			}
			if(entity.getBrief().length()<30 || entity.getBrief().length()>150){
				System.out.println("Brief is of invalid length (30 -> 150)");
				return ;
			}
			
			if(entity.getContent()==""){
				System.out.println("Plesase Enter Content");
				return ;
			}
			if(entity.getContent().length()<30 || entity.getContent().length()>1000){
				System.out.println("Content is of invalid length (30 -> 1000)");
				return ;
			}
			
			this.contentDAO.update(entity);
			//chuyen ve form view content
			response.sendRedirect(request.getContextPath()+"/member/ViewContentServlet");
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("false");
		}
	}

}
