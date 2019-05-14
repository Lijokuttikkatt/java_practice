package sample;

public class Black {

	public static void main(String[] args) {
		
try
{
	int x=10/0;
}
catch(Exception exp)
{
	System.out.println(exp);
}
finally
{
	System.out.println("**********************");
}
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}








//Example #1:
//
//class A{
// void met(){
//   Class.forName("com.example.Class1");
// }
//}
//If com/example/Class1 doesn't exist in any of the classpaths, then It throws ClassNotFoundException.
//
//Example #2:
//
//Class B{
//  void met(){
//   com.example.Class2 c = new com.example.Class2();
// }
//}
//If com/example/Class2 existed while compiling B, but not found while execution, then It throws NoClassDefFoundError.
//
//Both are run time exceptions.
//
