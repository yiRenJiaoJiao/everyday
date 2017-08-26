package com.erveryDayUse.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private String role;
	private Double adoption;
	private Integer crewNum;
	private Timestamp registerTime;
	private Set consumes = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String password, String role, Double adoption,
			Integer crewNum, Timestamp registerTime) {
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.adoption = adoption;
		this.crewNum = crewNum;
		this.registerTime = registerTime;
	}

	/** full constructor */
	public User(String userName, String password, String role, Double adoption,
			Integer crewNum, Timestamp registerTime, Set consumes) {
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.adoption = adoption;
		this.crewNum = crewNum;
		this.registerTime = registerTime;
		this.consumes = consumes;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Double getAdoption() {
		return this.adoption;
	}

	public void setAdoption(Double adoption) {
		this.adoption = adoption;
	}

	public Integer getCrewNum() {
		return this.crewNum;
	}

	public void setCrewNum(Integer crewNum) {
		this.crewNum = crewNum;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public Set getConsumes() {
		return this.consumes;
	}

	public void setConsumes(Set consumes) {
		this.consumes = consumes;
	}

}