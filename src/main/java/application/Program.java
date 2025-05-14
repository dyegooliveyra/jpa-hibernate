package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
//		Create
		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.getTransaction().commit();
		
//		System.out.println(p1);
		
		
//		Find by id
		Person findPerson = em.find(Person.class, 1);
		
		System.out.println(findPerson);
		
//		Delete
		em.getTransaction().begin();
		em.remove(findPerson);
		em.getTransaction().commit();	
		
		System.out.println("Ready") ;
		
		em.close();
		emf.close();

	}

}
