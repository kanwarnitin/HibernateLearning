package com.nkanwar.hibernatedemo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehiceId;
	private String vehicleName;
	
	@ManyToOne
	private UserDetails user;
	
	public int getVehiceId() {
		return vehiceId;
	}
	public void setVehiceId(int vehiceId) {
		this.vehiceId = vehiceId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	public UserDetails getUser() {
		return user;
	}
	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	public Vehicle(int vehiceId, String vehicleName) {
		this.vehiceId = vehiceId;
		this.vehicleName = vehicleName;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

}
