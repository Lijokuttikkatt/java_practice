package sample;

public interface maduraraja {

	public static final int x = 100;
	int y = 200;

	void display();

	default void print() {

	}

	static void show() {

	}

}

class Pokkiriraja implements maduraraja, maduraraja1 {

	@Override
	public void display() {
		System.out.println("HHHHHHHHHHHHHHHH");

	}

	public static void main(String[] args) {

		Pokkiriraja obj = new Pokkiriraja();
		obj.display();
		obj.print();
		obj.print1();
		maduraraja.show();
		maduraraja1.show();

	}

}

interface maduraraja1 {

	public static final int x = 100;
	int y = 200;

	void display();

	default void print1() {

	}

	static void show() {

	}

}



