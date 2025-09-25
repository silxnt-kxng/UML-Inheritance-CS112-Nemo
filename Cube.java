public class Cube {
	private double sideLength;

    public Cube(double sideLength){
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

    @Override
    public void setSideLength(double sideLength){
        this.sideLength = sideLength;
    }
}