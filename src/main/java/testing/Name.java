package testing;

public class Name {

	int x=10;
	static int y=20;
	
	static void Ramesh() {
		System.out.println("this is a static method");
	}
	static void Ramesh(String name) {
		String Name=name;
		System.out.println("this is a static Paramerized method "+Name);
	}
	 void Ramesh1() {
		System.out.println("this is a non-static method");
	}
	
	public static void main(String[] args) {
		Name n=new Name();
		System.out.println(n.x);
		System.out.println(y);
	Ramesh();
	n.Ramesh1();
	Ramesh("Babu");
		
		
	}

}
