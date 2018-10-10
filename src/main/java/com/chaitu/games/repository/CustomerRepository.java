package com.chaitu.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chaitu.games.dao.CustomerDao;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDao, String>{

}
