abstract class Main {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

class Main2 extends Main {
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long");
    }
    
}
 