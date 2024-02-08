package language.basics;

public class DifferentTypeOfVariables {

	
     String name1 = "Sharon"; //Instance Variable --> with object only
     
     static String name2 = "Ron"; //Global/Static variable--> without object
    	
    	public void storeName()	{ 
    		 String name3 = "Sefali"; //Local variable
    		 
     }
	public static void main(String[] args) {
		System.out.println(new DifferentTypeOfVariables ().name1);
		System.out.println(new DifferentTypeOfVariables ().name2);
		
	}

}
