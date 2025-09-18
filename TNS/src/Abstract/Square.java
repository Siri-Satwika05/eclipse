package Abstract;

public class Square extends shape{
	private int side=2;
	public Square(int side) {
		this.side=side;
	}
	void calArea() {
		super.area=side*side;
	}
	
}
