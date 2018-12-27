package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
	String userId;
	String userName;
	String depno;

	public UserDto(String empid, String userName, String depno) {
		this.userId = empid;
		this.userName = userName;
		this.depno = depno;
	}

	public UserDto() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepno() {
		return depno;
	}

	public void setDepno(String depno) {
		this.depno = depno;
	}
}
