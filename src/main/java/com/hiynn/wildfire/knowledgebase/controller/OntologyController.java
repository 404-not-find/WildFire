package com.hiynn.wildfire.knowledgebase.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hiynn.wildfire.knowledgebase.model.ENTITY;
import com.hiynn.wildfire.knowledgebase.model.OBJECT;
import com.hiynn.wildfire.knowledgebase.service.IOBJECTService;

@Controller
@RequestMapping(value="/knowledgebase")
public class OntologyController {

	@Autowired
	private IOBJECTService objectService;
	
	
	ObjectMapper mapper = new ObjectMapper();
	
	@RequestMapping(value="/main")
	public String homepage(){
		return "index";
	}
	
	@RequestMapping(value="/ontology/entityCreate",method=RequestMethod.POST)
	@ResponseBody
	public ENTITY createEntityAction(@RequestBody String body,HttpServletRequest request, HttpServletResponse response){
		
		ENTITY entity = new ENTITY();
		try {
			String jsonStr = URLDecoder.decode(body,"UTF-8");
			System.out.println(jsonStr);
			entity = mapper.readValue(jsonStr,ENTITY.class);
			entity = (ENTITY)objectService.save(entity);
			
			return entity;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entity;
		
	}
}
