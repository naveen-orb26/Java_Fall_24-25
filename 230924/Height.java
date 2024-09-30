import java.util.Scanner;
public class Height {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        //int[] arr = new int[]{7,4,8,2,9};
        //int len = arr.length;
        int max=0;
        int count=0;
        for(int i=0;i<len;i++){
            if(arr[i]>max){
                count++;
                max= arr[i];
            }

        }
        sc.close();
        System.out.println(count);
    }
}
