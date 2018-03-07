package petDemo;

public class Pet {

	private String name;
	private String type;
	private int age;
	
	
	public Pet() {
		super();
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

}