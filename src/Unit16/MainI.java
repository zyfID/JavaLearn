package Unit16;

import java.lang.reflect.Constructor;

public class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_01 example = new Example_01("10", "20","30");
		//获得类的名字，并将其赋予exampleC。
		Class<?extends Example_01> exampleC = example.getClass();
		
		//System.out.println(exampleC);
		
		//获得所有构造方法
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		for(int i=0; i<declaredConstructors.length; i++) {
			Constructor<?>constructor = declaredConstructors[i];
			
			System.out.println("查看是否允许带有可变数量的参数："+constructor.isVarArgs());
			System.out.println("该构造方法的入口参数类型依次是：");
			
			Class[] parameterTypes = constructor.getParameterTypes();
			for(int j=0; j<parameterTypes.length; j++) {
				System.out.println(" "+parameterTypes[j]);
			}
			
			System.out.println("该构造方法可能抛出的异常类型为：");
			Class[] exceptionTypes = constructor.getExceptionTypes();
			for(int j=0; j<exceptionTypes.length; j++) {
				System.out.println(exceptionTypes[j]);
			}
			
			
			Example_01 example2 = null;
			
			while(example2 == null) {
				try {
					if (i == 2) {
						example2 = (Example_01)constructor.newInstance();
					}else if (i == 1) {
						example2 = (Example_01)constructor.newInstance("7",5);
					}else {
						Object[] paremeters = new Object[] {new String[] {"100","200","300"}};
						example2 = (Example_01)constructor.newInstance(paremeters);
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
					constructor.setAccessible(true);
				}
			}
			
			if (example2!=null) {
				example2.print();
				System.out.println();
			}
		}

	}

}
