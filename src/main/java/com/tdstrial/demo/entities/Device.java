/**
 * 
 */
package com.tdstrial.demo.entities;

import java.util.Set;

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
 * Device Entity
 */
@Entity
@Table(name="device")
public class Device {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String deviceId;
	@Column
	private String deviceType;
	@Column
	private String os;
	@Column
	private String metaTag;
	@Column(name = "user_id")
	private Long user;
	
	/*
	 * Fetch Type EAGER to retrieve esims attached to the device.
	 */	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "device")
	private Set<ESim> esim;
	
	public Set<ESim> getEsim() {
		return esim;
	}
	public void setEsim(Set<ESim> esim) {
		this.esim = esim;
	}
	
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
		this.user = user;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMetaTag() {
		return metaTag;
	}
	public void setMetaTag(String metaTag) {
		this.metaTag = metaTag;
	}
	

}
