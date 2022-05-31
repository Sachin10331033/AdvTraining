package Assignment_1_4;

public class Rec_new {
	 private float length; 
	 private float breadth; 
	 
	 public Rec_new() { 
	  length = 1; 
	  breadth = 1; 
	 } 
	 
	 public Rec_new(float length, float breadth) { 
	  this.length = length; 
	  this.breadth = breadth; 
	 
	 } 
	 
	 public float getLength() { 
	  return length; 
	 } 
	 
	 public void setLength(float length) { 
	  this.length = length; 
	 } 
	 
	 public float getBreadth() { 
	  return breadth; 
	 } 
	 
	 public void setBreadth(float breadth) { 
	  this.breadth = breadth; 
	 } 
	  
	 public float calculateArea() { 
	  return length*breadth; 
	 } 
	  
	 public float calculatePeri() { 
	  return 2*(length+breadth); 
	 } 
	 
	 public void display() { 
	  System.out.println("Length: " + length); 
	  System.out.println("Bredth: " + breadth); 
	  System.out.println("Area of Rectangle: " + calculateArea()); 
	  System.out.println("Perimeter of Rectangle: " + calculatePeri()); 
	 } 
	 
}
