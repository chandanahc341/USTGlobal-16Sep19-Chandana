package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpahibernate.onetoone.Person;
import com.ustglobal.jpahibernate.onetoone.VoterCard;

public class TestBidirectional {
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("sami");
		Person p = new Person();
		p.setPid(1);
		p.setPname("sami");
		p.setVotercard(vc);
		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard=entityManager.find(VoterCard.class, 10);
			System.out.println(vCard.getPerson().getPid());

			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
