package tableView;

import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "mbEmployee")
public class MBEmployee {
	private static ArrayList<Employee> employees;
	private Employee current;

	public Employee getCurrent() {
		if (current == null) {
			current = new Employee();
		}
		return current;
	}

	public void setCurrent(Employee current) {
		this.current = current;
	}

	public MBEmployee() {
		employees = new ArrayList<Employee>();
		Department it = new Department(1, "IT");
		employees.add(new Employee(102, "Sara", 1100, it));
		employees.add(new Employee(101, "Ata", 1100, it));
		employees.add(new Employee(103, "Hana", 1100, it));

	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public String addEmployee() {
		employees.add(current);
		current = null;
		return null;

	}

	public String deleteEmployee(int index) {
		employees.remove(index);
		return null;
	}

	public String edit(int index) {
		current = employees.get(index);
		return null;
	}
	
	public String update() {
		current=null;
		return null;
	}
	
		
}
