package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hnsic.dao.AdminDao;
import com.hnsic.daoimpl.AdminDaoimpl;
import com.hnsic.entity.Admin;

public class Admin_personalDetail extends HttpServlet {		
	//��ѯ������Ϣ
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		
		//��ȡ�����session�е�InstructorID
		Admin admin=(Admin)session.getAttribute("admin");
		String adminID=admin.getAdminID();
		System.out.println(adminID);
		
		try{			
			//�½���������
			AdminDao adminDao=new AdminDaoimpl();
			//���ò�ѯ����
			List<Admin> list=adminDao.getAdmin(adminID);
			//���������Ự��
			request.setAttribute("list11", list);
			request.getRequestDispatcher("Admin/Admin_personalDetail.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request,response);
	}

}
