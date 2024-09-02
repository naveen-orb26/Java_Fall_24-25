import java.time.LocalDate;
import java.time.LocalTime;
public class DateTime{
    public static void main(String[] args){
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println(ld);
        System.out.println(lt);
    }
}