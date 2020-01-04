package tableView;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="mbDepartment")
public class MBDepartment {
	ArrayList <Department> departments;
	
	
	public ArrayList<Department> getDepartments() {
		return departments;
	}


	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}


	public MBDepartment(){
		departments = new ArrayList<Department>();
		departments.add(new Department(1,"IT"));
		departments.add(new Department(2,"Sales"));
	}

}
