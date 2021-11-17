package com.joinsolutions.curso_demo_spring_boot_mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joinsolutions.curso_demo_spring_boot_mc.entities.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}