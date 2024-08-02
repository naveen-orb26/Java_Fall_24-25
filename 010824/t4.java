import java.util.StringTokenizer;

public class t4 {
    public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("Sample/statement/to/analyze/methods/from/tokenizer/class/in/java","/");
    while(st.hasMoreTokens()){
        System.out.println(st.nextElement());
    }
} 
}