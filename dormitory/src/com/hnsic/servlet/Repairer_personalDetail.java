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
import com.hnsic.entity.Repairer;

public class Repairer_personalDetail extends HttpServlet {
	//����ά����Ա�鿴������Ϣ
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		
		//��ȡ�����session�е�repairerID
		Repairer repairer=(Repairer)session.getAttribute("repairer");
		String repairerID=repairer.getRepairerID();
		
		System.out.println(repairer);
		try{			
			//�½���������
			RepairerDao repairerDao=new RepairerDaoimpl();
			//���ò�ѯ����
			List<Repairer> list=repairerDao.getRepairer(repairerID);
			//���������Ự��
			request.setAttribute("list12", list);
			request.getRequestDispatcher("repairer/repairer_personalDetail.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
