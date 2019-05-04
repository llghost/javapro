package com.ghost.demo.repository;

import com.ghost.demo.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import  java.util.List;

public interface GirlRepository extends JpaRepository<Girl,Integer> {

     public List<Girl> findByAge(Integer age);
}
