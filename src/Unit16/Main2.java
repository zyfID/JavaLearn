package Unit16;

import java.lang.reflect.Field;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam2 example = new Exam2();
		Class exampleC = example.getClass();
		
		//������г�Ա����
		Field[] declaredFields = exampleC.getDeclaredFields();
		for(int i=0; i<declaredFields.length; i++) {
			Field field = declaredFields[i];
			
			//��ó�Ա��������
			System.out.println("����Ϊ��"+field.getName());
			Class fieldType = field.getType();
			System.out.println("����Ϊ��"+fieldType);
			boolean isTurn = true;
			
			while(isTurn) {
				//����ó�Ա�����ķ���Ȩ��Ϊprivate�����׳��쳣�������������
				try {
					isTurn = false;
					
					//��ó�Ա����ֵ
					System.out.println("�޸�ǰֵΪ��"+field.get(example));
					
					//�жϳ�Ա���������Ƿ�Ϊint��
					if (fieldType.equals(int.class)) {
						System.out.println("���÷���setInt()�����޸ĳ�Ա������ֵ");
						field.setInt(example, 168);
					}else if (fieldType.equals(float.class)) {
						System.out.println("����setFloat()�����޸ĳ�Ա������ֵ");
						field.setFloat(example, 99.9F);
					}else if (fieldType.equals(boolean.class)) {
						System.out.println("����setBoolean()�����޸ĳ�Ա������ֵ");
						field.setBoolean(example, true);
					}else {
						System.out.println("����set()�����޸ĳ�Ա������ֵ");
						field.set(example, "MWQ");
					}
					
					//����޸ĺ�ĳ�Ա����ֵ
					System.out.println("�޸ĺ�ĳ�Ա����ֵ��"+field.get(example));
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("�����ó�Ա����ֵʱ�׳��쳣������ִ��setAccessible()������");
					field.setAccessible(true);
					isTurn = true;
				}
			}
			
			System.out.println();
		}

	}

}
