package Assignment_1_2;

import java.util.Scanner;

public class Test {

	public static int length;
	public static int breadth;
	public static int area;

public static void main(String[] args) {
	
	Test tr= new Test();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter length and breadth for rectangle 1: ");
	tr.length=sc.nextInt();
	tr.breadth=sc.nextInt();
	tr.area= length * breadth;
	System.out.println("area of rectangle 1: "+ tr.area);
	
	
	Test t2= new Test();
	System.out.println("enter length and breadth for rectangle 2: ");
	t2.length=sc.nextInt();
	t2.breadth=sc.nextInt();
	t2.area= length * breadth;
	System.out.println("area of rectangle 2: "+ t2.area);
	

	Test t3= new Test();
	System.out.println("enter length and breadth for rectangle 3: ");
	t3.length=sc.nextInt();
	t3.breadth=sc.nextInt();
	t3.area= length * breadth;
	System.out.println("area of rectangle 3: "+ t3.area);
	

	Test t4= new Test();
	System.out.println("enter length and breadth for rectangle 4: ");
	t4.length=sc.nextInt();
	t4.breadth=sc.nextInt();
	t4.area= length * breadth;
	System.out.println("area of rectangle 4: "+ t4.area);
	

	Test t5= new Test();
	System.out.println("enter length and breadth for rectangle 5: ");
	t5.length=sc.nextInt();
	t5.breadth=sc.nextInt();
	t5.area= length * breadth;
	System.out.println("area of rectangle 5: "+ t5.area);
	
}
}
