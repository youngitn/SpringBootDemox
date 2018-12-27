package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;

public interface UserService {
	UserDto getUserByEmpid(String userId);

	void saveUser(UserDto userDto);

	List<UserDto> getAllUsers();
}
