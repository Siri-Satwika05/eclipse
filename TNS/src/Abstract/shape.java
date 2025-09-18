package Abstract;

public abstract class shape {
	protected float area;
	abstract void calArea();
	public void show() {
		System.out.println("the area of shape is: "+area);
	}
}
