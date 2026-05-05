package dataHora.java_Time.minhaFixacaoJava_Time.InstanciandoDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    static void main(String[] args) {

        DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter04 = DateTimeFormatter.ISO_DATE;

        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now();

        LocalDate data04 = LocalDate.parse("2026-04-28");
        LocalDateTime data05 = LocalDateTime.parse("2026-04-28T09:54:56");
        Instant data06 = Instant.parse("2026-04-28T09:55:33.333Z");

        LocalDate data07 = LocalDate.parse("2026/04/28", formatter01);
        LocalDateTime data08 = LocalDateTime.parse("2026/04/28 09:54", formatter02);
        LocalDateTime data09 = LocalDateTime.parse("2026/04/28 09:55:33", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        LocalDate data010 = LocalDate.of(2026, 4, 28);
        LocalDateTime data011 = LocalDateTime.of(2026, 4, 28, 9, 50, 33, 333);

        System.out.println(data01);
        System.out.println(data02);
        System.out.println(data03);
        System.out.println("-------------------------------");
        System.out.println(data04);
        System.out.println(data05);
        System.out.println(data06);
        System.out.println("-------------------------------");
        System.out.println(data07);
        System.out.println(data08);
        System.out.println(data09);
        System.out.println("-------------------------------");
        System.out.println(data010);
        System.out.println(data011);
        System.out.println("-------------------------------");
        System.out.println(data01.format(formatter01));
        System.out.println(formatter02.format(data02));
        System.out.println(formatter03.format(data03));
        System.out.println("-------------------------------");
        System.out.println(data09.toString());

    }

}
