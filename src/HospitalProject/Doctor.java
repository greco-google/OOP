package HospitalProject;

public class Doctor extends Employee {

	private String speciality;
	

	public String getSpeciality() {
		return speciality;
	}
	
	
	public Doctor(int empNumber, String empName, String speciality) {
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
