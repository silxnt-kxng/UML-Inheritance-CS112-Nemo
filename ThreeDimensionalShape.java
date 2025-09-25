public class ThreeDimensionalShape {
	
	public ThreeDimensionalShape(Point center, String color, boolean filled, String material){
		super(center, color, filled);
		this.material = material;
	}

	public calculateVolume(){
		return volume;
	}

	
}
