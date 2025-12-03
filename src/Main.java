//public class Main {
//    public void main(){
////        char[] c = {'a','b','c','d','d','c','b','a'};
//        char[] c = {'m','a','d','a','m'};
//        boolean pal = isPalindrome(c, 0);
//
//        if (!pal) {
//            System.out.println("Not a palindrome");
//            return;
//        }
//
//        insideOut(c);
//
////        System.out.println(java.util.Arrays.toString(c));
//    }
//
//    // ---------------------------------------------------------
//    // 1) Check palindrome (RECURSIVE)
//    // ---------------------------------------------------------
//    static boolean isPalindrome(char[] s, int i) {
//        int j = s.length - 1 - i;
//
//        // Base case – reached the middle
//        if (i >= j) {
//            return true;
//        }
//
//        if (s[i] != s[j]) {
//            return false;
//        }
//
//        return isPalindrome(s, i + 1);
//    }
//
//    // ---------------------------------------------------------
//    // 2) Inside-Out Transform (RECURSIVE)
//    // ---------------------------------------------------------
////    static void insideOut(char[] s, int i) {
////
////        int n = s.length;
////        int half = n/2;     // number of swaps needed
////
////        // Base case – done all swaps
////        if (i >= half/2) return;
////
////        // swap left half
////        char temp = s[i];
////        s[i] = s[half - 1 - i];
////        s[half - 1 - i] = temp;
////
////        // swap right half
////        char temp2 = s[n - 1 - i];
////        s[n - 1 - i] = s[half + i];
////        s[half + i] = temp2;
////
////        insideOut(s, i + 1);
////    }
//    static void insideOut(char[] word) {
//        int n = word.length/2-1;
//        int m = word.length-1;
//        for (int i = 0; n-i >= 0; i++) {
//            System.out.print(word[n-i]);
//        }
//        for (int i = 0; m-i > (word.length % 2 != 0 ? n+1 : n); i++) {
//            System.out.print(word[m-i]);
//        }
//    }
//}

//void main(){
//
//}
//
//class Cylender{
//    private double radius;
//    private double height ;
//}



import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jane","Mith",1999);
        System.out.print(person.name);
        System.out.print(person.surname);
        System.out.print(person.birthYear);
        Fruit fruit = new Fruit("Apple");
        fruit.show();
        Square square = new Square(4);
//        square.show();
        Cylinder cylinder = new Cylinder(9,1);
//        cylinder.show();
        // 5
        InscribedSphere inscribedSphere = new InscribedSphere(square);
        InscribedSphere inscribedSphere1 = new InscribedSphere(cylinder);
        System.out.println("sphere 1 radius: " + inscribedSphere.getRadius());
        System.out.println("sphere 2 radius: " + inscribedSphere1.getRadius());
        // 6
        CircumscribedSphere circumscribedSphere = new CircumscribedSphere(cylinder);
        CircumscribedSphere circumscribedSphere2 = new CircumscribedSphere(square);
        System.out.println("Cylinder: " + circumscribedSphere.radius);


    }

}
class Person{
    public  String name;
    public  String surname;
    public  int  birthYear;
    public Person(String name , String surname,int birthdate){
        this.name = name ;
        this.surname = surname;
        this.birthYear = birthdate;
    }
}
class Fruit{
    public String name ;
    public double weight ;
    public Fruit(String name){
        this.name = name;
        weight = Math.random()*0.3 + 0.5;
    }
    public void show(){
        System.out.println(name);
        System.out.println(weight);
    }
}
class Square{
    private int side ;
    public Square(int side){
        this.side = side;
    }
    public void show(){
        System.out.println(side* side);
        System.out.println((int)Math.pow(side,3));

    }
    public double getSq(){
        return this.side ;
    }
}
class Cylinder{
    private int radius ;
    private int height ;
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public void show(){
        System.out.println((int)(2*Math.PI* radius * height + 2 *Math.PI *radius*radius));
        System.out.println((int)Math.PI * radius * radius * height);
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
}
class InscribedSphere{
    private double radius ;
    public InscribedSphere(Square sq){
        // radius sphere = squire.side / 2
        this.radius = sq.getSq()/2.0;
    }
    public InscribedSphere(Cylinder cylinder){
        this.radius = Math.min(cylinder.getRadius(),cylinder.getHeight()/2.0);
    }
    public double getRadius(){
        return this.radius ;
    }

}

class CircumscribedSphere{
    public double radius ;
    public CircumscribedSphere(Cylinder cylinder){
        int a = cylinder.getHeight();
        int b = cylinder.getRadius()*2;
        radius = Math.sqrt(a*a + b*b) /2;
    }
    public CircumscribedSphere(Square sq){
        radius = sq.getSq() * Math.sqrt(3);
    }

}


