abstract class TwoDimensionalShape extends Shape {
	protected double borderWidth;

	public TwoDimensionalShape(Point center, String color, boolean filled, double borderWidth){
		super(center, color, filled);
		this.borderWidth = borderWidth;
	}

	public abstract void setBorderWidth(double input);
	public abstract double getBorderWidth();

}

