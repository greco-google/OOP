package HospitalProject;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	//Lowest level
	private List <Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void showAllMedicalPersonnel() {
		for (Employee employee: employees) {
			if (employee instanceof MedicalDuties) {
				System.out.println(employee);
			}
		}
	}
	
	public void showAllSalaryRates() {
		for (Employee employee: employees) {
			System.out.println(employee.getEmpName() + " makes " + employee.paySalary());
		}
	}
	
	public void showAllEmployees() {
		for(Employee employee: employees) {
			System.out.println(employee.getEmpName() + " " + employee.getEmpNumber());
		}
	}
	
	
}
