package Assignment_1_4;

import java.util.Scanner;

public class Test {
	 public static void main(String[] args) { 
		  System.out.println("with default values"); 
		  Rec_new r1 = new Rec_new(); 
		  System.out.println("Lentgh: " + r1.getLength() + ", Breadth: " + r1.getBreadth()); 
		  System.out.println("Display Method"); 
		  r1.display(); 
		 
		  System.out.println("\nWith user input"); 
		  Rec_new r2 = new Rec_new(); 
		  System.out.println("Enter Length: "); 
		  r2.setLength(new Scanner(System.in).nextFloat()); 
		  System.out.println("Enter Breadth: "); 
		  r2.setBreadth(new Scanner(System.in).nextFloat()); 
		  System.out.println("Display Method"); 
		  r2.display(); 
		 
		  System.out.println("\nPassing Values By Parameterized Constructor, length = 5, breadth = 7"); 
		  Rec_new r3 = new Rec_new(5, 7); 
		  System.out.println("Length: " + r3.getLength() + ", Breadth: " + r3.getBreadth()); 
		  System.out.println("Display Method"); 
		  r3.display(); 
		 
		  System.out.println("\nWith user input"); 
		  Rec_new r4 = new Rec_new(); 
		  System.out.println("Enter Length: "); 
		  r4.setLength(new Scanner(System.in).nextFloat()); 
		  System.out.println("Enter Breadth: "); 
		  r4.setBreadth(new Scanner(System.in).nextFloat()); 
		  System.out.println("Display Method"); 
		  r4.display(); 
		 
		  System.out.println("\nWith user input"); 
		  Rec_new r5 = new Rec_new(); 
		  System.out.println("Enter Length: "); 
		  r5.setLength(new Scanner(System.in).nextFloat()); 
		  System.out.println("Enter Breadth: "); 
		  r5.setBreadth(new Scanner(System.in).nextFloat()); 
		  System.out.println("Display Method"); 
		  r5.display(); 
		 
		 } 
}
