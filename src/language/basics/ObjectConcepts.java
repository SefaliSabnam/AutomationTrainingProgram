package language.basics;

public class ObjectConcepts {

	
	//What is Object ? => New Instance of Class
	//Syntax to create object ==> new ClassName() 
	
	public static void main(String[] args) {
		
		MethodsConcepts	obj = new MethodsConcepts();  // constructor in java ==> the default method created by Java itself while creating new class
		
		obj.printEmpDetails(123, "Sefali", "50K");

		obj.main(args);
	}

}
