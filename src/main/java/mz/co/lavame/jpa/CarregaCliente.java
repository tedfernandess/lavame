package mz.co.lavame.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mz.co.lavame.model.Cliente;

public class CarregaCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente");
		EntityManager manager = factory.createEntityManager();
		Cliente encontrado = manager.find(Cliente.class, 1L);
		System.out.println(encontrado.getName());
		manager.close();
	}
	
}
