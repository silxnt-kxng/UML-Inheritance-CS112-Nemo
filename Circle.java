public class Circle extends TwoDimensionalShape {
	double radius;

	public Circle(Point center, double borderWidth, double radius, String color, boolean filled){
		super(center, color, filled, borderWidth);
		this.radius = radius;
	}

	public Circle(Point center, double radius){
		super(center, "None", false, 1.0);
		this.radius = radius;
	}
	@Override
	public double calculateArea(){
		return Math.PI * radius * radius;
	}
	
	@Override
	public double calculatePerimeter(){
		return 2 * Math.PI * radius;
	}
	@Override
	public void draw(){
		System.out.println("A circle was drawn");
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	@Override
	public void setBorderWidth(double borderWidth){
		this.borderWidth = borderWidth;
	}

	@Override
	public double getBorderWidth() {
		return borderWidth;
	}
}
