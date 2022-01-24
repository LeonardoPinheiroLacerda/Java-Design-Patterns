package com.leonardo.designpatterns.abstractfactory.dao.prod;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ClientDAO;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.DAOFactory;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ProductDAO;

public class ProdDAOFactory implements DAOFactory{

	@Override
	public ClientDAO createClient() {
		return new ProdClientDAO();
	}

	@Override
	public ProductDAO createProduct() {
		return new ProdProductDAO();
	}

}
