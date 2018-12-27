package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.model.HruserJPA;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserByEmpid(String empid) {
		return UserConverter.modelToDto(userRepository.getUser(empid));
	}

	@Override
	public void saveUser(UserDto userDto) {
		HruserJPA h = UserConverter.dtoToModel(userDto);
		userRepository.save(h);
	}

	@Override
	public List<UserDto> getAllUsers() {
		return userRepository.getYG01AllUsers().stream().map(UserConverter::modelToDto).collect(Collectors.toList());
	}
}
