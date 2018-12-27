package com.example.demo.converter;

import java.util.stream.Collectors;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.model.HruserJPA;

public class UserConverter {
	public static HruserJPA dtoToModel(UserDto userDto) {
		HruserJPA user = new HruserJPA();
		user.setEmpid(userDto.getUserId());
		user.setHecname(userDto.getUserName());
		user.setCpnyid("YG01");
		user.setState("A");
		// user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto modelToDto(HruserJPA user) {
		UserDto userDto = new UserDto(user.getEmpid(), user.getHecname(), null);
		userDto.setDepno(user.getDepno());
		return userDto;
	}
}
