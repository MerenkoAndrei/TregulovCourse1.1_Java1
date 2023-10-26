package Lesson28;
import java.time.format.*;
import java.time.*;

public class Task {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate ld = LocalDate.of(2023, 10, 9);
        System.out.println("\n" + ld);
        LocalDate LD1 = LocalDate.of(2023, Month.OCTOBER, 9);
        System.out.println("\n" + LD1);
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld.format(d1));

    }
}
