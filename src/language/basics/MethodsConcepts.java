package language.basics;

public class MethodsConcepts {

	 MethodsConcepts() { // by default we get this i.e called default constructor
	 
	 }
	 
	 MethodsConcepts(int value) { //i.e called as constructor method with parameters or parameterized constructor
	
	 }
	 
	 MethodsConcepts(String value) { //i.e called as constructor method with parameters or parameterized constructor
			
	 
	 }
	 	
	 	//Method means ==> Set of Statements / Collection of Statements / Block of Code
	 	//Purpose ==> To reduce duplicate code

	     public static void main(String[] args) {
	 		
	 	//Print employee Details
	 //   System.out.println(123);
//	     System.out.println("Sefali");
//	     System.out.println("50K");
	     
//	     System.out.println(124);
//	     System.out.println("Sky");
//	     System.out.println("60K");
	     
//	     System.out.println(125);
//	     System.out.println("Sharon");
//	     System.out.println("70K");
	    
	     	MethodsConcepts	obj = new MethodsConcepts();
	     	
	     	obj.printEmpDetails(123, "Sefali","50K");
	         obj.printEmpDetails(124, "Sky","60K");
	         obj.printEmpDetails(125, "Sharon","70K");
	         
	         System.out.println(obj. sumOfNumbers(50,70)*100);
	     	
	     
	     }
	     	
	     
	     //Methods to print emp Details
	      void printEmpDetails(int empId, String empName, String empSalary){
	         	System.out.println(empId);
	             System.out.println(empName);
	             System.out.println(empSalary);
	          }      
	     
	           //Methods to print sum of 10 and 20 with return type  
	             int sumOfNumbers() {
	                 int a = 10;
	                 int b = 20;
	                 return a+b;
	                }   
	    //Methods to get sum of any  2 numbers
	    int sumOfNumbers(int a, int b) {
	         return a+b;
	     }
	 }

