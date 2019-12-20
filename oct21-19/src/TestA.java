
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "black";
		p.brand = "cello";
		System.out.println("cost is"+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is"+p.brand);
		
		p.write();
		System.out.println("***********************");
		van v = new van();
		v.cost = 500000;
		v.color = "red";
		System.out.println("van cost is "+v.cost);
		System.out.println("van color is "+v.color);
		v.move();
		
		van v1 = new van();
		v1.cost = 690990;
		v1.color = "pink";
		System.out.println("van v1 cost is"+v1.cost);
		System.out.println("van v1 color is"+v1.color);
		v.move();
		
	}

}
