package petDemo;

public class Dog extends Pet {

	public Dog (String name, String type, int age) {
		super (name, type, age);
	}

	public String speak() {
		return "Woof!";
	}
	public void walk() {
		System.out.println("The dog is out for a walk.");
	}
}
