package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.demo.model.HruserJPA;

@Entity
public class Dep {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer depId;
	@Column
	private String depName;
	@ManyToOne
	private HruserJPA user;

	public Dep(String depName) {
		this.depName = depName;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public HruserJPA getUser() {
		return user;
	}

	public void setUser(HruserJPA user) {
		this.user = user;
	}

	public Dep() {
	}

	public Dep(String depName, HruserJPA user) {
		this.depName = depName;
		this.user = user;
	}
}
