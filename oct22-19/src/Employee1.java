
public class Employee1 {
	
		String name;
		int eid;
		public Employee1(String name,int id) {
			this.name = name;
			this.eid = eid;
		}
		void printDetails() {
			System.out.println("Employee name is "+name);
			System.out.println("Employee id is "+eid);
			this.sayHello();
		}
		void sayHello() {
			System.out.println("Hello "+name+" welcome to UST Global company");
		}
		public static void main(String[] args) {
			Employee1 e = new Employee1("deepika",155);
			e.printDetails();
			Employee1 e3 = new Employee1("poorvika",145);
			e3.printDetails();
			Employee1 e4 = new Employee1("swapna",125);
			e4.printDetails();
		}


}
