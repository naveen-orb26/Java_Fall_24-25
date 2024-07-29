import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=myobj.nextInt();
        System.out.println("Enter second number: ");
        int n2=myobj.nextInt();
        myobj.close();
        int max= (n1>n2)? n1:n2;
        int lcm=0;
        for(int i=max;i<=n1*n2;i++){
            if(i%n1==0 && i%n2==0){
                lcm=i;
                break;
            }

           
        }
        System.out.printf("The LCM of given numbers is %d ",lcm);

    }
    
}
