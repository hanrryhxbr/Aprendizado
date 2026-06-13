package dataHora.java_Time.minhaFixacao_JavaTime.ConvertendoDataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.parse("01/12/06 06:50:15", DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
        Instant d3 = Instant.parse("2006-12-01T06:50:15.0Z");
        Instant d4 = Instant.now();

        System.out.println(LocalDate.ofInstant(d3, ZoneId.systemDefault()));
        System.out.println(LocalDateTime.of(d1, LocalTime.now()));
        System.out.println(LocalDateTime.ofInstant(d4, ZoneId.of("Portugal")));
        System.out.println("----------------------");
        System.out.println(d1.getDayOfMonth());
        System.out.println(d1.getDayOfWeek());
        System.out.println(d1.getMonth());
        System.out.println(d1.getMonthValue());
        System.out.println(d1.getYear());
        System.out.println("----------------------");
        System.out.println(d2.getHour());
        System.out.println(d2.getMinute());
        System.out.println(d2.getSecond());
        System.out.println(d2.getNano());
        System.out.println(d2.getChronology());

    }
}
