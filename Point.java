public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point point) {
        double distance;
        distance = Math.sqrt(Math.pow((point.getX()-x), 2.0) + Math.pow((point.getY()-y),2.0));
        return distance;
    }
}