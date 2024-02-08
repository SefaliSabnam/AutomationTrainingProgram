package language.basics;

public class ArraysConcept {

	//Start-Up Company employee Information
	
	public static void main(String[] args) {
		
		String empName1 = "Sefali" ;
		int empId1 = 1;
		
		String empName2 = "Sky" ;
		int empId2 = 2;
		
		String empName3 = "Sharon" ;
		int empId3 = 3;
		
		System.out.println(empName2) ;
		System.out.print(empId2) ;
		
		
		//Arrays
		//1. The data type we are going to store multiple values with same data type
		//2. Arrays are fixed in length
		//3.While initiating the array itself if it is going to consume the memory
		//Syntax of Array ==> DataType [] Variable  = new DataType [length];
		//to store values in array we will use index ==> index starts will zero (0) ==> Variable[Index]
		//Maximum Index allowed is length - 1;
		
		String [] empName = new String [3];
		empName[0] ="Sefali";
		empName[1] ="Sky";
		empName[2] ="Sharon";
	

		
		//     String[] expNames1 = ("Sefali","Sky");
		
		int [] empIds = new int [4];
		System.out.println("Length of Array while Intiating : "+empIds.length);
		empIds[0] = 1;
		empIds[1] = 2;
		empIds[2] = 3;		
		empIds[3] = 4;
		System.out.println();
		
		System.out.print(144);
	    System.out.println(56432867);
	
	
	//2D Array ==> Array of Arrays
	    String [][] groupOfEmployees = new String [2][3];   // 2 dept and each dept have 3 employees
	    groupOfEmployees[0][0] = "Sefali";
	    groupOfEmployees[0][1] = "Sky";
	    groupOfEmployees[0][2] = "Sharon";
	    
	    groupOfEmployees[1][0] = "Sunil";
	    groupOfEmployees[1][1] = "Chetri";
	    groupOfEmployees[1][2] = "Sabnam";
	    
	    System.out.println(groupOfEmployees[1][2]);
	
	    //1. Fixed in Length
	    //2. Similar Data Types only allowed
	    //3. memory allocation will happen while initiating the array itself (static) 
	    //4. Modification are not allowed 
	  
	
	
	}
	
}
