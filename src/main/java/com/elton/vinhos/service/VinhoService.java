package com.elton.vinhos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elton.vinhos.model.Vinho;
import com.elton.vinhos.repository.VinhoRepository;

@Service
public class VinhoService {
	
	@Autowired
	VinhoRepository vinhoRepository;

	public Vinho findOne(Long id) {
		return vinhoRepository.findOne(id);
	}

	public void salvar(Vinho vinho) {
		vinhoRepository.save(vinho);
	}

	public void delete(Long id) {
		vinhoRepository.delete(id);
	}

	public List<Vinho> findAll() {
		return vinhoRepository.findAll();
	}
	
	

}
