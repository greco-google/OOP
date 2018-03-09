package HospitalProject;

public class Doctor extends Employee implements MedicalDuties {

	private String speciality;
	

	public String getSpeciality() {
		return speciality;
	}
	
	
	public Doctor(int empNumber, String empName, String speciality) {
		// Look at this if there are errors!!!!
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.speciality = speciality;
	}

	
	@Override
	public String paySalary() {
		return "$90,000";
	}
	
	
	@Override
	public void careForPatient(Patient patient) {
		patient.healthlevel += 10;
		
	}

	@Override
	public void drawBloodFromPatient(Patient patient) {
		patient.bloodLevel -=5;
		
	}
	
	
	@Override
	public String toString() {
		return "Doctor [empNumber=" + empNumber + ", empName=" + empName + ", speciality=" + speciality + "]";
	}
}
