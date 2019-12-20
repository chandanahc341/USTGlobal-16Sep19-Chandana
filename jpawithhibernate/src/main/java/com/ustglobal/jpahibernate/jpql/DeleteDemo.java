package com.ustglobal.jpahibernate.jpql;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

import com.ustglobal.jpawithhibernate.dto.Product;

public class DeleteDemo {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="delete from Product  where pid=101";

			Query query=entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}//end of main method

}//end of RetrieveDemo
