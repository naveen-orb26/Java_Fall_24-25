class Animal{
 void eat(){System.out.println("Eating..");}   
}
class Dog extends Animal{
    void bark(){System.out.println("Barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("Meow..");}
    }
public class Inherit2 {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cat c= new Cat();
    c.meow();
    c.eat();
    d.bark();
    d.eat();
  }  
}
