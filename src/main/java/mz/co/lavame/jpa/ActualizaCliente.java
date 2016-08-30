package mz.co.lavame.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mz.co.lavame.model.Cliente;

public class ActualizaCliente {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setId(2);
		cliente.setName("Ana");
		
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
		
		manager.close();
	}
	
}
