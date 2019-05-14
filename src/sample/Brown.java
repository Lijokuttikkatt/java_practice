package sample;

import java.io.IOException;

public class Brown {
	
	public void display()throws ArrayIndexOutOfBoundsException{
		System.out.println("vdhvcwdgcgwdvcwdgvcwdgc");
	}
	

}

class White extends Brown
{
	public void display(){
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHH");
	}
	
	
	public static void main(String[] args) {
		
		
		White obj=new White();
		obj.display();
		
		Brown  obj1= new Brown();
		obj1.display();
		
		
		Brown  obj2= new White();
		obj2.display();
		
	}
}