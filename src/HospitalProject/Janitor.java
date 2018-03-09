package HospitalProject;

public class Janitor extends Employee {

	private boolean isSweeping;
	
	
	public boolean isSweeping() {
		return isSweeping;
	}

	public Janitor(int empNumber, String empName, boolean isSweeping) {
		// Look at this if there are errors!!!!
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}

	@Override
	public String paySalary() {
		return "$40,000";
	}

	@Override
	public String toString() {
		return "Janitor [isSweeping=" + isSweeping + ", empNumber=" + empNumber + ", empName=" + empName + "]";
	}

}