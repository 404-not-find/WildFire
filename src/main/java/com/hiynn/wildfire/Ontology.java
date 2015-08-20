package com.hiynn.wildfire;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.*;

import java.util.Set;

@NodeEntity
public class Ontology {
	private final static String CONNECT_TO = "CONNECT_TO";
    @GraphId
    private Long id;

    // Uses default schema based index
    @Indexed
    private Long ontologyId;
    
    private String name;
    private String description;
    private String shortName;
 
    @Fetch
    @RelatedTo(type = CONNECT_TO, direction = Direction.BOTH)
    private Set<Ontology> connectTo;

    public Ontology(Long ontologyId, String name, String description, String shortName) {
        this.ontologyId = ontologyId;
        this.name = name;
        this.description = description;
        this.shortName = shortName;
    }

    public Ontology() {
    }

    public Long getId() {
    	return id;
    }
    
    public Long getOntologyId() {
    	return ontologyId;
    }

    public String getName() {
        return name;
    }

    public String getdescription() {
        return description;
    }

    public String getShortName() {
        return shortName;
    }

    public void addConnectTo(Ontology otherOntology) {
    	connectTo.add(otherOntology);
    }
    
    public boolean canBeConnected(Ontology otherOntology) {
    	return connectTo.contains(otherOntology);
    }

	@Override
	public int hashCode() {
        return (id == null) ? 0 : id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Ontology other = (Ontology) obj;
		if (id == null) return other.id == null;
        return id.equals(other.id);
    }
	
	@Override
    public String toString() {
        return String.format("Ontology{ontologyId=%d, name='%s', description='%s', shortName='%s'}", ontologyId,name, description, shortName);
    }
}
