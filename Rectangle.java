public class Rectangle {
	double width;
	double height;
	public Rectangle(Point center, String color, boolean filled, double borderWidth, double radius){
		super(center, color, filled, borderWidth);
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea(){
		return width*height;
	}
	@Override
	public double calculatePerimeter(){
		return 2*(width + height);

	}
	@Override
	public void draw(){
		System.out.println("A rectangle was drawn");
	}
	public void setDimensions(double width, double height){
		this.width = width;
		this.height = height;
	}

}
