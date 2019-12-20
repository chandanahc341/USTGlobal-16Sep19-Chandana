package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {

		PencilBox pb = new PencilBox();
		pb.setBid(11);
		pb.setBname("natraj");

		Pencil p = new Pencil();
		p.setPid(3);
		p.setColor("red");
		p.setPencilBox(pb);

		Pencil p1 = new Pencil();
		p1.setPid(4);
		p1.setColor("blue");
		p1.setPencilBox(pb);

		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(p);
			entityManager.persist(p1);


			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


