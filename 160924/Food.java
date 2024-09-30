import java.util.Scanner;
public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        for(int i=0;i<tt;i++){
            int xx = sc.nextInt();
            int yy = sc.nextInt();
            System.out.println(xx*yy);
        }
        sc.close();

    }
}
