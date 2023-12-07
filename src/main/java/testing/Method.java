package testing;

public class Method extends Accessmodifiers {
	
	//parameterized
	//
public static void Addition() {
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println("Addition of "+ z);
	}

	public static void Addition(int x1,int x2) {
		int x=x1;
		int y=x2;
		int z=x+y;
		System.out.println("Addition of "+ z);
	}
	public  void Substraction() {
		int x=10;
		int y=20;
		int z=x-y;
		System.out.println("Substraction");
	}
	
	public static void String(String str,String str2,int x) {
		System.out.printf("print the string values"+str+str2+x);
	}
	
	public static void String() {//sub block it contains block of code 
		System.out.println("String");
	}
	
	public static void main(String[] args) {// main method
		// TODO Auto-generated method stub
	Addition();
	Addition(1, 2);
	Addition(2, 5);
	String(null, null, 0);
	System.out.println(Accessmodifiers.x);
	System.out.println(Accessmodifiers.y);
	System.out.println(Accessmodifiers.z);
	
	}

}
