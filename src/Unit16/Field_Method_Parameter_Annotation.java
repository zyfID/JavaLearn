package Unit16;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})

@Retention(RetentionPolicy.RUNTIME)

public @interface Field_Method_Parameter_Annotation{
	
	String describe();
	Class type() default Void.class;
}