package com.example.demo.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Aadhar;

@Repository
@Transactional
@EnableJpaRepositories
public interface AadharRepo extends JpaRepository<Aadhar, Integer>{

	Optional<Aadhar> findByAadharnumber(String aadharnumber);
	
	void deleteByAadharnumber(String number);
}