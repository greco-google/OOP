package HospitalProject;

public class Nurse {

	private String empNumber;
	private String empName;
	private int numPatients;
	
	
	public String getEmpNumber() {
		return empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public int getNumPatients() {
		return numPatients;
	}
	
	
	public Nurse(String empNumber, String empName, int numPatients) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}
	
	
	
	@Override
	public String toString() {
		return "Nurse [empNumber=" + empNumber + ", empName=" + empName + ", numPatients=" + numPatients + "]";
	}
	
	
}
