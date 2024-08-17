abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz...");
    }
}

class pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}

class Abstractt{
    public static void main(String[] args) {
        pig mypig = new pig();
        mypig.animalSound();
        mypig.sleep();
    }
}
