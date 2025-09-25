abstract class ThreeDimensionalShape extends Shape {
	protected String material;

	public ThreeDimensionalShape(Point center, String color, boolean isFilled, String material){
		super(center, color, isFilled);
		this.material = material;
	}

	public abstract double calculateVolume();
	public abstract double calculateSurfaceArea();
	public void setMaterial(String material){
		this.material = material;
	}
	public String getMaterial(){
		return material;
	}
}
