package Unit16;

import java.lang.annotation.*;
	
	//���ڹ��췽��
	@Target(ElementType.CONSTRUCTOR)
	
	//������ʱ����Annotation��JVM��
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface Constructor_Annotation{
		String value() default "Ĭ�Ϲ��췽��";
	}

