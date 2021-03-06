package com.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.ContentDAO;
import com.model.Content;
import com.model.Member;

/**
 * Servlet implementation class FormContentServlet
 */
@WebServlet("/member/FormContentServlet")
public class FormContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	ContentDAO contentDAO;
    public FormContentServlet() {
        contentDAO = new  ContentDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Views/Home/Content/FormContent.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("Member");
		
		
		Content entity = new Content();
		entity.setUpdateTime(null);
		entity.setDeleteAt(false);
		entity.setSort("asc");
		entity.setMember(member);
		
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
				
				
			contentDAO.store(entity);
			request.setAttribute("mess", "Create Success");
			doGet(request, response);
		} catch (Exception e) {
			request.setAttribute("mess", "Create False");
			doGet(request, response);
		}
	}

}
