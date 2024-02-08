package language.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOpsAndDataConversions {

	public static void main(String[] args) {
     String value = "  Username : Admin | Password : admin123  ";
     
     //Get the total number of char available with in the string
     System.out.println("Total Chars in String : "+value.length());
     
     //Get the Char available in the 6th position
     System.out.println("Chars @ 6th Position : "+value.charAt (5));
     
     //Reverse a String
     for (int i = value.length()-1; i>=0 ; i--)
    	 System.out.print(value.charAt(i));
     System.out.println();
     
     //Remove unwanted spaces with in the String
     System.out.println(value);
     System.out.println(value.trim());
     
     //If you want to replace part of the String
     System.out.println(value.replace(" ", " "));

     //Usage of Regular Expressions
     String text = "BALANCE@account#123";
     
     //Remove Special Chars
     System.out.println(text.replaceAll("[!@#$%^&*()_+]","").toUpperCase());
     
     //Remove Alphabets
     System.out.println(text.replaceAll("[a-zA-Z]", ""));
     
     //Remove Numbers
     System.out.println(text.replaceAll("[0-9]", ""));
     
     //Want to print number alone
     System.out.println(text.replaceAll("[a-zA-Z]", "").replaceAll("[!@#$%^&*()_+]",""));
     
     //Get Specific text from the String
     System.out.println(value.substring(13,18));
     System.out.println(value.substring(32,40));
     
     //Get Specific text from the Dynamic String
     String [] temp = value.split(" ");
     System.out.println(temp[4]);
     System.out.println(temp[8]);
     
     //Join the String values
     String value1 = "Sef";
     String value2 = "ali";
     System.out.println(value1+value2);
     System.out.println(value1.concat(value2));
     
     //Compare two Strings
     //equals() ==> exact match includes case of each char
     //equalsIgnoreCase() ==> exact match by excluding case of chars
     //contains() ==> whether value 1 contains value 2 or not
     
     String name1 = "Sefali";
     String name2 = "sefali";
     String name3 = "Fali";
     
     System.out.println(name1.equals(name2));
     System.out.println(name1.equalsIgnoreCase(name2));
     System.out.println(name1.contains(name3));
     
     //StringBuffer ==> Synchronized
     //StringBuilder ==> Non Synchronized
     
     //Diff. b/w String and StringBuffer or StringBuilder is the ==> string is immutable but other classes are mutable
     
     String text1 = "Sefali";
     text.concat("Chetri");  // this is the concept of IMMUTABLE
     System.out.println(text1);
     
     StringBuffer sbf = new  StringBuffer("Sefali");
     sbf.append("Chetri");
     System.out.println(sbf);
     
     StringBuilder sbd = new  StringBuilder("Sefali");
     sbd.append("Chetri");
     sbd.reverse();
     System.out.println(sbd);
     
     //Data Conversions
     String amount = "10000";
     int bonus = 2000 ;
     
     //String to Integer
     int Amount = Integer.parseInt(amount);
     System.out.println("Final Amount : "+(Amount+bonus));

     //String to Boolean
     String completedDegree = "true";
     boolean completedDeg = Boolean.valueOf(completedDegree);
     if(completedDeg) {
    	 System.out.println("Eligible To Get Job");
     }
     
     //String to Float
     int price = 1000;
     String tax = "125.5";
     double Tax = Double.valueOf(tax);
     System.out.println("Final Price :"+ (price+Tax));
     
     //Any Format to String
     int  stdCode = 144;
     int ph= 345678;
     String code = String.valueOf(stdCode);
     System.out.println(code+ph) ;
     
     //Convert time stamp to String
     SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy hh:mm:ss");
     String uniqueId = sdf.format(Calendar.getInstance().getTime());
     System.out.println(uniqueId) ;
     
     //Type Casting- within the same data type lower value be upper value  and vice versa
     int num = 123;
     byte numb = (byte) num ;
     System.out.println(numb) ;
     
     double number = (double) num;
     System.out.println(number) ;
     
     double percentage = 123.54;
     int perc = (int) percentage ;
     System.out.println(perc) ;
     
     percentage = (double) perc;
     System.out.println(percentage) ;
	}
}
