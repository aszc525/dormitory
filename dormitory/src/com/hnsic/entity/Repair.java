package com.hnsic.entity;

public class Repair {
	private String repairID;	//ά�ޱ��
	private String name;		//����
	private String phone;		//�绰����
	private String times;		//�걨ά��ʱ��
	private String dormID; 		//���Һ�
	private String roomID;		//�����
	private String GZmiaoshu;	//��������
	private String remarks;		//��ע
	
	
	public String getRepairID() {
		return repairID;
	}
	public void setRepairID(String repairID) {
		this.repairID = repairID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getDormID() {
		return dormID;
	}
	public void setDormID(String dormID) {
		this.dormID = dormID;
	}
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	public String getGZmiaoshu() {
		return GZmiaoshu;
	}
	public void setGZmiaoshu(String gZmiaoshu) {
		GZmiaoshu = gZmiaoshu;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}	
	
}
