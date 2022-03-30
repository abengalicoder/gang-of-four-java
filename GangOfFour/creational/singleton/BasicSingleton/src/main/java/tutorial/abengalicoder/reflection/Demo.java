package tutorial.abengalicoder.reflection;

import java.lang.reflect.Constructor;

public class Demo {
	public static void main(String[] args) throws Exception {
		ReflectionSingletonDemo s = ReflectionSingletonDemo.getSingletonDemo();
		
		System.out.println(s.hashCode());
		
		ReflectionSingletonDemo s1 = ReflectionSingletonDemo.getSingletonDemo();
		System.out.println(s1.hashCode());
		
		
		ReflectionSingletonDemo s2 = null;
		//Reflection Api
		Constructor[] constructors = ReflectionSingletonDemo.class.getDeclaredConstructors();
		for(Constructor c: constructors) {
			c.setAccessible(true);
			s2 = (ReflectionSingletonDemo) c.newInstance();
		}
		System.out.println(s2.hashCode());
		
		
	}
}
