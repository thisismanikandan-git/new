package onetomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

import onetomany.dto.Person;

public class PersonDao {

	public void savePerson(Person Person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(Person);
		et.commit();
	}
//	public Person selectPerson(int id) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
//		EntityManager em = entityManagerFactory.createEntityManager();
//		Person dbPerson = em.find(Person.class, id);
//		if (dbPerson != null) {
//			return dbPerson;
//		} else {
//			return null;
//		}
//	}
//	public void updatePerson(int id, Person person) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
//		EntityManager em = entityManagerFactory.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Person dbPerson = em.find(Person.class, id);
//		if (dbPerson != null) {
//			et.begin();
//			person.setId(id);
//			person.setCars(dbPerson.getCars());
//			em.merge(person);
//			et.commit();
//			System.out.println("Person updated successfully");
//		} else {
//			System.out.println("Person is not present");
//		}
//	}
//	public void deletePerson(int id) {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
//		EntityManager em = entityManagerFactory.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		Person dbPerson = em.find(Person.class, id);
//		if (dbPerson != null) {
//			et.begin();
//			em.remove(dbPerson);
//			et.commit();
//			System.out.println("Person deleted successfully");
//		} else {
//			System.out.println("Person is not present");
//		}
//	}
//	public List<Person> getAllPerson() {
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
//		EntityManager em = entityManagerFactory.createEntityManager();
//		javax.persistence.Query query = em.createQuery("select u from Person u");
//		return query.getResultList();
//	}
//	
//	public void selectByPersonName(String name) {
//		List<Person> list = getAllPerson();
//		boolean value = false;
//		
//		for (Person Person : list) 
//		{
//			if (Person.getName().equals(name))
//			{
//				value = true;
//		break;}}
//				if (value == true) {
//					EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mani");
//					EntityManager em = entityManagerFactory.createEntityManager();
//					javax.persistence.Query query = em.createQuery("select u from Person u where u.name=?1");
//					query.setParameter(1, name);
//					Person com = (Person) query.getSingleResult();
//					System.out.println(com);
//				
//			       } 
//			else {
//				System.out.println(name + " Person  is not present in Database ");
//			 }
//			
//		}
	}
