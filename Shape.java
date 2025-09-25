public abstract class Shape {
	protected Point center;
	protected String color;
	protected boolean filled;

	public void Shape(Point center, String color, boolean filled) {
		this.center = center;
		this.color = color;
		this.filled = filled;
	}

	public Point getCenter() {
		return this.center;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract calculateArea();
	public abstract calcuatePerimeter();
	public abstract draw();

	public void move(Point) {
		
	}

}