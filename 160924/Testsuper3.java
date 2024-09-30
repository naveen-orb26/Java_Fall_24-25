class Animal{
    Animal(){
        System.out.println("The animal is created");
    }
}

class dog extends Animal{
    dog(){
        super();
        System.out.println("The dog is created");
    }
}
public class Testsuper3 {
    public static void main(String[] args) {
        dog dg = new dog();
    }
}
