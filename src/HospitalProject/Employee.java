package HospitalProject;

public abstract class Employee {

	protected int empNumber;
	protected String empName;


	public int getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}
	
	public abstract String paySalary();

}