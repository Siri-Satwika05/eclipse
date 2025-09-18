package Abstract;

public class Rectangle extends shape{
	private int height=5,width=2;
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
	void calArea() {
		super.area=height*width;
	}
}