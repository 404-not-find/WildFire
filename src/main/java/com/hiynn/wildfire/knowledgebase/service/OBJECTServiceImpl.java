package com.hiynn.wildfire.knowledgebase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.conversion.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hiynn.wildfire.knowledgebase.dao.IOBJECTRepository;
import com.hiynn.wildfire.knowledgebase.model.OBJECT;
@Service
@Transactional
public class OBJECTServiceImpl implements IOBJECTService {

	@Autowired
	private IOBJECTRepository objectRepository;
	
	@Override
	public OBJECT save(OBJECT obj) {
		return objectRepository.save(obj);
	}

	public void delete(OBJECT obj) {
		objectRepository.delete(obj);
	}

	@Override
	public OBJECT findById(Long id) {
		return objectRepository.findOne(id);
	}

	@Override
	public Result<OBJECT> findAll() {
		return objectRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		objectRepository.delete(id);
	}

}
