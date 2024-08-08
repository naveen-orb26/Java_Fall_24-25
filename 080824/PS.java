public class PS {
    //static method
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating objects");

    }

    //public method
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
        PS obj = new PS();
        obj.myPublicMethod();
    }
}
