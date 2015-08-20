package com.hiynn.wildfire.knowledgebase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.hiynn.wildfire.knowledgebase.model.ENTITY;
import com.hiynn.wildfire.knowledgebase.model.OBJECT;
import com.hiynn.wildfire.knowledgebase.service.IOBJECTService;

@Component
@ContextConfiguration(locations = "classpath:context.xml")
@RunWith(SpringJUnit4ClassRunner.class)  
@Transactional
public class OBJECTServiceTest {

	@Autowired
	private IOBJECTService objectService;
	
	@Autowired
	private Neo4jTemplate template;

	@Test
	@Rollback(false)
    public void testSaveOrUpdate() {
		System.out.println("here1");
//		hyService.deleteAll();
		System.out.println("here2");
//		assertEquals(0, hyService.getNumberOfOntologies());
		
		ENTITY entity = new ENTITY();
//		entity.setId(10L);
		entity.setCnName("实体1");
		entity.setDescription("实体描述");
		entity.setEnName("enndnnd");
		
		OBJECT obj = new OBJECT();
		obj.setName("aa的举动");
		
		obj = objectService.save(entity);
		if (obj.getClass() == ENTITY.class) {
			ENTITY ee = (ENTITY) obj;
			System.out.println("1: "+ee);
		}
		System.out.println("2: "+obj);
		
//		obj =  objectService.findById(2L);
//		
//		System.out.println("2:  "+obj);
//		assertEquals("实体", entity.getCnName());
//		Ontology myOntology = hyService.createOntology(11L, "娑ㄤ环", "鎻忚堪鐖哥埜", "绠?О");
//        assertEquals(2, hyService.getNumberOfOntologies());
//        
//        Iterable<Ontology> foundOntologies = hyService.getAllOntologies();
//        Ontology mine = foundOntologies.iterator().next();
//        assertEquals(myOntology.getName(), mine.getName());
    }
	
	
//	@Test
//	public void shouldFindOntologiesById() {
//		Ontology o2 = hyService.createOntology(13L, "吗", "鎻忚堪2", "绠?О2");
//		Ontology o3 = hyService.createOntology(14L, "鍚嶇О3", "鎻忚堪3", "绠?О3");
//	  o2.addConnectTo(o3);
//	  template.save(o2);
//      for(Ontology ontology : hyService.getAllOntologies()) {
//      	Ontology foundOntology = hyService.findOntologyById(ontology.getId());
//          assertNotNull(foundOntology);
////          System.out.println(foundOntology);
//          System.out.println(hyService.findOntologyByOntologyId(13l));
//      }
//	}
//  
//	@Test
//	  public void shouldHaveCorrectNumberOfWorlds() {
//	      assertEquals(3, hyService.getNumberOfOntologies());
//	  }
//
//	@Test
//	public void shouldNotFindByOntologyId() {
//		Ontology nobody = hyService.findOntologyByOntologyId(22L);
//		assertNull(nobody);
//	}



}
