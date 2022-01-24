package com.leonardo.designpatterns.abstractfactory.dao.prod;

import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ProductDAO;
import com.leonardo.designpatterns.abstractfactory.domain.Product;

public class ProdProductDAO implements ProductDAO{
	
	@Override
	public Optional<Product> findById(Long id) {
		
		System.out.println("Abrindo conexão...");
		
		System.out.println("Product recuperado.");
		
		System.out.println("Fechando conexão...");
		
		Product product = new Product(id, "Notebook", 4000.00F);
		
		return Optional.of(product);
		
	}

	@Override
	public int insert(Product product) {
		return 1;
	}

}
