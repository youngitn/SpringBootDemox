package com.example.demo.converter;

import com.example.demo.dto.DepDto;
import com.example.demo.entity.Dep;

public class DepConverter {
	public static Dep dtoToEntity(DepDto DepDto) {
		Dep Dep = new Dep(DepDto.getDepName(), null);
		Dep.setDepId(DepDto.getDepId());
		return Dep;
	}

	public static DepDto entityToDto(Dep skill) {
		return new DepDto(skill.getDepId(), skill.getDepName());
	}
}
