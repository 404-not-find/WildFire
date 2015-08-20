package com.hiynn.wildfire.knowledgebase.model;

import java.io.Serializable;
import java.util.Set;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class OBJECT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 713454930573952285L;
	@GraphId
	private Long id;
	private String name;
	private Set<MEDIA> media;
	private Set<NOTE> note;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<MEDIA> getMedia() {
		return media;
	}
	public void setMedia(Set<MEDIA> media) {
		this.media = media;
	}
	public Set<NOTE> getNote() {
		return note;
	}
	public void setNote(Set<NOTE> note) {
		this.note = note;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((media == null) ? 0 : media.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
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
		OBJECT other = (OBJECT) obj;
		if (id != other.id)
			return false;
		if (media == null) {
			if (other.media != null)
				return false;
		} else if (!media.equals(other.media))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OBJECT [id=" + id + ", name=" + name + ", media=" + media
				+ ", note=" + note + "]";
	}
	
	
}
