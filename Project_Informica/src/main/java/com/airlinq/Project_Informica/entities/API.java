package com.airlinq.Project_Informica.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * This class API is an entity class used to store data
 * in the same format present in the database API table. 
 * Its an entity class.
 * 
 * @author Mahi Kumawat
 * @version 1.0
 */

@Entity
@Table(name="api")
public class API {
	
	@Id
	@Column(name="api_id")
	private int api_id;
	
	@Column(name="api_name")
	private String api_name;
	
	@Column(name="api_description")
	private String api_description;
	
	/**
	 * Adds one to many mapping.
	 */
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="api_id", referencedColumnName = "api_id", foreignKey = @ForeignKey(name="fk_apiID_ramapping"))
	private List<RolesAPIMapping> rolesApiMapping;

	public API() {
		super();
		// TODO Auto-generated constructor stub
	}

	public API(int api_id, String api_name, String api_description) {
		super();
		this.api_id = api_id;
		this.api_name = api_name;
		this.api_description = api_description;
	}

	public int getApi_id() {
		return api_id;
	}

	public void setApi_id(int api_id) {
		this.api_id = api_id;
	}

	public String getApi_name() {
		return api_name;
	}

	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}

	public String getApi_description() {
		return api_description;
	}

	public void setApi_description(String api_description) {
		this.api_description = api_description;
	}

	
	
	
	

}
