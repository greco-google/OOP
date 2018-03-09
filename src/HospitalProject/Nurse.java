package HospitalProject;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;
	
	
	public int getNumPatients() {
		return numPatients;
	}
	
	
	public Nurse(int empNumber, String empName, int numPatients) {
		// Look at this if there are errors!!!!
		super();
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}
	
	
	@Override
	public String paySalary() {
		return "$50,000";
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
		return "Nurse [empNumber=" + empNumber + ", empName=" + empName + ", numPatients=" + numPatients + "]";
	}



	
	
}
