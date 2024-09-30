import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatenTime {
public static void main(String[] args) {
    LocalDateTime Myformatobj = LocalDateTime.now();
    System.out.println("Before Formatting: "+Myformatobj);
    DateTimeFormatter obj2 = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:MM:SS");

    String Formatted = Myformatobj.format(obj2);
    System.out.println("After Formatting: "+ Formatted);
}    
}
