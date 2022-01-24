package com.leonardo.designpatterns.abstractfactory.dao.interfaces;

import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.domain.Product;

public interface ProductDAO {

	Optional<Product> findById(Long id);
	int insert(Product product);
	
}
