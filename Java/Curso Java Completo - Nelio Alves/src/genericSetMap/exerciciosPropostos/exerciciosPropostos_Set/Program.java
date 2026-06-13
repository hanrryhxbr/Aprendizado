package genericSetMap.exerciciosPropostos.exerciciosPropostos_Set;

import java.util.HashSet;
import java.util.Set;

public class Program {
    static void main(String[] args) {

        Set<Integer> students = new HashSet<>();

        int n = 0;

        n = Integer.parseInt(IO.readln("How many students for course A? "));

        for (int i = 0; i < n; i++) {
            students.add(Integer.parseInt(IO.readln()));
        }

        n = Integer.parseInt(IO.readln("How many students for course B? "));

        for (int i = 0; i < n; i++) {
            students.add(Integer.parseInt(IO.readln()));
        }

        n = Integer.parseInt(IO.readln("How many students for course C? "));

        for (int i = 0; i < n; i++) {
            students.add(Integer.parseInt(IO.readln()));
        }

        IO.println("Total students: " + students.size());
    }
}
