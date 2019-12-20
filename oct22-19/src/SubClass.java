
public class SubClass extends SuperClass{
	String s = "subclass variable";
	
	SubClass(){
		super();
		System.out.println("subclass");
	}
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("*********");
		super.superClassMethod();
		superClassMethod();
	}
}
