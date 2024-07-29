import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int lower = myobj.nextInt();
        int upper = myobj.nextInt();
        myobj.close();
        for(int i = lower; i<=upper;i++){
            int num = i, k=0,sum=0;
            while(num>0){
                k= num%10;
                num= num/10;
                sum+=Math.pow(k,3);
            }
            if(sum==i){
                System.out.println(i+" Is Armstrong number\n");
            }

        }

    }
    
}
