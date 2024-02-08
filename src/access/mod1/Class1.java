package access.mod1;

public class Class1 {  // Class1 - Outerclass
	
	private class test {  //test - Innerclass
		 public String name = "Sabnam";
	    }
	public String name= "Sefali";
	
	public  void printName() {
		System.out.println("Sharon");
	
	}

	public String getName() {
		return name;
	}
	
	public void printname() {
		printName();
	}
	
	public void changeName(String newName) {
		name = newName;
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Class1 obj = new Class1 ();  // OuterClass obj = new InnerClass ();
        System.out.println(obj.name);
        obj.printName();
        System.out.println(obj.new test().name); // test - Innerclass
	}

}
