package HospitalProject;

////v1.1
//public abstract class Employee {
//
//	protected int empNumber;
//	protected String empName;
//
//
//	public int getEmpNumber() {
//		return empNumber;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//	
//	public abstract String paySalary();
//
//}

//v1.2
public abstract class Employee implements Comparable<Employee> {

	protected int empNumber;
	protected String empName;


	public int getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}
	
	public abstract String paySalary();

	@Override
	public int compareTo(Employee other) {
//		if(this.getEmpName().equals(other.getEmpName())) {
//			return this.getEmpNumber().compareTo(other.getEmpNumber());
//		}
		return this.getEmpName().compareTo(other.getEmpName());
		
	}

}