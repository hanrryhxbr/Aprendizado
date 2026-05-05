package dataHora.java_Util_Date.minhaFixacao_Date.instanciandoSimpleFormat_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    static void main(String[] args) throws ParseException {

        SimpleDateFormat formatador1 = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat formatador2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        SimpleDateFormat formatador3 = formatador2;
        formatador3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date data1 = new Date();
        Date data2 = new Date(System.currentTimeMillis());
        Date data3 = formatador1.parse("01/12/06");
        Date data4 = new Date(0L);
        Date data5 = new Date(10000L * 60L * 60L * 5L);
        Date data6 = Date.from(Instant.now());
        Date data7 = Date.from(Instant.parse("2006-12-01T00:00:00Z"));

        System.out.println(data1);
        System.out.println(formatador1.format(data1));
        System.out.println("---------------");
        System.out.println(data2);
        System.out.println(formatador2.format(data2));
        System.out.println("---------------");
        System.out.println(data3);
        System.out.println(formatador3.format(data3));
        System.out.println("---------------");
        System.out.println(data4);
        System.out.println(formatador3.format(data4));
        System.out.println("---------------");
        System.out.println(data5);
        System.out.println(formatador3.format(data5));
        System.out.println("---------------");
        System.out.println(data6);
        System.out.println(formatador3.format(data6));
        System.out.println("---------------");
        System.out.println(data7);
        System.out.println(formatador3.format(data7));


    }
}
