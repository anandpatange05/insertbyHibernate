package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.BIManager;
import com.pojo.Demo;

/**
 * Servlet implementation class InsertDemo
 */
@WebServlet("/InsertDemo")
public class InsertDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Demo d = new Demo();
	BIManager b = new BIManager();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		System.out.println(id + " " + name);
		d.setId(Integer.parseInt(id));
		d.setName(name);
		b.insert(d);
		response.sendRedirect("Index.jsp");
	}

}
