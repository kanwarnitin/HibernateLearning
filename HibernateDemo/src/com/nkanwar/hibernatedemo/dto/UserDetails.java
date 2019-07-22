package com.nkanwar.hibernatedemo.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	
	@OneToMany
	@JoinTable(name="USER_VEHICLE", joinColumns=@JoinColumn(name="USER_ID"), inverseJoinColumns=@JoinColumn(name="VEHICLE_ID"))
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	public UserDetails(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	public UserDetails() {}
	
	
}
