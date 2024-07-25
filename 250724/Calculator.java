import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args){
   Scanner myObj = new Scanner(System.in);
   
   String q;
   do{
    System.out.println("Choose an option: \n 1-Addition\n 2-Subtraction\n 3-Mutliplication\n 4-Division\n 5-modulus\n 6-exponential\n");
    int choice= myObj.nextInt();
       switch(choice){
           case 1:
               System.out.println("Enter numbers to add: ");
               float num1= myObj.nextInt();
               float num2= myObj.nextInt();
               float sum= num1 + num2;
               System.out.printf("%.2f\n",sum);        
               break;


           case 2:
               System.out.println("Enter numbers to Subtract: ");
               float sub1= myObj.nextInt();
               float sub2= myObj.nextInt();
               float diff= sub1 - sub2;
               System.out.printf("%.2f\n",diff);        
               break;


           case 3:
               System.out.println("Enter numbers to Multiply: ");
               float m1= myObj.nextInt();
               float m2= myObj.nextInt();
               float prod= m1 * m2;
               System.out.printf("%.2f\n",prod );        
               break;
           case 4:
               System.out.println("Enter numbers to divide as dividend and divisor: ");
               float d1= myObj.nextFloat();
               float d2= myObj.nextFloat();
               if(d2==0){
                   System.out.printf("Invalid number, retry");
                   break;
               }
               else{
               float quo= d1/d2;
               System.out.printf("%.2f\n",quo );        
               break;}
           case 5:
               System.out.println("Enter number to get the absolute value: ");
               float a= myObj.nextFloat();
               float ans = Math.abs(a);
               System.out.printf("%.2f\n",ans);
               break;
           case 6:
               System.out.println("Enter the exponential number x^y in the form of x and y: ");
               int p1= myObj.nextInt();
               int p2= myObj.nextInt();
               double expn = Math.pow(p1, p2);
               System.out.printf("%.2f\n", expn);
               break;
           default:
                   System.out.println("Invalid choice");
                   break;


                  
       }System.out.println("Do you want to try something else? (y/n)");
       q = myObj.next();
       myObj.nextLine();
   }
   while(q.equals("y"));
    
   
}
}


