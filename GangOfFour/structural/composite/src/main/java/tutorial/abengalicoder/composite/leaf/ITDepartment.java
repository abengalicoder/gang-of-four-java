package tutorial.abengalicoder.composite.leaf;

import tutorial.abengalicoder.composite.component.Department;

public class ITDepartment implements Department {
	private Integer id;
	private String name;

	public ITDepartment(int i, String string) {
		this.id = id;
		this.name = name;
	}

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

}
