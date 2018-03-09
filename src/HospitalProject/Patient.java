package HospitalProject;

public class Patient {

	private String name;
	protected int healthlevel;
	protected int bloodLevel;
	
	
	public String getName() {
		return name;
	}

	public int getHealthlevel() {
		return healthlevel;
	}
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	
	public Patient(String name, int healthlevel, int bloodLevel) {
		this.name = name;
		this.healthlevel = healthlevel;
		this.bloodLevel = bloodLevel;
	}
}
