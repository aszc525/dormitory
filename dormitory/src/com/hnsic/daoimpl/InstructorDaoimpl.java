package com.hnsic.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hnsic.dao.InstructorDao;
import com.hnsic.entity.Absent;
import com.hnsic.entity.Grade;
import com.hnsic.entity.Instructor;
import com.hnsic.entity.Student;
import com.hnsic.until.Datebase;

public class InstructorDaoimpl implements InstructorDao{

	public boolean Login(Instructor instructor) {		//����Ա��¼
		boolean flag=false;
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		String sql="select * from Instructor where instructorID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1, instructor.getInstructorID());
			rs=prst.executeQuery();	
			if(rs.next()){
				String realpassword=rs.getString(2);
				
				if(instructor.getPassword().equals(realpassword.trim())){
					//��½�ɹ�
					flag=true;
					}else{					
					  //�������
						instructor.setRemarks("1");				
						}
				}
			else{
				instructor.setRemarks("2");//�û��������ڣ����������롣					
				}	
			
		}catch(SQLException e){
			e.printStackTrace();
		}		
		return flag;	
	}
	
	

	public List<Student> getstudent(String stuID) {		//��ѯѧ����Ϣ
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		
		List<Student> list=new ArrayList<Student>();
		String sql="select * from Student where stuID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1,stuID);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				//����bean����
				Student student=new Student();
				//������װ�ؽ�Bean����
				student.setStuID(rs.getString(1));
				student.setPassword(rs.getString(2));
				student.setName(rs.getString(3));
				student.setSex(rs.getString(4));
				student.setDormID(rs.getString(5));
				student.setRoomID(rs.getString(6));
				student.setXueyuan(rs.getString(7));
				student.setMajor(rs.getString(8));
				student.setClasses(rs.getString(9));
				student.setPhone(rs.getString(10));
				student.setBirthday(rs.getString(11));
				student.setRemarks(rs.getString(12));
				list.add(student);
										
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	

	
	public List<Instructor> getinstructor(String instructorID) {	//��ѯ����Ա��Ϣ
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		
		List<Instructor> list=new ArrayList<Instructor>();
		String sql="select * from Instructor where instructorID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1,instructorID);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				//����bean����
				Instructor instructor=new Instructor();
				
				//������װ�ؽ�Bean����	
				instructor.setInstructorID(rs.getString(1));
				instructor.setPassword(rs.getString(2));
				instructor.setName(rs.getString(3));
				instructor.setSex(rs.getString(4));
				instructor.setPhone(rs.getString(5));
				instructor.setRemarks(rs.getString(6));				
				list.add(instructor);										
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}


	
	public boolean change(Instructor instructor) {		//�޸�����
		boolean flag=false;
		Connection conn=null;
		PreparedStatement prst=null;
		String sql="update Instructor set password=? where instructorID=?";
		//�������ݿ�
		Datebase datebase=new Datebase();
		//�����ݲ������ݿ�
		try{		
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			System.out.println(instructor.getInstructorID()+instructor.getPassword());
			
			prst.setString(1,instructor.getPassword());
			prst.setString(2,instructor.getInstructorID());
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



	public List<Absent> getAbsent() {		//��ѯѧ��ȱ�����
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		
		List<Absent> list=new ArrayList<Absent>();
		String sql="select * from Absent";
		//��ȡ���ݿ�����
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				//����bean����
				Absent absent=new Absent();
				
				//������װ�ؽ�Bean����
				absent.setAbsentID(rs.getString(1));
				absent.setStuID(rs.getString(2));
				absent.setName(rs.getString(3));
				absent.setDormID(rs.getString(4));
				absent.setRoomID(rs.getString(5));
				absent.setTime(rs.getString(6));
				absent.setPhone(rs.getString(7));
				absent.setRemarks(rs.getString(8));
		
				list.add(absent);								
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}



	public List<Grade> getgrade(String dormID, String roomID) {	//�鿴���ҿ۷����
		Connection conn=null;
		PreparedStatement prst=null;
		ResultSet rs=null;
		
		List<Grade> list=new ArrayList<Grade>();
		String sql="select * from Grade where dormID=? and roomID=?";
		Datebase datebase=new Datebase();
		try{
			conn=datebase.getConn();
			prst=conn.prepareStatement(sql);
			prst.setString(1,dormID);
			prst.setString(2,roomID);
			rs=prst.executeQuery();//ִ�в�ѯ
			while(rs.next()){//���������
				//����bean����		
				Grade grade=new Grade();
				
				//������װ�ؽ�Bean����
				grade.setDateID(rs.getString(1));
				grade.setTime(rs.getString(2));
				grade.setDormID(rs.getString(3));
				grade.setRoomID(rs.getString(4));
				grade.setPoints(rs.getString(5));
				grade.setScore(rs.getString(6));
				grade.setRemarks(rs.getString(7));
						
				list.add(grade);										
			}			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}	
	
	
	
}	