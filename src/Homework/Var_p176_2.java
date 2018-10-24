package Homework;

import java.math.BigDecimal;

public class Var_p176_2 {
	
	public void forArea(double r) {
		double area;
		area = Math.PI*r*r;
		
		//利用大数保留5位小数
		BigDecimal b = new BigDecimal(area);
		area = b.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("半径为"+r+"的圆的面积是："+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var_p176_2 s = new Var_p176_2();
		double r = 6;
		s.forArea(r); 

	}

}
