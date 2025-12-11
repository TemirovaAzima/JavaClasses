public class CircumscribedSphere {
    private double radius;

    public CircumscribedSphere(Square sq){
        radius = (sq.getSide()* Math.sqrt(3)) /2 ;
    }
    public CircumscribedSphere(Cylinder cyl){
        double h = cyl.getHeight();
        double r = cyl.getRadius();
        radius = (Math.sqrt(h*h + (2*r) * (r*2)))/2;
    }

    public double getRadius(){
        return radius;
    }
}
