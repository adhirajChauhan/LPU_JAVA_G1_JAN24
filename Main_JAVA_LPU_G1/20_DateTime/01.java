import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class LPU{
    public static void main(String args[]){

        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Before Formatting : " + dateTime);

        // DateTimeFormatter format = DateTimeFormatter.ofPattern("dd / MM / yyyy - a G");

        // String formattedDate = dateTime.format(format);

        // System.out.println("After Formatting : " + formattedDate);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));

        // System.out.println(date.plusDays(2));
        // System.out.println(date.minusDays(2));


        // System.out.println(dateTime);
    }
}