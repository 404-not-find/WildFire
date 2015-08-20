package com.hiynn.wildfire.knowledgebase.model;

import java.io.Serializable;

public class RELATIONSHIP implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6035422181953380744L;
	private String cnName;
	/**
	 * 用英文名作为唯一键关联
	 */
	private String enName;
	private String description;
	private OBJECT from;
	private OBJECT to;
	/**
	 * 关联类型
	 */
	private String relationshipType;
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
	public OBJECT getFrom() {
		return from;
	}
	public void setFrom(OBJECT from) {
		this.from = from;
	}
	public OBJECT getTo() {
		return to;
	}
	public void setTo(OBJECT to) {
		this.to = to;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime
				* result
				+ ((relationshipType == null) ? 0 : relationshipType.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RELATIONSHIP other = (RELATIONSHIP) obj;
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
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (relationshipType == null) {
			if (other.relationshipType != null)
				return false;
		} else if (!relationshipType.equals(other.relationshipType))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RELATIONSHIP [cnName=" + cnName + ", enName=" + enName
				+ ", description=" + description + ", from=" + from + ", to="
				+ to + ", relationshipType=" + relationshipType + "]";
	}
	
}
