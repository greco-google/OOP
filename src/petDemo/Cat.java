package petDemo;

public class Cat extends Pet {

	public Cat (String name, String type, int age) {
		super (name, type, age);
	}

	public String speak() {
		
		return "Meowww!";
	}
	public void useLitterBox() {
		System.out.println("Cat is using the litterbox.");
	}
	
}
