package com.hnsic.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hnsic.dao.RepairerDao;
import com.hnsic.entity.Repair;
import com.hnsic.entity.Repairer;
import com.hnsic.until.Datebase;

public class RepairerDaoimpl implements RepairerDao{

	public boolean Login(Repairer repairer) {        //����ά����Ա��¼
		boolean flag=false;
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		String sql="select * from Repairer where repairerID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1, repairer.getRepairerID());
			rs=prst.executeQuery();	
			if(rs.next()){
				String realpassword=rs.getString(2);
				
				if(repairer.getPassword().equals(realpassword.trim())){
					//��½�ɹ�
					flag=true;
					}else{					
					  //�������
						repairer.setRemarks("1");				
						}
				}
			else{
				repairer.setRemarks("2");//�û��������ڣ����������롣					
				}	
			
		}catch(SQLException e){
			e.printStackTrace();
		}		
		return flag;	
	}

	
	public List<Repairer> getRepairer(String repairerID) {	//����ά����Ա��ѯ������Ϣ
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		
		List<Repairer> list=new ArrayList<Repairer>();
		String sql="select * from Repairer where repairerID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1,repairerID);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				
				//����bean����
				Repairer repairer=new Repairer();
				
				//������װ�ؽ�Bean����
				repairer.setRepairerID(rs.getString(1));
				repairer.setPassword(rs.getString(2));
				repairer.setName(rs.getString(3));
				repairer.setSex(rs.getString(4));
				repairer.setPhone(rs.getString(5));
				repairer.setRemarks(rs.getString(6));
				
				list.add(repairer);
										
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

	
	public boolean change(Repairer repairer) {				//�޸�����
		boolean flag=false;
		Connection conn=null;
		PreparedStatement prst=null;
		String sql="update Repairer set password=? where repairerID=?";
		//�������ݿ�
		Datebase datebase=new Datebase();
		//�����ݲ������ݿ�
		try{		
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			System.out.println(repairer.getRepairerID()+repairer.getPassword());
			
			prst.setString(1,repairer.getPassword());
			prst.setString(2,repairer.getRepairerID());
			int n=prst.executeUpdate();
			System.out.println(n);
			if(n>0)
				flag=true;
		}catch(SQLException e){
			e.printStackTrace();
			return flag;
		}	
		return flag;
	}


	
	public List<Repair> getAllRepair() {					//�鿴��ά����Ϣ
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		List<Repair> list=new ArrayList<Repair>();
		String sql="select * from Repair";
		//��ȡ���ݿ�����
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				
				//����bean����
				Repair repair=new Repair();
				
				//������װ�ؽ�Bean����
				repair.setRepairID(rs.getString(1));
				repair.setName(rs.getString(2));
				repair.setPhone(rs.getString(3));
				repair.setTimes(rs.getString(4));
				repair.setDormID(rs.getString(5));
				repair.setRoomID(rs.getString(6));
				repair.setGZmiaoshu(rs.getString(7));
				repair.setRemarks(rs.getString(8));			
				list.add(repair);								
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}

}
