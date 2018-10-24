package Unit10;

public class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{

	public void draw() {
		System.out.println("平行四边形.draw()");
	}
	
	public void doAnything() {
		System.out.println("覆盖父类方法");
	}
}
