package tutorial.abengalicoder.composite.leaf;

import tutorial.abengalicoder.composite.component.Department;

public class SalesDepartment implements Department {
	private Integer id;
	private String name;

	public SalesDepartment(int i, String string) {
		this.id = id;
		this.name = name;
	}

	public void printDepartmentName() {
		System.out.println(getClass().getSimpleName());
	}

}
