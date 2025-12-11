public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    public void show(){
        double baseArea = Math.PI* radius * radius;
        double volume = baseArea * height;
        System.out.println("The area of the base: " + baseArea);
        System.out.println("The volume of the cylinder: " + volume);
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
}
