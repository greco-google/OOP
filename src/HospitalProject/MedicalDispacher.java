package HospitalProject;



public class MedicalDispacher extends Receptionist implements MedicalDuties {


	@Override
	public void careForPatient(Patient patient) {
		patient.healthlevel += 10;
		
	}

	@Override
	public void drawBloodFromPatient(Patient patient) {
		patient.bloodLevel -= 5;
		
	}

}
