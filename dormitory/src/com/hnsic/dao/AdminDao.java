package com.hnsic.dao;

import java.util.List;

import com.hnsic.entity.Absent;
import com.hnsic.entity.Admin;
import com.hnsic.entity.Grade;

public interface AdminDao {
	public boolean Login(Admin admin);				//�������Ա��¼
	public boolean record(Grade grade);				//��¼ѧ�����ҿ۷����
	public List<Grade> getgrade(String dormID,String roomID);	//��ѯѧ�����ҿ۷����
	public List<Grade> getAllgrade();				//��ѯ����ѧ�����ҿ۷����
	public boolean absent(Absent absent);			//��¼ѧ��ȱ�����
	public List<Absent> getAbsent();				//��ѯѧ��ȱ�����
	public List<Admin> getAdmin(String adminID);	//��ѯ������Ϣ
	public boolean change(Admin admin);				//�޸�����
}
