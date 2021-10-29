package com.servlet.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.MemberDAO;
import com.model.Member;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	MemberDAO memberDAO;

	public Register() {
		memberDAO = new MemberDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("/Views/Auth/Register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Member entity = new Member();
		entity.setUpdateTime(null);
		entity.setDeleteAt(false);
		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		try {

			if (entity.getUsername() == "") {
				System.out.println("Plesase Enter Username");
				return;
			}
			if (entity.getUsername().length() < 3 || entity.getUsername().length() > 30) {
				System.out.println("Username is of invalid length (3 -> 30)");
				return;
			}
			if (entity.getEmail() == "") {
				System.out.println("Plesase Enter Email");
				return;
			}
			if (entity.getEmail().length() < 5 || entity.getEmail().length() > 50) {
				System.out.println("Email is of invalid length (5 -> 50)");
				return;
			}
			
			String mailformat = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			if (!entity.getEmail().matches(mailformat)) {
				System.out.println("You have entered an invalid email address");
				return;
			}
			
			if (entity.getPassword() == "") {
				System.out.println("Plesase Enter Password");
				return;
			}
			if (entity.getPassword().length() < 8 || entity.getPassword().length() > 30) {
				System.out.println("Password is of invalid length (8 -> 30)");
				return;
			}
			
			memberDAO.store(entity);
			request.setAttribute("mess", "Create Success");
			doGet(request, response);
		} catch (Exception e) {
			request.setAttribute("mess", "Create False");
			doGet(request, response);
		}

	}

}
