package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;
public class InsertDemo {
	public static void main(String[] args) {
		Product productInfo = new Product();
		productInfo.setPid(103);
		productInfo.setPname("nagu");
		productInfo.setPquantity(15);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productInfo);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}//end of main method

}//end of InsertDemo
