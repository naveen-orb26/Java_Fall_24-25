public class TwoObj {
    int x=10;
    public static void main(String[] args) {
    TwoObj t1 = new TwoObj();
    TwoObj t2 = new TwoObj();
    t2.x=25;
    System.out.println(t1.x);
    System.out.println(t2.x);
    }
}
