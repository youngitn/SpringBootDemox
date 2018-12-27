package com.example.demo.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MemberAccount;

@Repository
public class MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addMember(MemberAccount memberAccount) {
		System.out.println("EXCUTE INSERT MEMBER");
		jdbcTemplate.update(
				"INSERT INTO member_account(PASSWORD, EMAIL, ADDRESS,CELLPHONE,CREATE_DATE) "
						+ "VALUES (?,?,?,?,NOW())",
				memberAccount.getPassword(), memberAccount.getEmail(), memberAccount.getAddress(),
				memberAccount.getCellphone());
	}

	public String find(Integer id) {
		List rows = jdbcTemplate.queryForList("SELECT * FROM hruser WHERE empid='" + id.intValue()+"'");

		Iterator it = rows.iterator();
		if (it.hasNext()) {
			Map userMap = (Map) it.next();

			String empid = userMap.get("empid").toString();
			String name = userMap.get("hecname").toString();

			return name + empid;
		}

		return null;
	}
}
