package com.team5.myapp.hr.model;

import java.sql.Date;

public class gHistoryVO {
	private int memberId;
	private Date startDate;
	private Date endDate;
	private int groupId;
	private String groupName;
	private String roleId;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "gHistoryVO [memberId=" + memberId + ", startDate=" + startDate + ", endDate=" + endDate + ", groupId="
				+ groupId + ", groupName=" + groupName + ", roleId=" + roleId + "]";
	}
	
}
