package Homework;

import java.math.BigDecimal;

public class Var_p176_2 {
	
	public void forArea(double r) {
		double area;
		area = Math.PI*r*r;
		
		//���ô�������5λС��
		BigDecimal b = new BigDecimal(area);
		area = b.setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
		System.out.println("�뾶Ϊ"+r+"��Բ������ǣ�"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var_p176_2 s = new Var_p176_2();
		double r = 6;
		s.forArea(r); 

	}

}
