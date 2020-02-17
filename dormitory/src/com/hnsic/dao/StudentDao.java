package com.hnsic.dao;

import java.util.List;


import com.hnsic.entity.Grade;
import com.hnsic.entity.Repair;
import com.hnsic.entity.Student;



public interface StudentDao {
	public boolean Login(Student student);    		//ѧ����¼
	public List<Student> getstudent(String stuID);  //�鿴ѧ����Ϣ
	public List<Grade> getgrade(String dormID,String roomID);		//�鿴���ҿ۷����
	public boolean change(Student student);			//�޸�����
	public List<Repair> getAllRepair();				//��ѯ���й��ϾS����Ϣ
	public boolean add(Repair repair);				//�����걨
}
