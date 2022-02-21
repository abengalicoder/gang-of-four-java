package tutorial.abengalicoder.composite;

import tutorial.abengalicoder.composite.component.Department;
import tutorial.abengalicoder.composite.composite.DepartmentComposite;
import tutorial.abengalicoder.composite.leaf.ITDepartment;
import tutorial.abengalicoder.composite.leaf.SalesDepartment;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Department salesDepartment = new SalesDepartment(1, "Sales department");
		Department financialDepartment = new ITDepartment(
				2, "Financial department");

		DepartmentComposite headDepartment = new DepartmentComposite(
				3, "Head department");

		headDepartment.addDepartment(salesDepartment);
		headDepartment.addDepartment(financialDepartment);

		headDepartment.printDepartmentName();
	}
}
