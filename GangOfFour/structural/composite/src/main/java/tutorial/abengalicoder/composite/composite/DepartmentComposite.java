package tutorial.abengalicoder.composite.composite;

import java.util.ArrayList;
import java.util.List;

import tutorial.abengalicoder.composite.component.Department;

public class DepartmentComposite implements Department {
	 private Integer id;
	    private String name;

	    private List<Department> childDepartments;

	    public DepartmentComposite(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	        this.childDepartments = new ArrayList<Department>();
	    }

	    public void printDepartmentName() {
	        childDepartments.forEach(Department::printDepartmentName);
	    }

	    public void addDepartment(Department department) {
	        childDepartments.add(department);
	    }

	    public void removeDepartment(Department department) {
	        childDepartments.remove(department);
	    }
}
