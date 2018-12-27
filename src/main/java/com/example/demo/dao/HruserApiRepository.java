package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.HruserJPA;

public interface HruserApiRepository extends JpaRepository<HruserJPA, Long> {


}
