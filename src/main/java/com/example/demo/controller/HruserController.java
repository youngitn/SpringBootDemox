package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.HruserRepository;
import com.example.demo.model.HruserJPA;

@Controller
public class HruserController {

	@Autowired
	HruserRepository hruserRepository;

	@Autowired
	DataSource dataSource;

	@GetMapping("/addMemberPage")
	public String addMemberPage() {
//		memberAccount = new MemberAccount();
//		memberAccount.setPassword("12345678");
//		memberAccount.setEmail("test@gmail.com");
//		memberAccount.setCellphone("0912345789");
//		memberAccount.setAddress("еxе_ел");
//		return memberService.getEmp(52116);

		List<HruserJPA> hruserJPA = new ArrayList<HruserJPA>();
		hruserJPA = hruserRepository.findAll();

		for (int i = 0; i < hruserJPA.size(); i++) {
			System.out.println(hruserJPA.get(i).getEmpid());
		}
		return "addMemberPage";
	}

	@GetMapping("/login")
	public String login(@ModelAttribute HruserJPA hruserJPA) {

		return "login";
	}

	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute HruserJPA hruserJPA, HttpSession session) {
		System.out.println(hruserJPA.getEmpid());
		// System.out.println(hruserRepository.findCheckHruser(hruserJPA.getEmpid()).get(0).getHecname());
		List<HruserJPA> hruserJPAList = hruserRepository.findCheckHruser(hruserJPA.getEmpid());
//		session.setAttribute("uid", hruserJPA);
		if (hruserJPAList.size() == 0) {
			return "login";
		} else {
			session.setAttribute("uid", hruserJPA);
			return "welcome";
		}
	}

	@GetMapping("/uploadPage")
	public String uploadPage() {
//	
		return "upload";
	}

	@GetMapping("/getEmp/{empid}")
	@ResponseBody
	public HruserJPA getEmp(@PathVariable String empid) {
		List<HruserJPA> hruserJPAList = hruserRepository.findCheckHruser(empid);
		return hruserJPAList.get(0);
	}

}
