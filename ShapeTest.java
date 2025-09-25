/**
 * Tester class for the Shape hierarchy.
 * Creates objects of each concrete shape type and demonstrates
 * polymorphism using an array of Shape objects.
 * 
 * @author Your Name
 * @version 1.0
 */
public class ShapeTest {
    
    /**
     * Main method that creates and tests various shape objects.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("=== Shape Hierarchy Tester ===\n");
        
        // Create individual shape objects using different constructors
        createAndTestIndividualShapes();
        
        // Demonstrate polymorphism with array of Shape objects
        demonstratePolymorphism();
    }
    
    /**
     * Creates and tests individual shape objects using various constructors.
     */
    public static void createAndTestIndividualShapes() {
        System.out.println("=== Creating Individual Shape Objects ===\n");
        
        // Create Circle with comprehensive constructor
        Point circleCenter = new Point(3.0, 4.0);
        Circle circle = new Circle(circleCenter, 5.0, 2.0, "red", true);
        testShapeBasics(circle, "Circle");
        
        // Create Rectangle with comprehensive constructor
        Point rectangleCenter = new Point(1.0, 2.0);
        Rectangle rectangle = new Rectangle(rectangleCenter, 8.0, 6.0, 1.5, "blue", false);
        testShapeBasics(rectangle, "Rectangle");
        
        // Create Sphere with comprehensive constructor
        Point sphereCenter = new Point(5.0, 6.0);
        Sphere sphere = new Sphere(sphereCenter, 4.0, "metal", "green", true);
        testShapeBasics(sphere, "Sphere");
        
        // Create Cube with comprehensive constructor
        Point cubeCenter = new Point(7.0, 8.0);
        Cube cube = new Cube(cubeCenter, 3.0, "wood", "yellow", false);
        testShapeBasics(cube, "Cube");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    /**
     * Tests basic functionality of a shape object.
     * 
     * @param shape the shape to test
     * @param shapeName the name of the shape type
     */
    public static void testShapeBasics(Shape shape, String shapeName) {
        System.out.println("--- Testing " + shapeName + " ---");
        System.out.println("Center: " + shape.getCenter());
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.isFilled());
        
        // Test area and perimeter (available for all shapes)
        System.out.printf("Area: %.2f%n", shape.calculateArea());
        System.out.printf("Perimeter: %.2f%n", shape.calculatePerimeter());
        
        // Test specific properties for 2D shapes
        if (shape instanceof TwoDimensionalShape) {
            TwoDimensionalShape shape2D = (TwoDimensionalShape) shape;
            System.out.printf("Border Width: %.2f%n", shape2D.getBorderWidth());
        }
        
        // Test specific properties for 3D shapes
        if (shape instanceof ThreeDimensionalShape) {
            ThreeDimensionalShape shape3D = (ThreeDimensionalShape) shape;
            System.out.println("Material: " + shape3D.getMaterial());
            System.out.printf("Volume: %.2f%n", shape3D.calculateVolume());
            System.out.printf("Surface Area: %.2f%n", shape3D.calculateSurfaceArea());
        }
        
        // Draw the shape
        shape.draw();
        System.out.println();
    }
    
    /**
     * Demonstrates polymorphism using an array of Shape objects.
     */
    public static void demonstratePolymorphism() {
        System.out.println("=== Demonstrating Polymorphism with Shape Array ===\n");
        
        // Create an array of Shape objects containing different concrete types
        Shape[] shapes = {
            new Circle(new Point(0, 0), 3.0),
            new Rectangle(new Point(2, 3), 4.0, 6.0),
            new Sphere(new Point(1, 1), 2.5),
            new Cube(new Point(4, 5), 3.5),
            new Circle(new Point(10, 10), 7.0, 3.0, "purple", true),
            new Rectangle(new Point(15, 20), 5.0, 8.0, 2.5, "orange", true)
        };
        
        System.out.println("Created array with " + shapes.length + " shapes:\n");
        
        // Iterate through array and call methods polymorphically
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes[i].getClass().getSimpleName());
            System.out.println("  Center: " + shapes[i].getCenter());
            System.out.println("  Color: " + shapes[i].getColor());
            System.out.printf("  Area: %.2f%n", shapes[i].calculateArea());
            System.out.printf("  Perimeter: %.2f%n", shapes[i].calculatePerimeter());
            
            // Use instanceof to access specific functionality
            if (shapes[i] instanceof TwoDimensionalShape) {
                TwoDimensionalShape shape2D = (TwoDimensionalShape) shapes[i];
                System.out.printf("  Border Width: %.2f%n", shape2D.getBorderWidth());
            }
            
            if (shapes[i] instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape shape3D = (ThreeDimensionalShape) shapes[i];
                System.out.println("  Material: " + shape3D.getMaterial());
                System.out.printf("  Volume: %.2f%n", shape3D.calculateVolume());
            }
            
            shapes[i].draw();
            System.out.println();
        }
        
        // Demonstrate moving all shapes
        System.out.println("--- Moving all shapes to new location (20, 20) ---\n");
        Point newLocation = new Point(20, 20);
        for (Shape shape : shapes) {
            shape.move(newLocation);
            System.out.println(shape.getClass().getSimpleName() + " moved to: " + shape.getCenter());
        }
        
        // Calculate total area of all shapes
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.printf("%nTotal area of all shapes: %.2f%n", totalArea);
        
        // Count shapes by type
        countShapesByType(shapes);
    }
    
    /**
     * Counts and displays the number of each shape type in the array.
     * 
     * @param shapes the array of shapes to count
     */
    public static void countShapesByType(Shape[] shapes) {
        int circleCount = 0, rectangleCount = 0, sphereCount = 0, cubeCount = 0;
        
        for (Shape shape : shapes) {
            if (shape instanceof Circle) circleCount++;
            else if (shape instanceof Rectangle) rectangleCount++;
            else if (shape instanceof Sphere) sphereCount++;
            else if (shape instanceof Cube) cubeCount++;
        }
        
        System.out.println("\n--- Shape Type Summary ---");
        System.out.println("Circles: " + circleCount);
        System.out.println("Rectangles: " + rectangleCount);
        System.out.println("Spheres: " + sphereCount);
        System.out.println("Cubes: " + cubeCount);
        System.out.println("Total shapes: " + shapes.length);
    }
}