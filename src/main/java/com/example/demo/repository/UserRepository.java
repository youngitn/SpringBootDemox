package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.HruserJPA;;

@Repository
public interface UserRepository extends JpaRepository<HruserJPA, Integer> {
	// @Query(value = "select * from HRUSER where EMPID = ?1", nativeQuery = true)
	@Query(value = "select h from HruserJPA h where h.empid=:empid")
	HruserJPA getUser(@Param("empid") String empid);

	@Query(value = "select h from HruserJPA h where h.cpnyid='YG01'")
	List<HruserJPA> getYG01AllUsers();

}
