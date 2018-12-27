package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.HruserJPA;

public interface HruserRepository extends JpaRepository<HruserJPA, Long> {
	List<HruserJPA> findAll();

	List<HruserJPA> findByEmail(String email);

	// @Query(value = "select * from HRUSER where EMPID = ?1", nativeQuery = true)
	@Query(value = "select h from HruserJPA h where h.empid=:empid")
	List<HruserJPA> findCheckHruser(@Param("empid") String empid);

	@Modifying
	@Transactional
	@Query(value = "DELETE from HruserJPA h where h.empid=:empid")
	int deleteByEmpid(@Param("empid") String empid);

}