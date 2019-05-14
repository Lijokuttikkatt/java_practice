package sample;

 public abstract class Lucifer {

	private int x = 10;
	protected int y;
	public static int z = 100;
	int w=100;

	Lucifer() {

	}

	Lucifer(int x, int y) {

	}
	private void display() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
	}

	protected void display1() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
	}

	public static void display2() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
	}

	void display3() {

	}

    public abstract void print();
    protected  abstract void print1();
    abstract void print3();
    
   
}

class Lal extends Lucifer
{

	@Override	
	
	protected void display1() {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
	}

	@Override
	public void print() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		
	}

	@Override
	protected void print1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void print3() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	
	Lucifer obj=new Lal();
	obj.display1();
	System.out.println(z);
	
	
}
	
	
}