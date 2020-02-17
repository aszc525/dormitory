package com.hnsic.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hnsic.dao.AdminDao;
import com.hnsic.dao.InstructorDao;
import com.hnsic.dao.RepairerDao;
import com.hnsic.dao.StudentDao;
import com.hnsic.daoimpl.AdminDaoimpl;
import com.hnsic.daoimpl.InstructorDaoimpl;
import com.hnsic.daoimpl.RepairerDaoimpl;
import com.hnsic.daoimpl.StudentDaoimpl;
import com.hnsic.entity.Admin;
import com.hnsic.entity.Instructor;
import com.hnsic.entity.Repairer;
import com.hnsic.entity.Student;



public class login extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//���ܱ��ύ����������
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			String UserName=request.getParameter("UserName");
			String password=request.getParameter("password");
			
			//��ȡҪ��¼�����
			String type=request.getParameter("type");
			String type1="ѧ��";
			String type2="����Ա";
			String type3="�������Ա";
		//	String type4="����";
			
			
			//ʹ��ALTER������ʾ��Ϣ����ֹ���롣
			String CONTENT_TYPE = "text/html; charset=GBK";
			response.setContentType(CONTENT_TYPE);			
			PrintWriter out=response.getWriter();     //��ʼ��out����
			
			if(type.equals(type1)){				//ѧ����¼
					//������װ�ص�Javabean
					Student student=new Student();
					student.setStuID(UserName);
					student.setPassword(password);	
					
					//��������Dao��
					StudentDao studentDao=new StudentDaoimpl();	
					
					System.out.println(UserName);
					System.out.println(password);
		
					boolean flag=studentDao.Login(student);
					
					//Ӧ�� session����bean��Ϣ		
					HttpSession session=request.getSession();
					session.setAttribute("student",student);
					
					//��¼�ɹ���ת����ϵͳҳ�棬��������ʾ������Ϣ��
					if(flag){
					//response.sendRedirect("/dormitory/student/loginsuccess.jsp");
						response.sendRedirect("/dormitory/StudentMainPage.html");
						
						}else{					
							if(student.getRemarks().equals("1")){
								out.print("<script language='javascript'>alert('�������!!');window.location.href='/dormitory/LoginPage.html';</script>");   
							}
							else{
								out.print("<script language='javascript'>alert('�û���������!!');window.location.href='/dormitory/LoginPage.html';</script>");            
							}						
					}					
			}
			else if(type.equals(type2)){             //����Ա��¼
				//������װ�ص�Javabean				
				Instructor instructor=new Instructor();
				instructor.setInstructorID(UserName);
				instructor.setPassword(password);
				
				//��������Dao��
				InstructorDao instructorDao=new InstructorDaoimpl();
				
				System.out.println(UserName);
				System.out.println(password);
				
				//����instructorDao��Login()����
				boolean flag=instructorDao.Login(instructor);
				
				//Ӧ�� session����bean��Ϣ		
				HttpSession session=request.getSession();
				session.setAttribute("instructor",instructor);
				
				//��¼�ɹ���ת����ϵͳҳ�棬��������ʾ������Ϣ��
				if(flag){
					//response.sendRedirect("/dormitory/instructor/loginsuccess.jsp");
					response.sendRedirect("/dormitory/InstructorMainPage.html");
					}else{					
						if(instructor.getRemarks().equals("1")){
							out.print("<script language='javascript'>alert('�������!!');window.location.href='/dormitory/LoginPage.html';</script>");   
						}
						else{
							out.print("<script language='javascript'>alert('�û���������!!');window.location.href='/dormitory/LoginPage.html';</script>");            
						}						
				}					
				
				
				}else if(type.equals(type3)){              //�������Ա��¼
					//������װ�ص�Javabean
					Admin admin=new Admin();
					admin.setAdminID(UserName);
					admin.setPassword(password);
					
					AdminDao adminDao=new AdminDaoimpl();
					
					System.out.println(UserName);
					System.out.println(password);
					
					boolean flag=adminDao.Login(admin);
					
					//Ӧ�� session����bean��Ϣ		
					HttpSession session=request.getSession();
					session.setAttribute("admin",admin);
					
					//��¼�ɹ���ת����ϵͳҳ�棬��������ʾ������Ϣ��
					if(flag){
						response.sendRedirect("/dormitory/AdminMainPage.html");
						}else{					
							if(admin.getRemarks().equals("1")){
								out.print("<script language='javascript'>alert('�������!!');window.location.href='/dormitory/LoginPage.html';</script>");   
							}
							else{
								out.print("<script language='javascript'>alert('�û���������!!');window.location.href='/dormitory/LoginPage.html';</script>");            
							}			
						}	
				}else{              						//������Ա��¼
					//������װ�ص�Javabean
					Repairer repairer=new Repairer();
					repairer.setRepairerID(UserName);
					repairer.setPassword(password);
					
					RepairerDao repairerDao=new RepairerDaoimpl();
					
					System.out.println(UserName);
					System.out.println(password);
					
					boolean flag=repairerDao.Login(repairer);
					
					//Ӧ�� session����bean��Ϣ		
					HttpSession session=request.getSession();
					session.setAttribute("repairer",repairer);
					
					//��¼�ɹ���ת����ϵͳҳ�棬��������ʾ������Ϣ��
					if(flag){
						response.sendRedirect("/dormitory/RepairerMainPage.html");
						}else{					
							if(repairer.getRemarks().equals("1")){
								out.print("<script language='javascript'>alert('�������!!');window.location.href='/dormitory/LoginPage.html';</script>");   
							}
							else{
								out.print("<script language='javascript'>alert('�û���������!!');window.location.href='/dormitory/LoginPage.html';</script>");            
							}				
						}
				}
		}	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
