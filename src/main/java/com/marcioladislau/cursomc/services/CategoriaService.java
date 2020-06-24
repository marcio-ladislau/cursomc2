package com.marcioladislau.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcioladislau.cursomc.domain.Categoria;
import com.marcioladislau.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.findById(id).get();
		return obj;
		
		
	}

}
