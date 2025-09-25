public class Sphere extends ThreeDimensionalShape {
	private double radius;

    public Sphere(Point center, double radius, String material, String color, boolean isFilled){
        super(center, color, isFilled, material);
        this.radius = radius;
    }
    public Sphere(Point center, double radius){
        super(center, "None", false, "None");
        this.radius = radius;
    }

    @Override
    public double calculateVolume(){
        return (4/3)*Math.PI*(radius*radius*radius);
    }

    @Override
    public double calculateSurfaceArea(){
        return 4*Math.PI*(radius*radius);
    }

    public double calculateArea(){
        return 4*Math.PI*(radius*radius);
    }
    @Override
    public void draw(){
        System.out.println("I'm in the draw method for the Sphere class");
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}