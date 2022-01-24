package com.leonardo.designpatterns.abstractfactory.dao.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.leonardo.designpatterns.abstractfactory.dao.interfaces.ClientDAO;
import com.leonardo.designpatterns.abstractfactory.domain.Client;

public class MockClientDAO implements ClientDAO{
	
	private List<Client> clients = new ArrayList<>(
		List.of(
				new Client(1L, "Leonardo"),
				new Client(2L, "Larissa")
		)
	);

	@Override
	public Optional<Client> findById(Long id) {
		return clients
				.stream()
				.filter(c -> c.getId().equals(id))
				.findFirst();
	}

	@Override
	public int insert(Client client) {
		if(findById(client.getId()).isEmpty()) {
			if(clients.add(client)) {
				return 1;
			}else {
				return 0;
			}
		}
		return 0;
	}

}
