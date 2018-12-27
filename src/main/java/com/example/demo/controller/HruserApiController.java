package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.HruserApiRepository;
import com.example.demo.dao.HruserRepository;
import com.example.demo.model.HruserJPA;

@RestController
@RequestMapping("/memberApi")
public class HruserApiController {

	@Autowired
	HruserApiRepository hruserApiRepository;
	@Autowired
	HruserRepository hruserRepository;

	@RequestMapping(value = "/{empid}")
	public HruserJPA read(@PathVariable String empid) {
		System.out.print(empid);
		List<HruserJPA> hruserJPAList = hruserRepository.findCheckHruser(empid);
		return hruserJPAList.get(0);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody HruserJPA memberaccount) {
		hruserApiRepository.save(memberaccount);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody HruserJPA memberaccount) {
		hruserApiRepository.save(memberaccount);

	}

	@RequestMapping(value = "/{empid}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String empid) {
		int wasOk = hruserRepository.deleteByEmpid(empid);

	}
}
