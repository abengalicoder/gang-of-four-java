package tutorial.abengalicoder.BasicSingleton;


public class SingletonDemo 
{
	private static SingletonDemo SingletonDemo;
	
	private SingletonDemo() throws Exception  {
		if(SingletonDemo != null) throw new Exception("Reflection not supported");
		System.out.println("Hello Singleton");
	}
	
	public static SingletonDemo getSingletonDemo() throws Exception  {
		if(SingletonDemo == null) {
			SingletonDemo = new SingletonDemo();
		}
		return SingletonDemo;
	}
	
}
