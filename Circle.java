public class Circle {
	double radius;
	public Circle(Point center, String color, boolean filled, double borderWidth, double radius){
		super(center, color, filled, borderWidth);
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

}
