package HospitalProject;

public class Receptionist extends Employee {

	private boolean isAnswering;
	
	
	public boolean isAnswering() {
		return isAnswering;
	}

	public Receptionist(int empNumber, String empName, boolean isAnswering) {
		// Look at this if there are errors!!!!
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.isAnswering = isAnswering;
	}

	@Override
	public String paySalary() {
		return "$45,000";
	}

	@Override
	public String toString() {
		return "Receptionist [isAnswering=" + isAnswering + ", empNumber=" + empNumber + ", empName=" + empName + "]";
	}

}
