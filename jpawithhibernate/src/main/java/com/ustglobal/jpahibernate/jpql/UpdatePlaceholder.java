package com.ustglobal.jpahibernate.jpql;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.mapping.List;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdatePlaceholder {
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			String jpql="update Product set pname=:name where pid=:id";

			Query query=entityManager.createQuery(jpql);
			query.setParameter("name", "chinnu");
			query.setParameter("id", 103);
			int result = query.executeUpdate();
			System.out.println(result);
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
		entityManager.close();
		}
	}//end of main method

}//end of RetrieveDemo
