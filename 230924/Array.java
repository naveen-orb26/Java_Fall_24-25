public class Array {
public static void main(String[] args){
int[] arr = new int[]{9,4,-2,-1,5,0,-5,-3,2};
int i=0;
int j=0,k=0;
int[] pos = new int[arr.length];
int[] neg = new int[arr.length];
while(i!=arr.length){
    
    if(arr[i]>=0){
            pos[j]=arr[i];
            j++;
    }else{
        neg[k]=arr[i];
        k++;
    }i++;
}
int[] narr = new int[arr.length];
int m=0,n=0;
for(int p=0;p<arr.length-1;p=p+2){
    if(p<arr.length){
    narr[p]=pos[m];
    m++;}
    if(p+1<arr.length){
    narr[p+1]=neg[n];
    n++;}
}
for(int q =0;q<arr.length;q++){
    System.out.print(narr[q]+" ");
}

}    
}
