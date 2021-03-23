package com.generation.farmacia_crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farmacia_crud.model.Categoria;
import com.generation.farmacia_crud.model.Produto;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>
{
	//public List<Categoria> findAllByCategoriaContainingIgnoreCase(String genericos);
	public List<Categoria> findAllByGenericosContainingIgnoreCase(String genericos);
}

