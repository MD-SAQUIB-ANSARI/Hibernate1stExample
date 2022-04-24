package Eample.Hibernate;

public class Employee {
	private Integer empNo;
	private String empName;
	private Integer empSal;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
}
