package mz.co.lavame.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mz.co.lavame.model.Cliente;

public class AdicionaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setName("Ted");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		System.out.println("ID do cliente: "+cliente.getId());
		manager.close();
		
	}
	
}
