
public class TestA {
	static int a = 25;
	int x;
		public static void add() {
			
			final int b;//only final access modifier is supported for local variable
			
			b = 20;
			System.out.println(a);
			System.out.println(b);
		}
		public static void main(String[] args) {
			add();
			TestA t = new TestA();
			System.out.println("x value is"+t.x);
		}

}
