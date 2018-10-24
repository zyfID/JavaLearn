package Unit16;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Record record = new Record();
		Class recordC = record.getClass();
		
		System.out.println("------ ���췽������������ ------");
		
		Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
		
		for(int i=0; i<declaredConstructors.length; i++) {
			Constructor constructor = declaredConstructors[i];
			
			//�鿴�Ƿ����ָ�����͵�ע��
			if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
				//���ָ�����͵�ע��
				Constructor_Annotation ca = (Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
//				System.out.println(Constructor_Annotation.class);
//				System.out.println(Field_Method_Parameter_Annotation.class);
//				System.exit(0);
				//Constructor_Annotation ccc = constructor.getAnnotation(Constructor_Annotation.class);
				//���ע����Ϣ
				System.out.println(ca.value());
			}
			
			//��ò�����ע��
			Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
			for(int j=0; j<parameterAnnotations.length; j++) {
				//���ָ������ע�͵ĳ���
				int length = parameterAnnotations[j].length;
				
				if (length == 0) {
					System.out.println("δ���Annotation�Ĳ���");
				}else {
					for(int k=0; k<length; k++) {
						//��ò�����ע��
						Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameterAnnotations[j][k];
						System.out.println(" "+pa.describe());//��ò�������
						System.out.println(" "+pa.type());//��ò�������
					}
				}
				System.out.println();
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("-------- �ֶε��������� --------");
		Field[] declaredFields = recordC.getDeclaredFields();//��������ֶ�
		
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			
			//�鿴�Ƿ����ָ�����͵�ע��
			if (field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation fa = field.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(" "+fa.describe());
				System.out.println(" "+fa.type());
			}
		}
		
		System.out.println();
		
		
		System.out.println("-------- �������������� --------");
		Method[] methods = recordC.getDeclaredMethods();
		
		for(int i=0; i<methods.length; i++) {
			Method method = methods[i];
			
			//�鿴�Ƿ����ָ�����͵�ע��
			if (method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//���ָ�����͵�ע��
				Field_Method_Parameter_Annotation ma = method.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(" "+ma.describe());
				System.out.println(" "+ma.type());
			}
			
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			for (int k = 0; k < parameterAnnotations.length; k++) {
				int length = parameterAnnotations[k].length;
				if (length == 0) {
					System.out.println(" δ���Annotation�Ĳ���");
				}else {
					for(int j=0; j<length; j++) {
						Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameterAnnotations[j][k];
						System.out.println(" "+pa.describe());
						System.out.println(" "+pa.type());
					}
				}
				
				System.out.println();
			}
		}

	}

}
