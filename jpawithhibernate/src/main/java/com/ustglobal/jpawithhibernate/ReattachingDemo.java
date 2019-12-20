package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReattachingDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;

		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Product productInfo=entityManager.find(Product.class,101);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
			Product productInfo2=entityManager.merge(productInfo);
			System.out.println(entityManager.contains(productInfo2));
			productInfo2.setPname("pushpa");
			entityManager.clear();
			System.out.println(entityManager.contains(productInfo2));
			System.out.println("updated Record");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();

	}//end of the main method

}//end of ReattachingDemo
