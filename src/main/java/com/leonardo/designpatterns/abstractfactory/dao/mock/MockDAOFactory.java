package com.leonardo.designpatterns.abstractfactory.dao.mock;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ClientDAO;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.DAOFactory;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ProductDAO;

public class MockDAOFactory implements DAOFactory{

	@Override
	public ClientDAO createClient() {
		return new MockClientDAO();
	}

	@Override
	public ProductDAO createProduct() {
		return new MockProductDAO();
	}

}
