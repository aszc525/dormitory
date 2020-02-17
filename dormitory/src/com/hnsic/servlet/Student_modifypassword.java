package com.hnsic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hnsic.dao.StudentDao;
import com.hnsic.daoimpl.StudentDaoimpl;
import com.hnsic.entity.Student;


public class Student_modifypassword extends HttpServlet {
	//�޸�����
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//���ñ��뷽ʽ
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			//ʹ��ALTER������ʾ��Ϣ����ֹ���롣
			String CONTENT_TYPE = "text/html; charset=GBK";
			response.setContentType(CONTENT_TYPE);			
			PrintWriter out=response.getWriter();     //��ʼ��out����
			
			//��ȡ���ύ������������Ϣ
			String password=request.getParameter("password");
			String passwordAgain=request.getParameter("passwordAgain");
			
			//��ȡ�����session�е�StuID
			HttpSession session=request.getSession();
			Student student =(Student)session.getAttribute("student");			
					
			try{
				if(password.equals(passwordAgain)){	
					student.setPassword(passwordAgain);
					StudentDao studenDao=new StudentDaoimpl();
					boolean flag=studenDao.change(student);
					if(flag){
						//��ת��changeSuccess.jsp
						request.getRequestDispatcher("student/changeSuccess.jsp").forward(request, response);
						
					}else{
						System.out.println("δ֪����");
					}			
				
				}else{
					out.print("<script language='javascript'>alert('�������벻һ��!!');window.location.href='/dormitory/student/student_xiugaimima.jsp';</script>");					
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request,response);
	}

}
