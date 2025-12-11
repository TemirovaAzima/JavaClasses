public class InscribedSphere {
    private double radius;

    public InscribedSphere(Square square){
       radius = square.getSide() / 2;
    }

    public InscribedSphere(Cylinder cylinder){
       radius = Math.min(cylinder.getRadius(),cylinder.getHeight()/2);
    }

    public double getRadius(){
        return radius;
    }
}
