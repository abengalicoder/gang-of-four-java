package tutorial.abengalicoder.Adapter;

import tutorial.abengalicoder.Adapter.model.Employee;
import tutorial.abengalicoder.Adapter.model.SeniorEmployee;

public class SeniorEmployeeAdapter implements Employee{
	SeniorEmployee seniorEmployee;
	public SeniorEmployeeAdapter(SeniorEmployee seniorEmployee) {
		this.seniorEmployee = seniorEmployee;
	}

	public Integer getId() {
		return seniorEmployee.getId();
	}

	public String getFirstName() {
		return seniorEmployee.getFirstName();
	}

	public String getLastName() {
		return seniorEmployee.getLastName();
	}

	public String getEmail() {
		return seniorEmployee.getEmail();
	}

	@Override
	public String toString()
	{
		return "seniorEmployeeAdapter{" +
				"seniorEmployee=" + seniorEmployee +
				'}';
	}
}
