package com.leonardo.designpatterns.abstractfactory.dao.interfaces;

public interface DAOFactory {

	ClientDAO createClient();
	ProductDAO createProduct();
	
}
