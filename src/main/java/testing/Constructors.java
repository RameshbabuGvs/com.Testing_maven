package testing;

public class Constructors {
	
	  public static void Constructors2() {
		System.out.println("This is a non parameterized constructor");	
		}
	  public  void Constructors3() {
			System.out.println("This is a non static and non parameterized method");	
			}
		  
	public Constructors() {
	System.out.println("This is a non parameterized constructor");	
	}
	
	public Constructors(int x,int y,String name) {
		int age=x;
		int number=y;
		String Name=name;
		System.out.println("This is a  parameterized constructor"+age);	
		System.out.println("This is a  parameterized constructor"+number);
		System.out.println("This is a  parameterized constructor"+name);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors c=new Constructors();
		Constructors c1=new Constructors(10,123,"Rana");
		Constructors c2=new Constructors(20,1234,"Rana2");
		Constructors2();
		c.Constructors3();
	}

}
