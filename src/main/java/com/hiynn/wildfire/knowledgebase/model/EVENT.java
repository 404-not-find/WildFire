package com.hiynn.wildfire.knowledgebase.model;

import java.sql.Date;
import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;
@NodeEntity
public class EVENT extends OBJECT {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7298392772442432026L;
	/**
	 * 
	 */
	private String cnName;
	private String enName;
	private String description;
	private Date beginTime;
	private Date endTime;
	/**
	 * 事件发生地点
	 */
	private String location;
	/**
	 * 事件发生时关联的对象
	 */
	private Set<OBJECT> relationOBJECT;

	/**
	 * 父EVENT
	 */
	private Set<EVENT> parentEVENT;
	/**
	 * 子EVENT
	 */
	private Set<EVENT> childrenEVENT;
	/**
	 * 领域标识，0:本体；1:领域
	 */
	private int realmIdentification;
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<OBJECT> getRelationOBJECT() {
		return relationOBJECT;
	}
	public void setRelationOBJECT(Set<OBJECT> relationOBJECT) {
		this.relationOBJECT = relationOBJECT;
	}
	public Set<EVENT> getParentEVENT() {
		return parentEVENT;
	}
	public void setParentEVENT(Set<EVENT> parentEVENT) {
		this.parentEVENT = parentEVENT;
	}
	public Set<EVENT> getChildrenEVENT() {
		return childrenEVENT;
	}
	public void setChildrenEVENT(Set<EVENT> childrenEVENT) {
		this.childrenEVENT = childrenEVENT;
	}
	public int getRealmIdentification() {
		return realmIdentification;
	}
	public void setRealmIdentification(int realmIdentification) {
		this.realmIdentification = realmIdentification;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((beginTime == null) ? 0 : beginTime.hashCode());
		result = prime * result
				+ ((childrenEVENT == null) ? 0 : childrenEVENT.hashCode());
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result
				+ ((parentEVENT == null) ? 0 : parentEVENT.hashCode());
		result = prime * result + realmIdentification;
		result = prime * result
				+ ((relationOBJECT == null) ? 0 : relationOBJECT.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		EVENT other = (EVENT) obj;
		if (beginTime == null) {
			if (other.beginTime != null)
				return false;
		} else if (!beginTime.equals(other.beginTime))
			return false;
		if (childrenEVENT == null) {
			if (other.childrenEVENT != null)
				return false;
		} else if (!childrenEVENT.equals(other.childrenEVENT))
			return false;
		if (cnName == null) {
			if (other.cnName != null)
				return false;
		} else if (!cnName.equals(other.cnName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (enName == null) {
			if (other.enName != null)
				return false;
		} else if (!enName.equals(other.enName))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (parentEVENT == null) {
			if (other.parentEVENT != null)
				return false;
		} else if (!parentEVENT.equals(other.parentEVENT))
			return false;
		if (realmIdentification != other.realmIdentification)
			return false;
		if (relationOBJECT == null) {
			if (other.relationOBJECT != null)
				return false;
		} else if (!relationOBJECT.equals(other.relationOBJECT))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EVENT [cnName=" + cnName + ", enName=" + enName
				+ ", description=" + description + ", beginTime=" + beginTime
				+ ", endTime=" + endTime + ", location=" + location
				+ ", relationOBJECT=" + relationOBJECT + ", parentEVENT="
				+ parentEVENT + ", childrenEVENT=" + childrenEVENT
				+ ", realmIdentification=" + realmIdentification + "]";
	}
	
	
	
}
