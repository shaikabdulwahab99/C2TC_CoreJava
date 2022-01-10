package general;

class Animal {
	int legs;
	String name;
	String color;

	public Animal() {
		System.out.println("this is default constructor");

	}

	public Animal(String name) {
		this();
		this.name = name;
	}

	public Animal(String name, String color) {

		this(name);
		this.color = color;
	}

	public Animal(int legs, String name, String color) {

		this(name, color);
		this.legs = legs;
	}

	void display() {
		System.out.println("Animals description ");
		System.out.println(color + " " + "color" + name + "" + "with" + " " + legs + "legs");
	}

}

public class ThisDemo {

	public static void main(String[] args) {
		Animal obj3 = new Animal(4, "cat", "white");
		obj3.display();

		Animal obj2=new Animal("dogs","black");
		obj2.display();
		
		Animal obj1=new Animal("lion");
		obj1.display();	
	}

}