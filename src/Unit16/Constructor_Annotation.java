package Unit16;

import java.lang.annotation.*;
	
	//用于构造方法
	@Target(ElementType.CONSTRUCTOR)
	
	//在运行时加载Annotation到JVM中
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface Constructor_Annotation{
		String value() default "默认构造方法";
	}

