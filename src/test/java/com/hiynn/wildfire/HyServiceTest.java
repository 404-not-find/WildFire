package com.hiynn.wildfire;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = "classpath:root-context.xml")
@Component
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class HyServiceTest {

	@Autowired
	private HyService hyService;
	
	@Autowired
	private Neo4jTemplate template;

	@Test
    public void shouldAllowDirectOntologyCreation() {
		System.out.println("here1");
//		hyService.deleteAll();
		System.out.println("here2");
//		assertEquals(0, hyService.getNumberOfOntologies());
		Ontology myOntology = hyService.createOntology(11L, "娑ㄤ环", "鎻忚堪鐖哥埜", "绠?О");
        assertEquals(2, hyService.getNumberOfOntologies());
        
        Iterable<Ontology> foundOntologies = hyService.getAllOntologies();
        Ontology mine = foundOntologies.iterator().next();
        assertEquals(myOntology.getName(), mine.getName());
    }
	
	
	@Test
	public void shouldFindOntologiesById() {
		Ontology o2 = hyService.createOntology(13L, "吗", "鎻忚堪2", "绠?О2");
		Ontology o3 = hyService.createOntology(14L, "鍚嶇О3", "鎻忚堪3", "绠?О3");
	  o2.addConnectTo(o3);
	  template.save(o2);
      for(Ontology ontology : hyService.getAllOntologies()) {
      	Ontology foundOntology = hyService.findOntologyById(ontology.getId());
          assertNotNull(foundOntology);
//          System.out.println(foundOntology);
          System.out.println(hyService.findOntologyByOntologyId(13l));
      }
	}
  
	@Test
	  public void shouldHaveCorrectNumberOfWorlds() {
	      assertEquals(3, hyService.getNumberOfOntologies());
	  }

	@Test
	public void shouldNotFindByOntologyId() {
		Ontology nobody = hyService.findOntologyByOntologyId(22L);
		assertNull(nobody);
	}



}
