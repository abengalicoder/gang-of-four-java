package tutorial.abengalicoder.Adapter;

import tutorial.abengalicoder.Adapter.model.Employee;
import tutorial.abengalicoder.Adapter.model.SeniorEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e = new SeniorEmployee(1, "Joydev", "Das", "a!sasa");
		SeniorEmployeeAdapter seniorEmployeeAdapter = new SeniorEmployeeAdapter((SeniorEmployee) e);
		seniorEmployeeAdapter.toString();
    }
}
