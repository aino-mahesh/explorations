package com.ainosoft.server.dao.domain;

// Generated 12 Mar, 2015 10:51:10 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * AddressTable generated by hbm2java
 */
@Entity
@Table(name = "AddressTable", catalog = "address_book_schema")
public class AddressPojo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5979135092099654610L;
	private Long id;
	private String name;
	private String street;
	private String city;
	private String country;
	private String zip;

	public AddressPojo() {
	}

	public AddressPojo(Long id) {
		this.id = id;
	}

	public AddressPojo(Long id, String name, String street, String city,
			String country, String zip) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}
	
	public AddressPojo(String name, String street, String city,
			String country, String zip) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.country = country;
		this.zip = zip;
	}

	@Id
	@GenericGenerator(name = "id_generator",strategy = "increment")
	@GeneratedValue(generator = "id_generator")
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "street")
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "country")
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "zip")
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
