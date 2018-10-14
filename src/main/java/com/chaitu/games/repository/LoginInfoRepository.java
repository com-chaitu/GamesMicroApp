package com.chaitu.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chaitu.games.dao.LoginInfoDao;

@Repository
public interface LoginInfoRepository extends JpaRepository<LoginInfoDao, String>{

}
