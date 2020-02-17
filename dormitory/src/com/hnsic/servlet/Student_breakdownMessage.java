package com.hnsic.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnsic.dao.StudentDao;
import com.hnsic.daoimpl.StudentDaoimpl;
import com.hnsic.entity.Repair;



public class Student_breakdownMessage extends HttpServlet {
	//ѧ���걨����
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	//�걨����
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			//���ܱ��ύ����������
			String repairID=request.getParameter("repairID");
			String time=request.getParameter("time");		
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//����ת���Ĺ���
		
			//Date times=sdf.format(time);
			System.out.println(time);
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String dormID=request.getParameter("dormID");
			String roomID=request.getParameter("roomID");
			String GZmiaoshu=request.getParameter("GZmiaoshu");
			
			//������װ�ص�JavaBean
			Repair repair=new Repair();
			repair.setRepairID(repairID);
			repair.setTimes(time);
			repair.setName(name);
			repair.setPhone(phone);
			repair.setDormID(dormID);
			repair.setRoomID(roomID);
			repair.setGZmiaoshu(GZmiaoshu);
			
			//��������Dao��
			//RepairDao repairDao=new RepairDaoimpl();
			//boolean flag=repairDao.add(repair);
			StudentDao studentDao=new StudentDaoimpl();
			boolean flag=studentDao.add(repair);

			if(flag){
				response.sendRedirect("/dormitory/student/addsuccess.jsp");
			}else{
				response.sendRedirect("/dormitory/student/addfail.jsp");
	}
			
			 
			
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
doGet(request,response);
	}

}
