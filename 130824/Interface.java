interface Animal{
    public void animalSound();
    public void sleep();}
    
class pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
    public void sleep(){
        System.out.println("Zzz...");
    }
}
    public class Interface {
    public static void main(String[] args) {
        pig myPig = new pig();
        myPig.animalSound();
        myPig.sleep(); 
    }
}
