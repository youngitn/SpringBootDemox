package com.example.demo.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.entity.Dep;

@Entity
@Table(name = "HRUSER")
public class HruserJPA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPID")
	private String empid;
	@Column(name = "CPNYID")
	private String cpnyid;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "HECNAME")
	private String hecname;
	@Column(name = "STATE")
	private String state;

	@Column(name = "DEPT_NO")
	private String depno;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getCpnyid() {
		return cpnyid;
	}

	public void setCpnyid(String cpnyid) {
		this.cpnyid = cpnyid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHecname() {
		return hecname;
	}

	public void setHecname(String hecname) {
		this.hecname = hecname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDepno() {
		return depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}
}
