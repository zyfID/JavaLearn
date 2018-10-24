package Unit16;

import java.lang.reflect.Method;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//首先实例化一个类的对象，然后通过该对象获得该类的路径。 
		Exam3 example =new Exam3();
		Class exampleC = example.getClass();
		
		
		//获得所有方法
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(int i=0; i<declaredMethods.length; i++) {
			Method method = declaredMethods[i];
			System.out.println("名称是："+method.getName());
			System.out.println("是否允许带有可变数量的参数："+method.isVarArgs());
			System.out.println("入口参数类型依次为：");
			
			//获得所有参数类型
			Class[] parameterTypes = method.getParameterTypes();
			for(int j=0; j<parameterTypes.length; j++) {
				System.out.println(" "+parameterTypes[j]);
			}
			
			//获得方法返回值类型
			System.out.println("返回值类型为："+method.getReturnType());
			
			//获得方法可能抛出的所有异常的类型
			System.out.println("可能抛出的异常类型为：");
			Class[] exceptionTypes = method.getExceptionTypes();
			for(int j=0; j<exceptionTypes.length; j++) {
				System.out.println(" "+exceptionTypes[j]);
			}
			
			boolean isTurn = true;
			while(isTurn) {
				
				//如果该方法访问权限是private，侧抛出异常
				try {
					isTurn = false;
					
					if ("staticMethod".equals(method.getName())) {
						method.invoke(example);
					}else if ("intMethod".equals(method.getName())) {
						System.out.println("返回值是："+method.invoke(example, 168));
					}else if ("protectedMethod".equals(method.getName())) {
						System.out.println("返回值是："+method.invoke(example, "7",5));
					}else if ("privateMethod".equals(method.getName())) {
						Object[] parameters = new Object[] {new String[] {"M","W","Q"}};
						System.out.println("返回值是："+method.invoke(example, parameters));
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("在执行方法是抛出异常，下面执行setAccessible()方法");
					method.setAccessible(true);
					isTurn = true;
					
				}
				
			}
			
			System.out.println();
		}

	}

}
