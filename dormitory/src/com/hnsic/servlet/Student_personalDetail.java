package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hnsic.dao.StudentDao;
import com.hnsic.daoimpl.StudentDaoimpl;
import com.hnsic.entity.Student;



public class Student_personalDetail extends HttpServlet {   
	//��ѯѧ��������Ϣ
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session=request.getSession();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");	
			
			//��ȡ�����session�е�StuID
			Student student =(Student)session.getAttribute("student");			
			String stuid=student.getStuID();
			
			System.out.println(stuid);
			try{
				System.out.println(stuid);
				//�½���������
				StudentDao studenDao=new StudentDaoimpl();
				//���ò�ѯ����
				List<Student> list=studenDao.getstudent(stuid);
				//���������Ự��
				request.setAttribute("list2", list);
				request.getRequestDispatcher("student/quarysuccess.jsp").forward(request, response);
			}catch(Exception e){
				e.printStackTrace();
			}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
