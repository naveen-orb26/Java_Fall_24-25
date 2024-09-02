import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                System.out.printf("%d ",arr[i]);
            }
            else{
                c++;
            }
        }
        for(int i=0;i<c;i++){
            System.out.print(0+" ");
        }
    }
}
