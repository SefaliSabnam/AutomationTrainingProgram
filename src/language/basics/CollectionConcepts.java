package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionConcepts {

   //1. Fixed in Length
   //2. Similar Data Types only allowed  ==> Not Solved
   //3. memory allocation will happen while initiating the array itself (static) 
   //4. Modification are not allowed
	
	public static void main(String[] args) {
		
		//Collections
		
		//1. List ==> ArrayList and LinkedList
		
//		==> List can Store Multiple values with Same Data Type 
//	    ==> List will allocate memory dynamically to store values (Only when it's required)
//	    ==> No need to specify size (like  length in Array)
//		==> Modification Allowed 
//		==> LIST CAN STORE DUPLICATED VALUES
		
		//2. Set ==> HashSet , LinkedHashSet and TreeSet

//		==> Set can Store Multiple values with Same Data Type 
//	    ==> Set will allocate memory dynamically to store values (Only when it's required)
//   	==> No need to specify size (like  length in Array)
//		==> Modification Allowed 
//  	==> SET CANNOT STORE DUPLICATED VALUES
		
		//3. Map <Key, Value> ==> HashMap , LinkedHashMap , TreeMap and HashTable
//		==> Map Can Store multiple values with different data types together (2 data tpes)
//		==> Map can Store Multiple values wit Same Data Type 
//	    ==> Map will allocate memory dynamically to store values (Only when it's required)
//		==> No need to specify size (like  length in Array)
//		==> Modification Allowed 
//		==> MAP ALLOW DUPLICATED VALUES BUT WILL NOT ALLOW DUPLICATE KEYS
		
		//     Syntax of Collection:
		
//		Collection<DataType> Variable = new CollectionName<DataType>();
//      Syntax to store value : Variable.add(Value);
//      Syntax to store value : Variable.get(Index);
       
		
		   /**********ArrayList******/
		   System.out.println("=========ArrayList========");
		  //Order of Storing the Values ==> Insertion Order
		   //Storing null Values ==> Can Store null values
		   
		   List<String> empNamesArrayList = new ArrayList<String>();
		   empNamesArrayList.add("Sefali");
		   empNamesArrayList.add("Sky");
		   empNamesArrayList.add("Sharon");
		   empNamesArrayList.add("Sefali");
		   empNamesArrayList.add(null);   // null meaning no value (literal) ==>getting memory from computer but not storing any value

		   //		   empNamesArrayList.remove("Sharon");
		   
		    System.out.println(empNamesArrayList);
		  
		    
		 
		/**********LinkedList******/
	   System.out.println("=========LinkedList========");
	  //Order of Storing the Values ==> Insertion Order
	   //Storing null Values ==> Can Store null values
	   
	   List<String> empNamesLinkedList = new LinkedList<String>();
//    System.out.println("Size of LinkedList while Intiating : "+empNamesLinkedList.size());	 
	   empNamesLinkedList.add("Sefali");
	   empNamesLinkedList.add("Sky");
	   empNamesLinkedList.add("Sharon");
	   empNamesLinkedList.add("Sefali");
	   empNamesLinkedList.add(null);   // null meaning no value (literal) ==>getting memory from computer but not storing any value
//	   empNamesLinkedList.remove("Sharon");
	   
	  System.out.println(empNamesLinkedList);
	 
	  // Hash ==> Random , Link ==> Insertion , Tree ==> Alphabetical/Ascending
	  
	  /**********HashSet******/
	  
	   System.out.println("=========HashSet========");
	  //Order of Storing the Values ==> Random Order
	   //Storing null Values ==> Null values are allowed
	   
	   Set<String> empNamesHashSet = new HashSet<String>();
//   System.out.println("Size of HashSet while Intiating : "+empNamesHashSet.size());	 
	   empNamesHashSet.add("Sefali");
	   empNamesHashSet.add("Rony");
	   empNamesHashSet.add("Sky");
	   empNamesHashSet.add("Sharon");
	   empNamesHashSet.add("Sefali");
	   empNamesHashSet.add(null);  
	   
	  System.out.println(empNamesHashSet);
	
	  /**********LinkedHashSet******/
	  
	   System.out.println("=========LinkedHashSet========");
	  //Order of Storing the Values ==> Insertion Order
	   //Storing null Values ==> Null values are allowed
	   
	   Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
//  System.out.println("Size of LinkedHashSet while Intiating : "+empNamesLinkedHashSet.size());	 
	   empNamesLinkedHashSet.add("Sefali");
	   empNamesLinkedHashSet.add("Rony");
	   empNamesLinkedHashSet.add("Sky");
	   empNamesLinkedHashSet.add("Sharon");
	   empNamesLinkedHashSet.add("Sefali");
	   empNamesLinkedHashSet.add(null);  
	   
	  System.out.println(empNamesLinkedHashSet);
	  
	  /**********TreeSet******/
	  
	   System.out.println("=========TreeSet========");
	  //Order of Storing the Values ==> Alphabetical Order
	   //Storing null Values ==> Null values are  not allowed
	   
	   Set<String> empNamesTreeSet = new TreeSet<String>();
// System.out.println("Size of TreeSet while Intiating : "+empNamesTreeSet.size());	 
	   empNamesTreeSet.add("Sefali");
	   empNamesTreeSet.add("Rony");
	   empNamesTreeSet.add("Sky");
	   empNamesTreeSet.add("Sharon");
	   empNamesTreeSet.add("Sefali");
//	   empNamesTreeSet.add(null);  
	   
	  System.out.println(empNamesTreeSet);
	
	//Map Concepts   ==>Duplicate Values allowed but Duplicate Keys are not allowed
	  System.out.println("=========HashMap========");
	   //Order  ==> Random Order of Keys
	   //Null Values ==> Null Keys are allowed and Null Values also allowed
	  
	  Map<String,Integer>  empDetailsHashMap = new HashMap<String,Integer>();
	  empDetailsHashMap.put("Sefali", 1);
	  empDetailsHashMap.put("Rony", 2);
	  empDetailsHashMap.put("Sky", 2);
	  empDetailsHashMap.put("Sharon", 4);
	  empDetailsHashMap.put("Sefali", 5);
	  empDetailsHashMap.put("ABC",null);
	  empDetailsHashMap.put(null, 7);
	  
	  System.out.println(empDetailsHashMap);
	  
	  System.out.println("=========LinkedHashMap========");
	   //Order  ==> Insertion Order of Keys
	   //Null Values ==> Null Keys are allowed and Null Values also allowed
	  
	  Map<String,Integer>  empDetailsLinkedHashMap = new LinkedHashMap<String,Integer>();
	  empDetailsLinkedHashMap.put("Sefali", 1);
	  empDetailsLinkedHashMap.put("Rony", 2);
	  empDetailsLinkedHashMap.put("Sky", 2);
	  empDetailsLinkedHashMap.put("Sharon", 4);
	  empDetailsLinkedHashMap.put("Sefali", 5);
	  empDetailsLinkedHashMap.put("ABC",null);
	  empDetailsLinkedHashMap.put(null, 7);
	  
	  System.out.println(empDetailsLinkedHashMap);
	  
	  System.out.println("=========TreeMap========");
	   //Order  ==> Alphabetical Order of Keys
	   //Null Values ==> Null Keys are not allowed , Null Values also allowed
	  
	  Map<String,Integer>  empDetailsTreeMap = new TreeMap<String,Integer>();
	  empDetailsTreeMap.put("Sefali", 1);
	  empDetailsTreeMap.put("Rony", 2);
	  empDetailsTreeMap.put("Sky", 2);
	  empDetailsTreeMap.put("Sharon", 4);
	  empDetailsTreeMap.put("Sefali", 5);
	  empDetailsTreeMap.put("ABC",null);
//	  empDetailsTreeMap.put(null, 7);
	  
	  System.out.println(empDetailsTreeMap);
	
	  System.out.println("=========Hashtable========");
	   //Order  ==> Random Order of Keys
	   //Null Values ==> Null Keys are not allowed and Null Values also not allowed
	  
	  Map<String,Integer>  empDetailsHashtable = new Hashtable<String,Integer>();
	  empDetailsHashtable.put("Sefali", 1);
	  empDetailsHashtable.put("Rony", 2);
	  empDetailsHashtable.put("Sky", 2);
	  empDetailsHashtable.put("Sharon", 4);
	  empDetailsHashtable.put("Sefali", 5);
//	  empDetailsHashtable.put("ABC",null);
//	  empDetailsHashtable.put(null, 7);
	  
	  System.out.println(empDetailsHashtable);
	  
	  
	  List<String> sefaliDetalis = new ArrayList<String>();
	  sefaliDetalis.add("Odisha");
	  sefaliDetalis.add("Btech");
	  sefaliDetalis.add("Bhubaneswar");
	  sefaliDetalis.add("020905");
	  sefaliDetalis.add("12345678");
	  
	  Map<String, List<String>> empDetails = new HashMap<String,List<String>>();
	  empDetails.put("Sefali", sefaliDetalis);
	  
	  System.out.println(empDetails.get("Sefali").get(3));
	}

}
