package com.hiynn.wildfire.knowledgebase.model;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class NOTE extends OBJECT {


	/**
	 * 
	 */
	private static final long serialVersionUID = -7755159513228926638L;

	private String cnName;
	
	private String enName;
	private String description;
	/**
	 * 内容
	 */
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
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
		NOTE other = (NOTE) obj;
		if (cnName == null) {
			if (other.cnName != null)
				return false;
		} else if (!cnName.equals(other.cnName))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
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
		return true;
	}
	@Override
	public String toString() {
		return "NOTE [cnName=" + cnName + ", enName=" + enName
				+ ", description=" + description + ", content=" + content + "]";
	}
	
	
}
