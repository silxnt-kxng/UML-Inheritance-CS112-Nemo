public class Rectangle extends TwoDimensionalShape {
	double width;
	double height;
	public Rectangle(Point center, double width, double height, double borderWidth, String color, boolean filled){
		super(center, color, filled, borderWidth);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point center, double height, double width){
		super(center, "None", false, 1.0);
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

	public void setBorderWidth(double borderWidth){
		this.borderWidth = borderWidth;
	}

	public double getBorderWidth(){
		return borderWidth;
	}

}
