import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class LPU{
    public static void main(String args[]){
        // LocalDate ld = LocalDate.of(1980, 2, 29);
        // System.out.println(ld.isLeapYear());

        // System.out.println(ld);
        // System.out.println(ld.format(DateTimeFormatter.BASIC_ISO_DATE));


        // ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone1 = ZoneId.systemDefault();
        // System.out.println(LocalTime.now());
        System.out.println(zone1.getId());
    }
}


//Print the current time of New York City