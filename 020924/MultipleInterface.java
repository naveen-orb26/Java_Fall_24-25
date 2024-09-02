interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void myOtherMethod();
}
interface ThirdInterface{
    public void myThirdMethod();
}

class DemoClass implements FirstInterface, SecondInterface, ThirdInterface{
public void myMethod(){
    System.out.println("Some text for first one.");
}
public void myOtherMethod(){
    System.out.println("Some other text for second one.");
}
public void myThirdMethod(){
    System.out.println("Some other text again for third one.");
}
}
public class MultipleInterface {
    public static void main(String[] args){
        DemoClass dc = new DemoClass();
        dc.myMethod();
        dc.myOtherMethod();
        dc.myThirdMethod();
    }

    
}
