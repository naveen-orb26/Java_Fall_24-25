public class Parameter {
    int x;
    public Parameter(int y){
        x=y;
    }
    public static void main(String[] args) {
        Parameter p = new Parameter(5);
        System.out.println(p.x);
    }
}
