package Unit16;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Record record = new Record();
		Class recordC = record.getClass();
		
		System.out.println("------ 构造方法的描述如下 ------");
		
		Constructor[] declaredConstructors = recordC.getDeclaredConstructors();
		
		for(int i=0; i<declaredConstructors.length; i++) {
			Constructor constructor = declaredConstructors[i];
			
			//查看是否具有指定类型的注释
			if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
				//获得指定类型的注释
				Constructor_Annotation ca = (Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
//				System.out.println(Constructor_Annotation.class);
//				System.out.println(Field_Method_Parameter_Annotation.class);
//				System.exit(0);
				//Constructor_Annotation ccc = constructor.getAnnotation(Constructor_Annotation.class);
				//获得注释信息
				System.out.println(ca.value());
			}
			
			//获得参数的注释
			Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
			for(int j=0; j<parameterAnnotations.length; j++) {
				//获得指定参数注释的长度
				int length = parameterAnnotations[j].length;
				
				if (length == 0) {
					System.out.println("未添加Annotation的参数");
				}else {
					for(int k=0; k<length; k++) {
						//获得参数的注释
						Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameterAnnotations[j][k];
						System.out.println(" "+pa.describe());//获得参数描述
						System.out.println(" "+pa.type());//获得参数类型
					}
				}
				System.out.println();
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("-------- 字段的描述如下 --------");
		Field[] declaredFields = recordC.getDeclaredFields();//获得所有字段
		
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			
			//查看是否具有指定类型的注释
			if (field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//获得指定类型的注释
				Field_Method_Parameter_Annotation fa = field.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(" "+fa.describe());
				System.out.println(" "+fa.type());
			}
		}
		
		System.out.println();
		
		
		System.out.println("-------- 方法的描述如下 --------");
		Method[] methods = recordC.getDeclaredMethods();
		
		for(int i=0; i<methods.length; i++) {
			Method method = methods[i];
			
			//查看是否具有指定类型的注释
			if (method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)) {
				//获得指定类型的注释
				Field_Method_Parameter_Annotation ma = method.getAnnotation(Field_Method_Parameter_Annotation.class);
				System.out.println(" "+ma.describe());
				System.out.println(" "+ma.type());
			}
			
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			for (int k = 0; k < parameterAnnotations.length; k++) {
				int length = parameterAnnotations[k].length;
				if (length == 0) {
					System.out.println(" 未添加Annotation的参数");
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
