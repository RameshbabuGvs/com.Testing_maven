package comfinal;
public class FinallyConcept {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
       test1();
	//test2();
		//Divison();
	}
	public static void test1() {
		int i=10;
		
		try{
		int z=i/2;
			System.out.println("this value is divisble by 2");
		}
		catch(Exception e){
			System.out.println("arthmetic excpetion");
		}
			
		finally{
			System.out.println("i want to logg of the system");}
		
	}

}
