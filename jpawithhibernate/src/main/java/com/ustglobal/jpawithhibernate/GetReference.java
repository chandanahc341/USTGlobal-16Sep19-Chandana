package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager entityManager=null;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		Product productInfo = entityManager.getReference(Product.class, 10);
		System.out.println(productInfo.getPid());
		System.out.println(productInfo.getPname());
		System.out.println(productInfo.getPquantity());

		entityManager.close();
	}

}
