package HospitalProject;

public class Doctor {

	private String empNumber;
	private String empName;
	private String speciality;
	

	public String getEmpNumber() {
		return empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public String getSpeciality() {
		return speciality;
	}
	
	
	public Doctor(String empNumber, String empName, String speciality) {
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.speciality = speciality;
	}

	
	@Override
	public String toString() {
		return "Doctor [empNumber=" + empNumber + ", empName=" + empName + ", speciality=" + speciality + "]";
	}
	
	
}
