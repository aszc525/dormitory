package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnsic.dao.AdminDao;
import com.hnsic.daoimpl.AdminDaoimpl;
import com.hnsic.entity.Grade;


public class Admin_allStudormGrade extends HttpServlet {
	//�޹�Ա��ѯ�������ҳɼ�
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			//�½���������
			AdminDao adminDao=new AdminDaoimpl();
			//���ò�ѯ����
			List<Grade> list=adminDao.getAllgrade();
			//���������Ự��
			request.setAttribute("list10", list);
			System.out.println(list);
			request.getRequestDispatcher("/Admin/Admin_allStudormGrade.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
