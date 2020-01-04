package tableView;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;


public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int id, String name, double salary,Department department) {
		this.empId=id;
		this.empName=name;
		this.empSalary=salary;
		this.department=department;
	}
	public Employee() {
		super();
	}
	
	public int getEmpId() {
	return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}