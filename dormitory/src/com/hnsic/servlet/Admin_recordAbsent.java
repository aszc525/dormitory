package com.hnsic.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnsic.dao.AdminDao;
import com.hnsic.daoimpl.AdminDaoimpl;
import com.hnsic.entity.Absent;

public class Admin_recordAbsent extends HttpServlet {		
	//��¼ѧ��ȱ�����
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//���ܱ��ύ����������
		String absentID=request.getParameter("absentID");
		String stuID=request.getParameter("stuID");				
		String name=request.getParameter("name");
		String dormID=request.getParameter("dormID");
		String roomID=request.getParameter("roomID");
		String time=request.getParameter("time");
		String phone=request.getParameter("phone");
		String remarks=request.getParameter("remarks");
		
		//������װ�ص�JavaBean		
		Absent absent=new Absent();
		absent.setAbsentID(absentID);
		absent.setStuID(stuID);
		absent.setName(name);
		absent.setDormID(dormID);
		absent.setRoomID(roomID);
		absent.setTime(time);
		absent.setPhone(phone);
		absent.setRemarks(remarks);
		
		
		//��������Dao��
		AdminDao adminDao=new AdminDaoimpl();
		boolean flag=adminDao.absent(absent);

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
