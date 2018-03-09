package HospitalProject;

public class Surgeon extends Doctor {

	private boolean isOperating;
	
	
	public boolean isOperating() {
		return isOperating;
	}


	public Surgeon(int empNumber, String empName, String speciality, boolean isOperating) {
		super(empNumber, empName, speciality);
		this.isOperating = isOperating;
	}
	
	@Override
	public String paySalary() {
		return "$120,000";
	}
	
	
	@Override
	public String toString() {
		return "Surgeon [isOperating=" + isOperating + ", empNumber=" + empNumber + ", empName=" + empName + "]";
	}
	
}
