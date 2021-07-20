package in.practice.ajinkya.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.practice.ajinkya.model.Employee;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyAppDB");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			//operation
			Employee emp = new Employee();
			emp.setEid(1001);
			emp.setEname("John");
			emp.setEpin(012455);
			emp.setEloc("Hyderabad");
			emp.setEsal(50000.0);
						
			em.persist(emp); //INSERT
			
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		em.close();
		factory.close();
	}
}
