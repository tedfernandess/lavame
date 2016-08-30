package mz.co.lavame.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import mz.co.lavame.model.Cliente;

public class RemovendoCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente");
		EntityManager manager = factory.createEntityManager();
		
		Cliente encontrado = manager.find(Cliente.class, 1L);
		manager.getTransaction().begin();
		manager.remove(encontrado);
		manager.getTransaction().commit();
		System.out.println("removido com sucesso");
	}
	
}
