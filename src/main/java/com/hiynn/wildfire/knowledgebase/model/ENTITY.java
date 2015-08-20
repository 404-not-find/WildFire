package com.hiynn.wildfire.knowledgebase.model;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;
@NodeEntity
public class ENTITY extends OBJECT {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6904071453963245762L;
	private String cnName;
	/**
	 * 用英文名作为唯一键关联
	 */
	private String enName;
	private String description;

	/**
	 * 父ENTITY
	 */
	private Set<ENTITY> parentENTITY;
	/**
	 * 子ENTITY
	 */
	private Set<ENTITY> childrenENTITY;
	/**
	 * 本体标识，1:本体；0:领域
	 */
	private int ifOntology;
	
	public Set<ENTITY> getParentENTITY() {
		return parentENTITY;
	}
	public void setParentENTITY(Set<ENTITY> parentENTITY) {
		this.parentENTITY = parentENTITY;
	}
	public Set<ENTITY> getChildrenENTITY() {
		return childrenENTITY;
	}
	public void setChildrenENTITY(Set<ENTITY> childrenENTITY) {
		this.childrenENTITY = childrenENTITY;
	}
	
	public int getIfOntology() {
		return ifOntology;
	}
	public void setIfOntology(int ifOntology) {
		this.ifOntology = ifOntology;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((childrenENTITY == null) ? 0 : childrenENTITY.hashCode());
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
		result = prime * result + ifOntology;
		result = prime * result
				+ ((parentENTITY == null) ? 0 : parentENTITY.hashCode());
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
		ENTITY other = (ENTITY) obj;
		if (childrenENTITY == null) {
			if (other.childrenENTITY != null)
				return false;
		} else if (!childrenENTITY.equals(other.childrenENTITY))
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
		if (ifOntology != other.ifOntology)
			return false;
		if (parentENTITY == null) {
			if (other.parentENTITY != null)
				return false;
		} else if (!parentENTITY.equals(other.parentENTITY))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ENTITY [cnName=" + cnName + ", enName=" + enName
				+ ", description=" + description + ", parentENTITY="
				+ parentENTITY + ", childrenENTITY=" + childrenENTITY
				+ ", ifOntology=" + ifOntology + "]";
	}
	
}
