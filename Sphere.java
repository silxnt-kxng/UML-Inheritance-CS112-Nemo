public class Sphere {
	private double radius;

    public Sphere(double radius){
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

    @Override
    public void draw(){
        System.out.println("I'm in the draw method for the Sphere class");
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}