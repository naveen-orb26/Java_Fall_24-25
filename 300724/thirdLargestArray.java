import java.util.Scanner;
public class thirdLargestArray {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len = myobj.nextInt();
        int arr[]= new int[len];
      
        System.out.println("Enter elements: ");
        for(int i=0;i<len;i++){
            arr[i]= myobj.nextInt();

        }
        myobj.close();
        for(int j=0;j<len;j++){
           for(int i=j;i<len;i++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
                 
            }        
        }
        System.out.println("The third largest element in the array is "+ arr[2]);
    }
}
