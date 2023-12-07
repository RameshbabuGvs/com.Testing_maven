package comfinal;

public class FinalizeConcept {

	public void finalize() {
		System.out.println("i want clean browser history");
	}
	
	public static void main(String[] args) {
	
		FinalizeConcept f1=new FinalizeConcept();
		//FinalizeConcept f2=new FinalizeConcept();
		//System.out.println("Hi");
		f1=null;
		//f2=null;
		//f2.finalize();
		System.gc();
	}

}
