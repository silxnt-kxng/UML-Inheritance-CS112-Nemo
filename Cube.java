public class Cube extends ThreeDimensionalShape {
	private double sideLength;

    public Cube(Point center, double sideLength, String material, String color, boolean isFilled){
        super(center, color, isFilled, material);
        this.sideLength = sideLength;
    }

    public Cube(Point center, double sideLength){
        super(center, "None", false, "None");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume(){
        return sideLength * sideLength * sideLength;
    }

    public double calculateSurfaceArea(){
        return 6*(sideLength * sideLength);
    }

    @Override
    public double calculateArea(){
        return sideLength * sideLength;
    }

    @Override
    public double calculatePerimeter(){
        return sideLength * 4;
    }

    @Override
    public void draw(){
        System.out.println("I'm in the draw method for the Cube class");
    }

    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }
}