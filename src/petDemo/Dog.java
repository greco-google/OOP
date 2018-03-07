package petDemo;

public class Dog extends Pet {

	public Dog (String name, String type, int age) {
		super (name, type, age);
	}

	public String speak() {
		return "Woof!";
	}
	
	public void walk() {
		System.out.println(this.name + "is walking...");
		//System.out.println(this.getName() + "is walking...");
		//this is when the name variable is private instead of protected
	}
}
