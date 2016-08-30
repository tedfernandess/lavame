package mz.co.lavame.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import mz.co.lavame.model.Cliente;

public class BuscaCliente {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("select c from Cliente as c " + "where c.name=:paramNome");
		query.setParameter("paramNome", "Ana");
		
		List<Cliente>lista = query.getResultList();
//		
		for (Cliente c : lista) {
			System.out.println(c.getName());
			
		}
		
		System.out.println(lista.size());
		
//		for(Cliente c:lista){
//		}
//		
		manager.close();

	}

}
