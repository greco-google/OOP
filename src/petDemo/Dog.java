package petDemo;

public class Dog {

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
	
	
	public Dog(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", age=" + age + "]";
	}



	
}
