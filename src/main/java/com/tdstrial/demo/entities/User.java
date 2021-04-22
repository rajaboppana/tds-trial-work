/**
 * 
 */
package com.tdstrial.demo.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Raja
 *
 * TDSoftware trial
 * 
 * User Entity
 */

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private boolean isActive;
	
	/*
	 * Fetch Type EAGER to retrieve devices belonging to the User
	 */	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL,
	        orphanRemoval = true)
	private Set<Device> device;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the devices
	 */
	public Set<Device> getDevice() {
		return device;
	}
	/**
	 * @param devices the devices to set
	 */
	public void setDevice(Set<Device> device) {
		this.device = device;
	}
	
	

}
