package es.upm.muss.agile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

@Entity
@Table(name = "idea")
//@Indexed
//@XmlRootElement
public class Idea extends BaseObject implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 2119941907086106256L;
	
	
	public Idea() {
	}

	private Long id;
    private String title; 
    private Long category;
    private String description;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    @Column(nullable = false, length = 50, unique = true)
    @Field
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    @Column(nullable = false, unique = true)
    @Field
	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

    @Column(nullable = false, length = 500, unique = true)
    @Field
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
}
