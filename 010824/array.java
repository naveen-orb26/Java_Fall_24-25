import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int[] arr;
        arr= new int[10];
        for(int i=0;i<10;i++){
            arr[i]= myobj.nextInt();
        }
        myobj.close();
        int[] harr;
        harr= new int[5];
        harr[0]=9;
        harr[1]=8;
        harr[2]=7;
        harr[3]=6;
        harr[4]=5;

        for(int i=0;i<arr.length;i++){
            System.err.printf("%d ",arr[i]);
        }System.out.println("\n");
        for(int i=0;i<5;i++){
            System.err.printf("%d ",harr[i]);
        }
        }
}
