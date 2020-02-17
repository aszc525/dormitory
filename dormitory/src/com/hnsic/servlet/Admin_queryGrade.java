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

public class Admin_queryGrade extends HttpServlet {		
	//��ѯѧ�����ҿ۷����
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");			
		//��ȡ��������������
		String dormID=request.getParameter("dormID");
		String roomID=request.getParameter("roomID");
		
//		String dormID="59��";
//		String roomID="117";
		
		System.out.println(dormID);
		System.out.println(roomID);
		
		try{
			//�½���������
			AdminDao adminDao=new AdminDaoimpl();
			//���ò�ѯ����
			List<Grade> list=adminDao.getgrade(dormID,roomID);
			
			request.setAttribute("list9", list);
			//System.out.println(list);
			request.getRequestDispatcher("Admin/Admin_studentGrade.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
