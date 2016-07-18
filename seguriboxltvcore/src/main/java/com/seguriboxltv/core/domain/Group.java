package com.seguriboxltv.core.domain;
// Generated Jun 17, 2016 5:59:38 PM by Hibernate Tools 4.3.1.Final


import java.math.BigDecimal;
import java.util.Date;


public class Group{

	private short groupId;
	private BigDecimal createdByUserId;
	private String groupName;
	private String description;
	private Boolean isActive;
	private Date referenceDate;
	private byte profileType;
	private boolean preconfigured;
	private short areaId;
	private Date deactivatedDate;
	private Integer deactivatedByUserId;


	public Group() {
	}


	public Group(short groupId, BigDecimal createdByUserId, String groupName, String description, Boolean isActive,
			Date referenceDate, byte profileType, boolean preconfigured, short areaId, Date deactivatedDate,
			Integer deactivatedByUserId) {
		super();
		this.groupId = groupId;
		this.createdByUserId = createdByUserId;
		this.groupName = groupName;
		this.description = description;
		this.isActive = isActive;
		this.referenceDate = referenceDate;
		this.profileType = profileType;
		this.preconfigured = preconfigured;
		this.areaId = areaId;
		this.deactivatedDate = deactivatedDate;
		this.deactivatedByUserId = deactivatedByUserId;
	}


	public short getGroupId() {
		return groupId;
	}


	public void setGroupId(short groupId) {
		this.groupId = groupId;
	}


	public BigDecimal getCreatedByUserId() {
		return createdByUserId;
	}


	public void setCreatedByUserId(BigDecimal createdByUserId) {
		this.createdByUserId = createdByUserId;
	}


	public String getGroupName() {
		return groupName;
	}


	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}


	public Date getReferenceDate() {
		return referenceDate;
	}


	public void setReferenceDate(Date referenceDate) {
		this.referenceDate = referenceDate;
	}


	public byte getProfileType() {
		return profileType;
	}


	public void setProfileType(byte profileType) {
		this.profileType = profileType;
	}


	public boolean isPreconfigured() {
		return preconfigured;
	}


	public void setPreconfigured(boolean preconfigured) {
		this.preconfigured = preconfigured;
	}


	public short getAreaId() {
		return areaId;
	}


	public void setAreaId(short areaId) {
		this.areaId = areaId;
	}


	public Date getDeactivatedDate() {
		return deactivatedDate;
	}


	public void setDeactivatedDate(Date deactivatedDate) {
		this.deactivatedDate = deactivatedDate;
	}


	public Integer getDeactivatedByUserId() {
		return deactivatedByUserId;
	}


	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", createdByUserId=" + createdByUserId + ", groupName=" + groupName
				+ ", description=" + description + ", isActive=" + isActive + ", referenceDate=" + referenceDate
				+ ", profileType=" + profileType + ", preconfigured=" + preconfigured + ", areaId=" + areaId
				+ ", deactivatedDate=" + deactivatedDate + ", deactivatedByUserId=" + deactivatedByUserId + "]";
	}


	public void setDeactivatedByUserId(Integer deactivatedByUserId) {
		this.deactivatedByUserId = deactivatedByUserId;
	}

	
}