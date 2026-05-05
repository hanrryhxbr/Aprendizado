package dataHora.java_Util_Date.minhaFixacao_Date.fazendoCalculosComCalendar;

import java.util.Calendar;
import java.util.Date;

public class Main {
    static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        Date data = new Date();

        calendario.setTime(data);

        calendario.add(Calendar.HOUR_OF_DAY, 7);

        System.out.println(data);

        data = calendario.getTime();

        System.out.println("---------------------");

        int ano = calendario.get(Calendar.YEAR);
        System.out.println(ano);

        int mes = 1 + calendario.get(Calendar.MONTH);
        System.out.println(mes);

        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);

        int horas = calendario.get(Calendar.HOUR_OF_DAY) - 7;
        System.out.println(horas);

        int minutos = calendario.get(Calendar.MINUTE);
        System.out.println(minutos);

        int segundos = calendario.get(Calendar.SECOND);
        System.out.println(segundos);

    }

}
