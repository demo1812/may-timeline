package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Harshit {

	@Id
	private String aname;
	private String apass;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	@Override
	public String toString() {
		return "Harshit [aname=" + aname + ", apass=" + apass + "]";
	}
	
}
