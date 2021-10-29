package com.servlet.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.dao.MemberDAO;
import com.model.Member;

/**
 * Servlet implementation class EditProfileServlet
 */
@WebServlet("/member/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	MemberDAO memberDAO;

	public EditProfileServlet() {
		memberDAO = new MemberDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Views/Home/Member/EditProfile.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Member entity = (Member) session.getAttribute("Member");

		entity.setUpdateTime(new Date());

		try {
			BeanUtils.populate(entity, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {

			if (entity.getFirstname() == "") {
				System.out.println("Plesase Enter Firstname");

				return;
			}
			if (entity.getFirstname().length() < 3 || entity.getFirstname().length() > 30) {
				System.out.println("Firstname is of invalid length (3 -> 30)");

				return;
			}

			if (entity.getLastname() == "") {
				System.out.println("Plesase Enter Lastname");

				return;
			}
			if (entity.getLastname().length() < 3 || entity.getLastname().length() > 30) {
				System.out.println("Lastname is of invalid length (3 -> 30)");

				return;
			}

			if (entity.getPhone() == "") {
				System.out.println("Plesase Enter Phone");

				return;
			}
			if (entity.getPhone().length() != 10) {
				System.out.println("Phone is of invalid length (10)");

				return;
			}
			String phoneFomart = "0\\d{9}";
			if (!entity.getPhone().matches(phoneFomart)) {
				System.out.println("You have entered an invalid phone");

				return;
			}

			if (entity.getDescription() == "") {
				System.out.println("Plesase Enter Pescription");

				return;
			}
			if (entity.getDescription().length() > 200) {
				System.out.println("Description is of invalid length (<200)");

				return;
			}

			this.memberDAO.update(entity);
			request.setAttribute("mess", "Update Success");
			doGet(request, response);
		} catch (Exception e) {
			request.setAttribute("mess", "Update False");
			doGet(request, response);
		}
	}

}
