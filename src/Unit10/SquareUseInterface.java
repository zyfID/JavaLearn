package Unit10;

public class SquareUseInterface extends QuadrangleUseInterface implements drawTest {

	public void draw() {
		System.out.println("正方形.draw()");
	}
	
	public void doAnything() {
		System.out.println("覆盖父类方法");
	}
}
