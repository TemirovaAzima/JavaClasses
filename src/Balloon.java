public class Balloon {
    private double helium;
    public Balloon(){
        helium = Math.random() * 0.004 + 0.005;
    }

    public double getLoad(){
       return  helium * 6/0.007;
    }
}
