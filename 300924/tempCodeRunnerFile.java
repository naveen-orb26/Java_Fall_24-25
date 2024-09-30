import java.util.Scanner;
public class Longest {

    public static int findLongest(String str) {
        int n = str.length();

        
        int[] arr = new int[n];
        compute(str, arr);

      
        return arr[n - 1];
    }

    private static void compute(String str, int[] arr) {
        int n = str.length();
        int i = 1, j = 0;

        while (i < n) {
            if (str.charAt(i) == str.charAt(j)) {
                j++;
                arr[i] = j;
                i++;
            } else {
                if (j == 0) {
                    arr[i] = 0;
                    i++;
                } else {
                    j = arr[j - 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); 

        int length = findLongest(str);
        System.out.println("Length of the longest proper prefix which is also a proper suffix: " + length);
        sc.close();
    }
}

