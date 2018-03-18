package HospitalProject;

public class HospitalApp {

	public static void main(String[] args) {
		
//		Employee phil = new Doctor (1111, "Phil", "Brain");
//		Nurse donna = new Nurse (1112, "dDonna", 3);
//		
//		System.out.println(phil);
//		System.out.println(donna);
		
		Hospital myHospital = new Hospital();
		Patient Zack = new Patient("Zack", 70, 100);
		
		Doctor Phil = new Doctor(1111, "Phil", "General");
		myHospital.addEmployee(Phil);
		
		Surgeon Steve = new Surgeon(1112, "Steve", "General", true);
		myHospital.addEmployee(Steve);
		
		Janitor Rosie = new Janitor(1113, "Rosie", true);
		myHospital.addEmployee(Rosie);
		
//		//for v1.1
//		MedicalDispacher leslie = new MedicalDispacher(3333, "Leslie", "Dispach");
//		myHospital.addEmployee(leslie);
//		leslie.drawBloodFromPatient(Zack);
//		leslie.careForPatient(Zack);
		
		//for v1.2
		MedicalDispacher leslie = new MedicalDispacher(3333, "Leslie", "Dispach", false);
		myHospital.addEmployee(leslie);
		leslie.drawBloodFromPatient(Zack);
		leslie.careForPatient(Zack);
		
		System.out.println("Before care stats: " + Zack);
		Phil.careForPatient(Zack);
		Phil.drawBloodFromPatient(Zack);
		System.out.println("After care stats: " + Zack);
		
		System.out.println("\nThese folks are able to give Medical Care: ");
		myHospital.showAllMedicalPersonnel();
		
		System.out.println("\nHere are the Salary Rates: ");
		myHospital.showAllSalaryRates();
		

	}

}
