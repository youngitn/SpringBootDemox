package com.example.demo.dto;

public class DepDto {
	Integer depId;
	String depName;

	public DepDto(Integer depId, String depName) {
		this.depId = depId;
		this.depName = depName;
	}

	public DepDto() {
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
		depName = depName;
	}
}