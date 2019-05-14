package sample;

import java.util.HashSet;
import java.util.Set;

public class String001 {
	
	
	
	public static Set<String> display(){
	
		Set<String> st=new HashSet<>();
	
		st.add("Lijo");
		st.add("Kijo");
		st.add("Vijo");
		st.add("Bijo");
		st.add("Cijo");
		st.add("Rijo");
		
		
		return st;
	}

	
	void print()
	{
		Set<String> str=display();
		
		for (Object var :str  ) 
		{ 
		   System.out.println(var);
		}
	}
	

public static void main(String[] args) {
//String str ="mac man search monday man man";
//System.out.println(str.indexOf('m', str.indexOf('m')+1)); 
//System.out.println(str.indexOf('m', str.indexOf('m')+4)); 	
//int i=5;
//System.out.println(++i+i++);
//System.out.println(i++);
//System.out.println(++i);
//
//int x=100;
//int y=200;
//String z="Lijo";
//System.out.println(x+y+z);
//System.out.println(z+x+y);
//
//System.out.println(str.replace('m', 'l'));
//
//System.out.println(str.replaceAll("man", "Cat"));
String001 obj=new String001();
obj.print();


}	

}
