package Unit10;

public class QuadrangleUseInterface {
	
	public void doAnything() {
		System.out.println("���Ǹ��෽��");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTest[] d = {new SquareUseInterface(), new ParallelogramgleUseInterface()};
		for (int i=0; i<d.length; i++) {
			d[i].draw();
		}

	}

}
