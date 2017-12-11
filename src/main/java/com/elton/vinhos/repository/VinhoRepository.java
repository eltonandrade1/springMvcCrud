package com.elton.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elton.vinhos.model.Vinho;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {

}
