package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberDao;
import com.example.demo.model.MemberAccount;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;

	public void addMember(MemberAccount memberAccount) {
		memberDao.addMember(memberAccount);
	}

	public String getEmp(int empid) {
		return memberDao.find(empid);
	}

}
