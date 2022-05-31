package Assignment_1_3;

public class Test {
	public void createBooks() {
		Book bk[] = new Book[2];		 
	      bk[0] = new Book("Java Programing", 350);
	      bk[1] = new Book("Let Us C", 200);
	      for(int i = 0; i<bk.length; i++) {
		         bk[i].display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    Test c1 = new Test();  
		c1.showBooks();
	   
	      }

}
