package tutorial.abengalicoder.reflection;


public class ReflectionSingletonDemo 
{
	private static ReflectionSingletonDemo SingletonDemo;
	
	private ReflectionSingletonDemo() throws Exception  {
		if(SingletonDemo != null) throw new Exception("Reflection not supported");
		System.out.println("Hello Singleton");
	}
	
	public static ReflectionSingletonDemo getSingletonDemo() throws Exception  {
		if(SingletonDemo == null) {
			SingletonDemo = new ReflectionSingletonDemo();
		}
		return SingletonDemo;
	}
	
}
