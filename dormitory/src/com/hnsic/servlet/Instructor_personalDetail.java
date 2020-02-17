package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hnsic.dao.InstructorDao;
import com.hnsic.daoimpl.InstructorDaoimpl;
import com.hnsic.entity.Instructor;

public class Instructor_personalDetail extends HttpServlet {  //��ѯ������Ϣ

	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		
		//��ȡ�����session�е�InstructorID
		Instructor instructor=(Instructor)session.getAttribute("instructor");
		String instructorID=instructor.getInstructorID();
		
		System.out.println(instructor);
		try{			
			//�½���������
			InstructorDao instructorDao=new InstructorDaoimpl();
			//���ò�ѯ����
			List<Instructor> list=instructorDao.getinstructor(instructorID);
			//���������Ự��
			request.setAttribute("list7", list);
			request.getRequestDispatcher("instructor/Instructor_personalDetail.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
