package petDemo;

public abstract class Pet {

	private String name;
	private String type;
	private int age;
	
	
	public Pet(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

	
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
	
	public abstract String speak();
	
	
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", age=" + age + "]";
	}

}