package Unit16;

import java.lang.reflect.Method;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����ʵ����һ����Ķ���Ȼ��ͨ���ö����ø����·���� 
		Exam3 example =new Exam3();
		Class exampleC = example.getClass();
		
		
		//������з���
		Method[] declaredMethods = exampleC.getDeclaredMethods();
		for(int i=0; i<declaredMethods.length; i++) {
			Method method = declaredMethods[i];
			System.out.println("�����ǣ�"+method.getName());
			System.out.println("�Ƿ�������пɱ������Ĳ�����"+method.isVarArgs());
			System.out.println("��ڲ�����������Ϊ��");
			
			//������в�������
			Class[] parameterTypes = method.getParameterTypes();
			for(int j=0; j<parameterTypes.length; j++) {
				System.out.println(" "+parameterTypes[j]);
			}
			
			//��÷�������ֵ����
			System.out.println("����ֵ����Ϊ��"+method.getReturnType());
			
			//��÷��������׳��������쳣������
			System.out.println("�����׳����쳣����Ϊ��");
			Class[] exceptionTypes = method.getExceptionTypes();
			for(int j=0; j<exceptionTypes.length; j++) {
				System.out.println(" "+exceptionTypes[j]);
			}
			
			boolean isTurn = true;
			while(isTurn) {
				
				//����÷�������Ȩ����private�����׳��쳣
				try {
					isTurn = false;
					
					if ("staticMethod".equals(method.getName())) {
						method.invoke(example);
					}else if ("intMethod".equals(method.getName())) {
						System.out.println("����ֵ�ǣ�"+method.invoke(example, 168));
					}else if ("protectedMethod".equals(method.getName())) {
						System.out.println("����ֵ�ǣ�"+method.invoke(example, "7",5));
					}else if ("privateMethod".equals(method.getName())) {
						Object[] parameters = new Object[] {new String[] {"M","W","Q"}};
						System.out.println("����ֵ�ǣ�"+method.invoke(example, parameters));
					}
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("��ִ�з������׳��쳣������ִ��setAccessible()����");
					method.setAccessible(true);
					isTurn = true;
					
				}
				
			}
			
			System.out.println();
		}

	}

}
