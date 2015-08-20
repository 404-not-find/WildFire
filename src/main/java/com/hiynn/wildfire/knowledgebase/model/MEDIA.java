package com.hiynn.wildfire.knowledgebase.model;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class MEDIA extends OBJECT {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9212751884485805507L;

	private String cnName;
	
	private String enName;
	private String description;
	/**
	 * 存储路径,保存在hdfs系统中
	 */
	private String storagePath;
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
	public String getStoragePath() {
		return storagePath;
	}
	public void setStoragePath(String storagePath) {
		this.storagePath = storagePath;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnName == null) ? 0 : cnName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((enName == null) ? 0 : enName.hashCode());
		result = prime * result
				+ ((storagePath == null) ? 0 : storagePath.hashCode());
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
		MEDIA other = (MEDIA) obj;
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
		if (storagePath == null) {
			if (other.storagePath != null)
				return false;
		} else if (!storagePath.equals(other.storagePath))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MEDIA [cnName=" + cnName + ", enName=" + enName
				+ ", description=" + description + ", storagePath="
				+ storagePath + "]";
	}
	
}
