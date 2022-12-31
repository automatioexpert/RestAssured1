package Reqests;

public class EmployeeRecord {

	private String empName;
	@Override
	public String toString() {
		return "EmployeeRecord [empName=" + empName 
				
				+ ", job=" + 
				job + "]";
	}
	private String job;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	
}
