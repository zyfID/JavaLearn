import java.math.BigDecimal;

public class BigDecimalDemo {
	
	static final int location = 10;
	
	//����ӷ�����ķ���
	public BigDecimal add(double v1, double v2) {
		//����ʵ����BigDecimal����
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.add(b2);
	}
	
	//�����������
	public BigDecimal sub(double v1, double v2) {
		//ʵ��������
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.subtract(b2);
	}

	//�˷�����
	public BigDecimal mul(double v1, double v2) {
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2);
	}
	
	//��������
	public BigDecimal div(double v1, double v2) {

		return div(v1, v2,location);
	}
	
	//
	public BigDecimal div(double v1, double v2, int b) {
		if (b<0) {
			System.out.println("b��ֵ������ڵ���0");
		}
		
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		
		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
	}
	
	
	//������
	public static void main(String[] args) {
		BigDecimalDemo b = new BigDecimalDemo();
		
		System.out.println("��ӽ����"+b.add(-7.5, 8.9));
		System.out.println("��������"+b.sub(-7.5, 8.9));
		System.out.println("��˽����"+b.mul(-7.5, 8.9));
		System.out.println("������������10λС����"+b.div(10, 2));
		System.out.println("������������5λС����"+b.div(-7.5, 8.9, 5));
	}
}
