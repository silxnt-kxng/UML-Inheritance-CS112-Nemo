public class ThreeDimensionalShape {
	
	public ThreeDimensionalShape(Point center, String color, boolean filled, String material){
		super(center, color, filled);
		this.material = material;
	}

	public abstract returnType calculateVolume();

	public abstract returnType calculateSurfaceArea();
	public setMaterial(String input);

	
}

