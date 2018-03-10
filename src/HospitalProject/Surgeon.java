package HospitalProject;

public class Surgeon extends Doctor implements MedicalDuties {

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
	public void careForPatient(Patient patient) {
		patient.healthlevel += 20;	
	}

		
	@Override
	public String toString() {
		//return "Surgeon [isOperating=" + isOperating + ", empNumber=" + empNumber + ", empName=" + empName + "]";
		return "Surgeon [empNumber=" + empNumber + ", empName=" + empName + ", isOperating=" + isOperating + "]";
	}
	
}
