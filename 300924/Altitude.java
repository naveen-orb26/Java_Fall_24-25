import java.util.Scanner;
public class Altitude {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c=0;
        int max=0;
        int i=0;
        while (i<n-1){
            c=0;
            while (i<n-1 && arr[i]<arr[i+1]){
                c++;
                i++;
            }
            if (c > max){
                max=c;
            }
            i++;
        }
        System.out.println(max);
        sc.close();

     }
}
