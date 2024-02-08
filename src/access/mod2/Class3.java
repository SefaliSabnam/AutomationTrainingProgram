package access.mod2;

import access.mod1.Class1;
//CHILD extends PARENT
public class Class3 extends Class1 { //Class1 - Outerclass

public static void main(String[] args) {
		
		Class1 obj = new Class1 (); // Outerclass obj = new Outerclass ();
 //       System.out.println(obj.name);
 //       obj.printName();
		
      System.out.println(obj.getName());
         obj.printname() ;
         obj.changeName("sky");
	
	}
	}
