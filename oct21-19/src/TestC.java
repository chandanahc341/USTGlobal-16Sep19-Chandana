
public class TestC {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "vinod";
		Person.color = "white";//static variables using class name 
		p.age = 29;
		System.out.println("person name is:"+p.name);
		System.out.println("person color is:"+Person.color);
		System.out.println("person age is:"+p.age);
		p.eat();
		p.walk();
		p.sleep();
	}

}
