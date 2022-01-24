package com.leonardo.designpatterns.abstractfactory.dao.interfaces;

import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.domain.Client;

public interface ClientDAO {

	Optional<Client> findById(Long id);
	int insert(Client client);
	
}
