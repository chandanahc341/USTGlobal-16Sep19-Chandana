
public class Student {
	String name;
	int rollno;
	String branch;
	int marks;
	int age;
	
	void display() {
		System.out.println("student name is "+name);
		System.out.println("student rollno is "+rollno);
		System.out.println("student branch is "+branch);
		System.out.println("student marks is "+marks);
		System.out.println("student age is "+age);
	}
	Student(String sname,int sroll,String sbranch,int smarks,int sage){
		name = sname;
		rollno = sroll;
		branch = sbranch;
		marks = smarks;
		age = sage;
		System.out.println("student constructor");
	}
	public static void main(String[] args) {
		
		Student s = new Student("amulya",123,"cs",50,20);
		s.display();
		Student s1 = new Student("bhoomika",111,"ec",60,21);
		s1.display();
		Student s2 = new Student("chandana",202,"cs",85,22);
		s2.display();
		Student s3 = new Student("sachin",333,"mech",90,23);
		s3.display();
		Student s4 = new Student("vinod",298,"civil",70,28);
		s4.display();
		Student s5 = new Student("rekha",523,"cs",50,20);
		s5.display();
		Student s6 = new Student("poormika",311,"ec",60,21);
		s6.display();
		Student s7 = new Student("spandana",902,"cs",85,22);
		s7.display();
		Student s8 = new Student("lochan",233,"mech",90,23);
		s8.display();
		Student s9 = new Student("vasu",198,"civil",70,28);
		s9.display();
	}
	

}
