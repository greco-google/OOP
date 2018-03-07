package petDemo;

public class Cat extends Pet {

	private String name;
	private String type;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}

	
	public Cat(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	
	public String toString() {
		return "Cat [name=" + name + ", type=" + type + ", age=" + age + "]";
	}
	
}
