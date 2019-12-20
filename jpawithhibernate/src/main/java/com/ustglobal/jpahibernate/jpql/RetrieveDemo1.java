package com.ustglobal.jpahibernate.jpql;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

import com.ustglobal.jpawithhibernate.dto.Product;

public class RetrieveDemo1 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql=" from Product";
		
		Query query=entityManager.createQuery(jpql);
		ArrayList<Product> list = (ArrayList<Product>) query.getResultList();
		for(Product p : list) {
			System.out.println(p.getPid());
			System.out.println(p.getPname());
			System.out.println(p.getPquantity());
			System.out.println("****");
		}
		entityManager.close();
	}//end of main method

}//end of RetrieveDemo2
