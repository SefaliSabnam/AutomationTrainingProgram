package poly.pack;

public class PolyClass2 extends PolyClass1 {
	
	public void sumOfnumbers() {
		System.out.println("No value");
		
	}
	
public void sumOfnumbers(int a, int b) {
	System.out.println(a+b);
	}

public void sumOfnumbers(int a,int b, int c) {
	System.out.println(a+b+c);
}

	public static void main(String[] args) {
		
		new PolyClass2().sumOfnumbers();
			
		
	}

}
