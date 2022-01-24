package com.leonardo.designpatterns.abstractfactory.dao.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ProductDAO;
import com.leonardo.designpatterns.abstractfactory.domain.Product;

public class MockProductDAO implements ProductDAO{
	
	private List<Product> products = new ArrayList<>(
		List.of(
			new Product(1L, "Computador", 5000.00F),
			new Product(2L, "Smartphone", 2500.00F),
			new Product(3L, "Placa de rede", 500.00F)
		)
	);
	
	@Override
	public Optional<Product> findById(Long id) {
		
		return products
				.stream()
				.filter(p -> p.getId().equals(id))
				.findFirst();
		
	}

	@Override
	public int insert(Product product) {
		if(findById(product.getId()).isEmpty()) {
			if(products.add(product)) {
				return 1;
			}else {
				return 0;
			}
		}
		return 0;
	}

}
