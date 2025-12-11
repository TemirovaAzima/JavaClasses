public class Square {
    private double side ;
    public Square(int side){
        this.side = side;
    }
    public void show(){
        System.out.println("The area of a square: " + side*side);
        System.out.println("The volume of a cube: " + Math.pow(side,3));
    }
    public double getSide(){
        return side;
    }
}
