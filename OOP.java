import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class OOP {

     public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
     }
}