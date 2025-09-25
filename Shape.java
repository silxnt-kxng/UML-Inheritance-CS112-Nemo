public abstract class Shape {
	protected Point center;
	protected String color;
	protected boolean filled;

	public Shape(Point center, String color, boolean filled) {
		this.center = center;
		this.color = color;
		this.filled = filled;
	}

	public String getCenter() {
		return "(" + center.getX() + ", " + center.getY() + ")";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract void draw();

	public void move(Point point) {
		center = point;
	}

	public String getColor(){
		return color;
	}

	public boolean isFilled(){
		return filled;
	}

}