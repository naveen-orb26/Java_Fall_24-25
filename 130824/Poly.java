class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");

    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow bow");
    }
}

public class Poly {
    public static void main(String[] args) {
     Animal Sound = new Animal();
     Animal Pig = new Pig();
     Animal Dog = new Dog();

    Sound.animalSound();
    Pig.animalSound();
    Dog.animalSound();
    }
}
