package Unit16;

import java.lang.reflect.Field;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam2 example = new Exam2();
		Class exampleC = example.getClass();
		
		//获得所有成员变量
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(int i=0; i<declaredFields.length; i++) {
			Field field = declaredFields[i];
			
			//获得成员变量名称
			System.out.println("名称为："+field.getName());
			Class fieldType = field.getType();
			System.out.println("类型为："+fieldType);
			boolean isTurn = true;
			
			while(isTurn) {
				//如果该成员变量的访问权限为private，则抛出异常，即不允许访问
				try {
					isTurn = false;
					
					//获得成员变量值
					System.out.println("修改前值为："+field.get(example));
					
					//判断成员变量类型是否为int型
					if (fieldType.equals(int.class)) {
						System.out.println("利用方法setInt()方法修改成员变量的值");
						field.setInt(example, 168);
					}else if (fieldType.equals(float.class)) {
						System.out.println("利用setFloat()方法修改成员变量的值");
						field.setFloat(example, 99.9F);
					}else if (fieldType.equals(boolean.class)) {
						System.out.println("利用setBoolean()方法修改成员变量的值");
						field.setBoolean(example, true);
					}else {
						System.out.println("利用set()方法修改成员变量的值");
						field.set(example, "MWQ");
					}
					
					//获得修改后的成员变量值
					System.out.println("修改后的成员变量值："+field.get(example));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("在设置成员变量值时抛出异常，下面执行setAccessible()方法！");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			
			System.out.println();
		}

	}

}
