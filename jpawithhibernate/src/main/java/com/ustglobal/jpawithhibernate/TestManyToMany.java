package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		Course course = new Course();
		course.setCid(3);
		course.setCname("pooja");


		Course course1 = new Course();
		course1.setCid(4);
		course1.setCname("najma");

		ArrayList<Course> al = new ArrayList<Course>();
		al.add(course);
		al.add(course1);


		Student s = new Student();
		s.setSid(11);
		s.setSname("pushpa");
		s.setCourse(al);

		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();


			System.out.println("Record Saved");
			entityManager.persist(s);

			entityTransaction.commit();
			entityManager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}//end of main method
}//end of TestManyToMany
