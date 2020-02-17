package com.hnsic.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnsic.dao.AdminDao;
import com.hnsic.daoimpl.AdminDaoimpl;
import com.hnsic.entity.Grade;

public class Admin_recordGrade extends HttpServlet {		//��¼ѧ�����ҿ۷����

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//���ܱ��ύ����������
		String dateID=request.getParameter("dateID");
		String time=request.getParameter("time");				
		String dormID=request.getParameter("dormID");
		String roomID=request.getParameter("roomID");
		String points=request.getParameter("points");
		String score=request.getParameter("score");		
		
		//������װ�ص�JavaBean		
		Grade grade=new Grade();
		grade.setDateID(dateID);
		grade.setTime(time);
		grade.setDormID(dormID);
		grade.setRoomID(roomID);
		grade.setPoints(points);
		grade.setScore(score);
		
		//��������Dao��
		AdminDao adminDao=new AdminDaoimpl();
		boolean flag=adminDao.record(grade);

		if(flag){
			response.sendRedirect("/dormitory/Admin/Admin_recordsuccess.jsp");
		}else{
			response.sendRedirect("/dormitory/Admin/Admin_recordfail.jsp");
		}
			
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
