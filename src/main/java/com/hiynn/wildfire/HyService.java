package com.hiynn.wildfire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HyService {
	
	@Autowired
	private OntologyRepository ontologyRepository;
	
	public void deleteAll() {
		ontologyRepository.deleteAll();
	}
	
	public long getNumberOfOntologies() {
		return ontologyRepository.count();
	}
	
	public Ontology createOntology(Long ontologyId, String name, String description, String shortName) {
		return ontologyRepository.save(new Ontology(ontologyId, name, description, shortName));
	}
	
	public Iterable<Ontology> getAllOntologies() {
		return ontologyRepository.findAll();
	}
	
	public Ontology findOntologyById(Long id) {
		return ontologyRepository.findOne(id);
	}

    // This is using the schema based index
	public Ontology findOntologyByOntologyId(long ontologyId) {
		return ontologyRepository.findBySchemaPropertyValue("ontologyId", ontologyId);
	}

    // This is using the legacy index
	public Iterable<Ontology> findAllByName(String name) {
		return ontologyRepository.findAllByPropertyValue("name", name);
	}
	
	public void addConnectTo(Ontology otherOntology) {
		this.addConnectTo(otherOntology);
//		ontologyRepository.save();
    }
}
