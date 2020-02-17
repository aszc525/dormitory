package com.hnsic.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.hnsic.dao.RepairerDao;
import com.hnsic.daoimpl.RepairerDaoimpl;
import com.hnsic.entity.Repair;

public class Repairer_queryGZ extends HttpServlet {
	//��ѯά����Ϣ
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			//�½���������
			//QueryGZDao queryGZDao=new QueryGZDaoimpl();
			RepairerDao repairerDao=new RepairerDaoimpl();
			
			//���ò�ѯ����
			//List<Repair> list=queryGZDao.getAllRepair();
			List<Repair> list=repairerDao.getAllRepair();
			
			//���������Ự��				
			HttpSession session=request.getSession();
			session.setAttribute("list13", list);
			response.sendRedirect("/dormitory/repairer/repairer_looksmessage.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
