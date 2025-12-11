public class Donkey {
    private double mass;
    private Balloon[] balloons;

    public void setMass(double mass){
        this.mass = mass;
    }
    public Donkey(){
        balloons = new Balloon[0];
    }

    public void addBalloon(Balloon balloon){
        Balloon[] newArray = new Balloon[balloons.length+1];
        for(int i = 0; i < balloons.length ; i++){
            newArray[i] = balloons[i];
        }
        newArray[balloons.length] = balloon;
        balloons = newArray;
    }

    public boolean isFlying(){
        double totalLift = 0;

        for(int i = 0; i < balloons.length; i++){
            totalLift += balloons[i].getLoad();
        }
        return totalLift>=mass;
    }
}
