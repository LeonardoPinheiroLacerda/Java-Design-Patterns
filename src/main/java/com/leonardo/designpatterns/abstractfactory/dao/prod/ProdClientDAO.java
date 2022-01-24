package com.leonardo.designpatterns.abstractfactory.dao.prod;

import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ClientDAO;
import com.leonardo.designpatterns.abstractfactory.domain.Client;

public class ProdClientDAO implements ClientDAO{

	@Override
	public Optional<Client> findById(Long id) {
		
		System.out.println("Abrindo conexão...");
		
		System.out.println("Client recuperado.");
		
		System.out.println("Fechando conexão...");
		
		Client client = new Client(id, "Gabrielly");
		
		return Optional.of(client);
	}

	@Override
	public int insert(Client client) {
		return 1;
	}

}
