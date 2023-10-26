package Lesson29;

import java.time.*;
import java.time.format.*;

public class Task {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM - dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    public void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        LocalDateTime ldt = start;
        while (ldt.isBefore(end)) {
            System.out.println("Работаем с: " + ldt.format(f1));
            ldt = ldt.plus(p);
            System.out.println("До: " + ldt.format(f1));
            System.out.println("Отдыхаем с: " + ldt.format(f2));
            ldt = ldt.plus(d);
            System.out.println("До: " + ldt.format(f2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2023, 10, 10, 10, 36, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 12, 18, 17, 25, 10);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        Task t = new Task();
        t.smena(ldt1, ldt2, p, d);

    }
}
