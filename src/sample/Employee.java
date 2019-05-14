//package sample;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Employee {
//
//	private int age;
//	private String name;
//
//	public Employee(int age, String name) {
//		this.age = age;
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [age=" + age + ", name=" + name + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 41;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//
//	public void display() {
//		try {
//			// int x=10/0;
//			// System.out.println(x);
//
//			// throw new NumberFormatException("****************");
//
//		}
//
//		catch (Exception exp) {
//			System.out.println(exp);
//		}
//	}
//
//	@SuppressWarnings("unused")
//	public static void main(String[] args) {
//
//		//
//		//
//		// for(int x=0;x<10;x++)
//		// {
//		// System.out.println(x);
//		// }
//		//
//
//		int h = 0;
//		while (h < 15) {
//			System.out.println(h);
//			h++;
//		}
//
//		int y = 0;
//		do {
//
//		} while (y == 10);
//
//		List alr = new ArrayList();
//
//		// for(List str : alr) {
//
//	}
//
//	Employee emp1 = new Employee(25, "Roshan");
//	Employee emp2 = new Employee(35, "Loshan");
//	Employee emp3 = new Employee(45, "Soshan");
//	Employee emp4 = new Employee(65, "Voshan");
//	Employee emp5 = new Employee(75, "Koshan");
//	Employee emp6 = new Employee(85, "Aoshan");
//
//	List<Employee> ls = new ArrayList<Employee>();
//
//	ls.add(emp1);ls.add(emp2);ls.add(emp3);ls.add(emp4);ls.add(emp5);ls.add(emp6);
//
//	Map<Integer, Employee> mp = new HashMap<Integer, Employee>();
//
//	mp.put(101,emp1);mp.put(102,emp2);mp.put(103,emp3);mp.put(104,emp4);mp.put(105,emp5);mp.put(106,emp6);
//
//	for(Map.Entry<Integer, Employee> entry:mp.entrySet())
//	{
//		// System.out.println(entry);
//		System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
//
//	}
//
//	// for (Employee emp: mp)
//	// {
//	// // System.out.println(emp.getName()+ " "+ emp.getAge());
//	// System.out.println(emp);
//	//
//	// }
//
//	emp1.display();
//
//	int x = 20;
//
//	if(x>30)
//
//	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");System.out.println("#########################");System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
//
//	String str = null;
//
//	if(str==null)System.out.println("100");System.out.println("100");System.out.println("100");
//
//	String str1 = "MATHEMATICS";
//
//	System.out.println(str1.substring(3).substring(2,3));
//
//	int w = 100;
//	int u = 3;if(w==100)
//	{
//
//		int xx = 500;
//
//		if (xx != 100) {
//			System.out.println("HHHHHHHHHHHHHHHHHHHHH");
//		}
//
//		else if (u != 200) {
//			System.out.println("TTTTTTTTTTTTTTTTTTTTTTT");
//		}
//
//	}
//
//	{
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
//	}
//
//	 int k=5;
//
//	switch(k)
//	{
//		case 1:
//			System.out.println(" 1 ");
//			break;
//		case 2:
//			System.out.println(" 2 ");
//			break;
//		case 3:
//			System.out.println(" 3 ");
//			break;
//		case 4:
//			System.out.println(" 4 ");
//			break;
//		case 54:
//			System.out.println(" 5 ");
//			int t=10;
//			if(t==10)
//			{
//				System.out.println("WMWMWMWMWMWMWMWMWMWMWMWMWMWMWMW");
//			}
//			break;
//			default: 
//				System.out.println("Noooooooooo   !!!!");
//				break;
//				
//				
//			
//				
//		}
//
//}
//
//}
