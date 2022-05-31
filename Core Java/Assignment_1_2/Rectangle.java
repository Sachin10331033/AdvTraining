package Assignment_1_2;

public class Rectangle {
	public int length;
	public int breadth;
	public int area;


	//default constructor
	public Rectangle() {
	}


	//Constructor
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	

	public void calculatetArea() {
		
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}

public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getBreadth() {
		return breadth;
	}


	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	
	public void printData() {
		System.out.println("Length of Rectangle is : " + length);
		System.out.println("Breadth of Rectangle is : " + breadth);
	
	}
}
