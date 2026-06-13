package dataHora.java_Time.minhaFixacao_JavaTime.CalculosComDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    static void main(String[] args) {

        LocalDate d1 = LocalDate.now();
        LocalDate d1_1 = LocalDate.now().plusMonths(3);
        LocalDateTime d2 = LocalDateTime.parse("01/12/06 06:50:15", DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss"));
        LocalDateTime d2_1 = LocalDateTime.now().minusDays(5);
        Instant d3 = Instant.parse("2006-12-01T06:50:15.0Z");
        Instant d4 = Instant.now();

        System.out.println(d1.plusDays(19).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
        System.out.println(d1.minusDays(19).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
        System.out.println("--------------------");
        System.out.println(d2.plusHours(20));
        System.out.println(d2.plus(20, ChronoUnit.DECADES));
        System.out.println("--------------------");
        System.out.println(d3.plus(18, ChronoUnit.DAYS));
        System.out.println("--------------------");

        Duration t1 = Duration.between(d1.atStartOfDay(), d1_1.atStartOfDay());
        Duration t2 = Duration.between(d1.atTime(0, 0), d1_1.atTime(0, 30));
        Duration t3 = Duration.between(d1_1.atStartOfDay(), d1.atTime(12, 30));
        Duration t4 = Duration.between(d1.atTime(0,0), d2_1);
        Duration t5 = Duration.between(d1.atStartOfDay(), d2_1);

        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());
        System.out.println(t4.toDays());
        System.out.println(t5.toDays());

    }

}
