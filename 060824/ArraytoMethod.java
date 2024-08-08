public class ArraytoMethod {
    public static void main(String[] args){
        int arr[] ={11,22,33,44,55};
        sum(arr);
    }

    public static void sum(int[] arr){
        int sum =0;
        int it=0;
        for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        it++;
        System.out.println("sum of array values after index "+it+" is : "+sum);
        }
    }
}