package com.hnsic.dao;

import java.util.List;

import com.hnsic.entity.Absent;
import com.hnsic.entity.Grade;
import com.hnsic.entity.Instructor;
import com.hnsic.entity.Student;

public interface InstructorDao {
	public boolean Login(Instructor instructor);				//����Ա��¼
	public List<Student> getstudent(String stuID);				//�鿴ѧ����Ϣ
	public List<Instructor> getinstructor(String instructorID);	//�鿴����Ա������Ϣ��Ϣ
	public boolean change(Instructor instructor);				//�޸�����
	public List<Absent> getAbsent();							//��ѯѧ��ȱ�����
	public List<Grade> getgrade(String dormID,String roomID);	//�鿴���ҿ۷����
	
}
