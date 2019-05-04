package com.cg.TraineeManagementSystem.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id
	private int traineeId;
	private String traineeName;
	private String traineeLocation;
	private String traineeDomain;
	public int getId() {
		return traineeId;
	}
	public void setId(int id) {
		this.traineeId = id;
	}
	public String getName() {
		return traineeName;
	}
	public void setName(String name) {
		this.traineeName = name;
	}
	public String getLocation() {
		return traineeLocation;
	}
	public void setLocation(String location) {
		this.traineeLocation = location;
	}
	public String getDomain() {
		return traineeDomain;
	}
	public void setDomain(String domain) {
		this.traineeDomain = domain;
	}
}
