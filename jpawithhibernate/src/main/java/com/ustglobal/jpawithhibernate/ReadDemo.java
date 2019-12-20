package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;


public class ReadDemo {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 10);
		System.out.println("ID----------"+productDetail.getPid());
		System.out.println("Name--------"+productDetail.getPname());
		System.out.println("Quantity----"+productDetail.getPquantity());
		entityManager.close();
	}//end of main method
}//end of ReadDemo
