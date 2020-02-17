package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnsic.dao.StudentDao;
import com.hnsic.daoimpl.StudentDaoimpl;
import com.hnsic.entity.Grade;

public class Instructor_queryGrade extends HttpServlet {
	//����Ա��ѯ���ҿ۷����
	private static final long serialVersionUID = 1L;	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");			
		//��ȡ��������������
		String dormID=request.getParameter("dormID");
		String roomID=request.getParameter("roomID");
		
		try{
			//�½���������
			StudentDao studenDao=new StudentDaoimpl();
			
			//���ò�ѯ����
			List<Grade> list=studenDao.getgrade(dormID,roomID);
			
			request.setAttribute("list5", list);
			//System.out.println(list);
			request.getRequestDispatcher("instructor/Instructor_queryGrade.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
