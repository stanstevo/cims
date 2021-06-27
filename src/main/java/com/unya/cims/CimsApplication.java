package com.unya.cims;

import com.unya.cims.entity.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@SpringBootApplication
public class CimsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CimsApplication.class, args);

		/*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try {
			transaction.begin();

			Employee stan = new Employee();
			stan.setId(1L);
			stan.setFirstName("Stanoo");
			stan.setLastName("Mwangi");
			stan.setPjNumber("PJ47117");
			entityManager.persist(stan);

			transaction.commit();
		} finally {
			if(transaction.isActive()) {
				transaction.rollback();
			}
			entityManager.close();
			entityManagerFactory.close();
		}*/
	}

}
