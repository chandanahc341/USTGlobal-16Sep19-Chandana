package com.ustglobal.jpahibernate.jpql;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

import com.ustglobal.jpawithhibernate.dto.Product;

public class RetrieveDemo2 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="select pname from Product";
		
		Query query=entityManager.createQuery(jpql);
		ArrayList<String> list = (ArrayList<String>) query.getResultList();
			System.out.println(list);
			System.out.println("****");
		
		entityManager.close();
	}//end of main method

}//end of RetrieveDemo2
