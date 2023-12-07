package testing;

public class CLasObjectsConstructiors {
	
	static int x=10;
	static int y=20;
	
	CLasObjectsConstructiors(){
		String str="Srinivas";
		System.out.println(str);
	}
	CLasObjectsConstructiors(String str1,int x){
		String str=str1;
		System.out.println(str1);
		System.out.println(x);
	}
	
	//Accessmodifiers.y;
	
	public static void main(String[] args) {
		
		int x1=22;
CLasObjectsConstructiors cc=new CLasObjectsConstructiors();
CLasObjectsConstructiors cc1=new CLasObjectsConstructiors("Ram",10);

		System.out.println(cc.y);
		System.out.println(Accessmodifiers.y);
		System.out.println(y);
		System.out.println(Accessmodifiers.z);
		
	}

}
