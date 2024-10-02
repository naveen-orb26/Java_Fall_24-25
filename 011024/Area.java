import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double rectArea = ComputeArea(input.nextInt(), input.nextInt());
            double trapArea = ComputeArea(input.nextInt(), input.nextInt(), input.nextInt());
            double circArea = ComputeArea(input.nextInt());
            System.out.printf("%.2f\n", rectArea);
            System.out.printf("%.2f\n", trapArea);
            System.out.printf("%.2f\n", circArea);
    
            input.close();
        }
    
        public static double ComputeArea(int l, int b) {
           
            double area = (l * b);
            return area;
        }
    
        public static double ComputeArea(int t, int b, int h) {
            
            double area = h * (t + b) / 2.0;
            return area;
        }
    
        public static double ComputeArea(int r) {
            
            double area = 3.14 * r * r;
            return area;
        
    }
        
}
