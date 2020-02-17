package com.hnsic.until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class Datebase {
		private String driver="com.mysql.cj.jdbc.Driver";
		private String url="jdbc:mysql://localhost:3306/dormitorydb?useSSL=false&serverTimezone=UTC";
		private String user="root";
		private String pwd="123456";
		Connection conn=null;	
		//������ȡ���Ӷ���ķ���
		public Connection getConn(){
			Connection conn=null;		
			try {
				//1����������
				Class.forName(driver);
				System.out.println("���������ɹ���");
				//2���������Ӷ���
				conn=DriverManager.getConnection(url,user,pwd);
				System.out.println("�������ݿ�ɹ���");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return conn;
			
		}
	/*	public static void main(String[] args){
				
			try {
	         
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("�������سɹ�");
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dormitorydb?useSSL=false&serverTimezone=UTC","root","123456"); 
	            System.out.println("���ݿ����ӳɹ�");
			} catch (ClassNotFoundException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	
		}*/
		
		//�����Դ�ķ���
		public void closeAll(ResultSet rs,Statement stmt,Connection conn){
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		//��װ��ɾ�Ĳ����ķ���
		public int update(String sql){
			int i=0;
			//1/2�õ����Ӷ���
			Connection conn=getConn();
			//3 ����SQL��䣬�õ����
			Statement stmt=null;
			try {
				stmt=conn.createStatement();
				i=stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//5 �����Դ
			closeAll(null,stmt,conn);
			return i;
		}
		
		//��װ��ɾ�Ĳ����ķ���
		public int update(String sql,Object[]params){
			int i=0;
			//1/2�õ����Ӷ���
			Connection conn=getConn();
			//3 ����SQL��䣬�õ����
			PreparedStatement stmt=null;
			try {
				stmt=conn.prepareStatement(sql);
				for(int n=0;n<params.length;n++){
					stmt.setObject(n+1, params[n]);
				}			
				i=stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//5 �����Դ
			closeAll(null,stmt,conn);
			return i;
		}
	}



