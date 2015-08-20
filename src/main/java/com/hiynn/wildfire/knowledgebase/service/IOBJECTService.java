package com.hiynn.wildfire.knowledgebase.service;

import org.springframework.data.neo4j.conversion.Result;

import com.hiynn.wildfire.knowledgebase.model.OBJECT;

public interface IOBJECTService {
	OBJECT save(OBJECT obj);
	void delete(Long id);
	OBJECT findById(Long id);
	Result<OBJECT> findAll();

}
