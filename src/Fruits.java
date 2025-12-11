public class Fruits {
    public String name;
    public double weight;

    public Fruits(String name){
        this.name = name;
        weight = Math.random() *0.3 + 0.5;
    }
    public void show(){
        System.out.println("Fruits name: " + name + " and weight: " + weight);
    }
}
