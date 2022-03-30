package tutorial.abengalicoder.BasicSingleton;

import java.lang.reflect.Constructor;

public class Demo {
	public static void main(String[] args) throws Exception {
		SingletonDemo s = SingletonDemo.getSingletonDemo();
		
		System.out.println(s.hashCode());
		
		SingletonDemo s1 = SingletonDemo.getSingletonDemo();
		System.out.println(s1.hashCode());
		
		
		SingletonDemo s2 = null;
		//Reflection Api
		Constructor[] constructors = SingletonDemo.class.getDeclaredConstructors();
		for(Constructor c: constructors) {
			c.setAccessible(true);
			s2 = (SingletonDemo) c.newInstance();
		}
		System.out.println(s2.hashCode());
		
		
	}
}
