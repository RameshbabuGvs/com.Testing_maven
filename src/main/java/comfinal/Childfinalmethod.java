package comfinal;

public class Childfinalmethod extends Parentfinalmethod  {
	
	final  void start() {
		System.out.println("Parent method needs to be run");
	}

	public static void main(String []args) {
		
		Childfinalmethod cm=new Childfinalmethod();
		cm.start();
	
	}

}
