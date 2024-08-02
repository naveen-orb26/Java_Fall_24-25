import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("My name is Naveen"," ");
    while(st.hasMoreTokens()){
        System.out.println(st.nextToken());
    }
}    
}
