package HospitalProject;

////v1.1
//public class MedicalDispacher extends Doctor {
//
//
//	public MedicalDispacher(int empNumber, String empName, String speciality) {
//		super(empNumber, empName, speciality);
//		// TODO Auto-generated constructor stub
//
//}


//v1.2
public class MedicalDispacher extends Receptionist implements MedicalDuties {

	private String department;

	public MedicalDispacher(int empNumber, String empName, String department, boolean isAnswering) {
		super(empNumber, empName, isAnswering);
		this.department = department;
		
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.healthlevel += 10;
		
	}

	@Override
	public void drawBloodFromPatient(Patient patient) {
		patient.bloodLevel -= 5;
		
	}
	
	@Override
	public String paySalary() {
		return "$55,000";
	}

}
