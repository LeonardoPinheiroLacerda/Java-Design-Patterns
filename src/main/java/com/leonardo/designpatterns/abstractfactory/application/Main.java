package com.leonardo.designpatterns.abstractfactory.application;

import java.io.IOException;
import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ClientDAO;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.DAOFactory;
import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ProductDAO;
import com.leonardo.designpatterns.abstractfactory.dao.mock.MockDAOFactory;
import com.leonardo.designpatterns.abstractfactory.dao.prod.ProdDAOFactory;
import com.leonardo.designpatterns.abstractfactory.domain.Client;
import com.leonardo.designpatterns.abstractfactory.domain.Product;
import com.leonardo.designpatterns.abstractmethod.env.Env;

public class Main {

	public static void main(String [] args) throws IOException {
		
		String profile = Env.getProfile();
		
		DAOFactory factory = null;
		
		if(profile.equals("dev") || profile.equals("test")) {
			factory = new MockDAOFactory();
		}else if(profile.equals("prod")) {
			factory = new ProdDAOFactory();
		}
		
		ProductDAO productDAO = factory.createProduct();
		ClientDAO clientDAO = factory.createClient();
		
		Product product = new Product(4L, "Notebook", 4000.00F);
		Client client = new Client(3L, "Gabrielly");
		
		productDAO.insert(product);
		Optional<Product> op = productDAO.findById(4L);
		
		clientDAO.insert(client);
		Optional<Client> oc = clientDAO.findById(3L);
		
		System.out.println(op.orElse(null));
		System.out.println(oc.orElse(null));
		


	}
	
}
