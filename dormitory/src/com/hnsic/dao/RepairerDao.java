package com.hnsic.dao;

import java.util.List;

import com.hnsic.entity.Repair;
import com.hnsic.entity.Repairer;

public interface RepairerDao {
	public boolean Login(Repairer repairer);//����Ա��¼	
	public List<Repairer> getRepairer(String repairerID);//��ѯ������Ϣ
	public boolean change(Repairer repairer);//�޸�����
	public List<Repair> getAllRepair();//��ѯ���й��ϾS����Ϣ
		
}
