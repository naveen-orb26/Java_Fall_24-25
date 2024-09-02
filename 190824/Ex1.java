// odd numbers at even positions
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.print("Odd number elements at even positions are: ");
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(arr[i]%2!=0){
                    System.out.printf("%d ",arr[i]);
                }
            }
        }

    }
}
