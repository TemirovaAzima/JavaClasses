void main(){
    // 1
    Person person = new Person("Mike","Kim",1990);
    System.out.println(person.name);
    System.out.println(person.surname);
    System.out.println(person.birthYear);
    System.out.println();
    // 2
    Fruits fruit = new Fruits("banana");
    fruit.show();
    System.out.println();

    // 3
    Square square = new Square(3);
    square.show();
    System.out.println();
    // 4
    Cylinder cylinder = new Cylinder(5,2);
    cylinder.show();
    System.out.println();
    // 5
    InscribedSphere inscribedSphereSq = new InscribedSphere(square);
    System.out.println("Radius of inscribed sphere: " + inscribedSphereSq.getRadius());
    InscribedSphere inscribedSphereCyl = new InscribedSphere(cylinder);
    System.out.println("Radius of inscribed sphere: " + inscribedSphereCyl.getRadius());
   // 6
    System.out.println();
    CircumscribedSphere circumscribedSphereSq = new CircumscribedSphere(square);
    System.out.println("CircumscribedSphereSq: " + circumscribedSphereSq.getRadius());
    CircumscribedSphere circumscribedSphereCyl = new CircumscribedSphere(cylinder);
    System.out.println("circumscribedSphereCyl: " + circumscribedSphereCyl.getRadius());
    // 7
//    Balloon balloon = new Balloon();
    Donkey donkey = new Donkey();
    donkey.setMass(80);
    int count = 0;
    do{
      donkey.addBalloon(new Balloon());
      count++;
    }while(!donkey.isFlying());
    System.out.println("I'm flying yay");
    System.out.println(count);
}




