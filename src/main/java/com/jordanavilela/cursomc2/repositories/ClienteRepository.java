package com.jordanavilela.cursomc2.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jordanavilela.cursomc2.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
	//@Transactional(readOnly=true)
	@Transactional
	Cliente findByEmail(String email);
}
