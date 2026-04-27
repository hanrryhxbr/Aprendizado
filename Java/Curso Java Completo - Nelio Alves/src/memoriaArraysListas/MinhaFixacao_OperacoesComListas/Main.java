package memoriaArraysListas.MinhaFixacao_OperacoesComListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<String> alunos = new ArrayList<>();

        alunos.add("Romeryto");
        alunos.add(1, "Lucas");
        alunos.add("Thales");
        alunos.add("Pedro");
        alunos.add("Ian");
        alunos.add("Zé");
        alunos.addLast("Romeryto");

        for (String x : alunos) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        System.out.println(alunos.size());

        System.out.println("---------------------------------");

        System.out.println(alunos.indexOf("Romeryto"));

        System.out.println("---------------------------------");

        System.out.println(alunos.lastIndexOf("Romeryto"));

        System.out.println("---------------------------------");

        alunos.remove("Romeryto");

        for (String x : alunos) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        alunos.addFirst("Romeryto");

        for (String x : alunos) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        alunos.remove(4);

        for (String x : alunos) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        //List<String> resultado = alunos.stream().filter(x -> x.charAt(0) != 'R').collect(Collectors.toList());

        List<String> resultado = alunos.stream().filter(x -> x.charAt(0) != 'R').toList();

        for (String x : resultado) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        alunos.removeIf(x -> x.charAt(0) != 'R');

        for (String x : alunos) {

            System.out.println(x);

        }

        System.out.println("---------------------------------");

        String nome = resultado.stream().filter(x -> x.charAt(1) == 'e').findFirst().orElse(null);
        System.out.println(nome);

    }

}
