import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to check sum");
        int n = sc.nextInt();
        System.out.println("Enter length of array: ");
        int l = sc.nextInt();
        System.out.println("Enter elements of the array");
        int [] arr = new int [l];
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println(arr[i]+" "+arr[j]);
                    
                }
            }
        }
    }
}
