package Unit16;

import java.lang.reflect.Constructor;

public class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_01 example = new Example_01("10", "20","30");
		//���������֣������丳��exampleC��
		Class<?extends Example_01> exampleC = example.getClass();
		
		//System.out.println(exampleC);
		
		//������й��췽��
		Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
		for(int i=0; i<declaredConstructors.length; i++) {
			Constructor<?>constructor = declaredConstructors[i];
			
			System.out.println("�鿴�Ƿ��������пɱ������Ĳ�����"+constructor.isVarArgs());
			System.out.println("�ù��췽������ڲ������������ǣ�");
			
			Class[] parameterTypes = constructor.getParameterTypes();
			for(int j=0; j<parameterTypes.length; j++) {
				System.out.println(" "+parameterTypes[j]);
			}
			
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
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
					System.out.println("�ڴ�������ʱ�׳��쳣������ִ��setAccessible()����");
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