import java.math.BigDecimal;

public class BigDecimalDemo {
	
	static final int location = 10;
	
	//定义加法运算的方法
	public BigDecimal add(double v1, double v2) {
		//首先实例化BigDecimal对象
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.add(b2);
	}
	
	//定义减法运算
	public BigDecimal sub(double v1, double v2) {
		//实例化对象
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.subtract(b2);
	}

	//乘法运算
	public BigDecimal mul(double v1, double v2) {
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	}
	
	//除法运算
	public BigDecimal div(double v1, double v2) {

		return div(v1, v2,location);
	}
	
	//
	public BigDecimal div(double v1, double v2, int b) {
		if (b<0) {
			System.out.println("b的值必须大于等于0");
		}
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
	}
	
	
	//主函数
	public static void main(String[] args) {
		BigDecimalDemo b = new BigDecimalDemo();
		
		System.out.println("相加结果："+b.add(-7.5, 8.9));
		System.out.println("相减结果："+b.sub(-7.5, 8.9));
		System.out.println("相乘结果："+b.mul(-7.5, 8.9));
		System.out.println("相除，结果保留10位小数："+b.div(10, 2));
		System.out.println("相除，结果保留5位小数："+b.div(-7.5, 8.9, 5));
	}
}
