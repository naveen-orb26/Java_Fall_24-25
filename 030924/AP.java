import java.util.Scanner;
public class AP {
    static int nthTerm(int f, int n, int d){
        int nterm = f+ (n-1)*d;
        return nterm;
    }
    static int posn(int f, int k, int d){
        if((k-f)%d==0) {
            int r = (k-f)/d + 1;
            return r;}
        else return 0;
    }

    static int abval(int a, int b){
        int s = Math.abs(a-b);
        return s;                                          
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int f = sc.nextInt();
      int d = sc.nextInt();
      int n = sc.nextInt();
      int k = sc.nextInt();
      int p = sc.nextInt();
      int q = sc.nextInt();
      int ans1 = nthTerm(f,n,d);
      int ans2 = posn(f,k,d);
      int ap = nthTerm(f,p,d);
      int aq = nthTerm(f,q,d);
      int ans3 = abval(ap,aq);
      System.out.print(ans1);
      System.out.print("  " +ans2);
      System.out.print("  " +ans3);
      }
}
// a+ n-1* d = (k-f)/d + 1