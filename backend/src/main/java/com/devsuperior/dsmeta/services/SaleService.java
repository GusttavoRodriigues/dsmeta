package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
//Anoteion
@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	public List<Sale> findSales() {
		
		repository.findAll();//Buscar todas as vendas
		return repository.findAll();
	}
	
	
}
