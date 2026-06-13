package genericSetMap.minhaFixacao_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    static void main(String[] args) {

        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("Romerito");
        stringSet1.add("Patricio");
        stringSet1.add("Vanderleia");
        stringSet1.add("Isabella");

        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("Romerito");
        stringSet2.add("Patricio");
        stringSet2.add("Vanderleia");
        stringSet2.add("Isabella");
        stringSet2.add("Daniel");
        stringSet2.add("Laura");
        stringSet2.add("Vitoria");
        stringSet2.add("Felipe");

        IO.println(stringSet1.contains("Romerito") + ", " + stringSet2.contains("Romerito"));
        IO.println(stringSet1.size() + ", " + stringSet2.size());
        System.out.println("-------------------------");

        Set<String> stringSet3 = new HashSet<>(stringSet2);

        IO.println(stringSet3.size());
        stringSet3.addAll(stringSet1);
        IO.println(stringSet1.size() + ", " + stringSet3.size());

        System.out.println("-------------------------");

        Set<String> stringSet4 = new HashSet<>(stringSet2);
        stringSet4.retainAll(stringSet1);
        IO.println(stringSet4.size());

        System.out.println("-------------------------");

        Set<String> stringSet5 = new HashSet<>(stringSet2);
        stringSet5.removeAll(stringSet1);
        IO.println(stringSet5.size());

        System.out.println("-------------------------");

        Set<String> stringSet6 = new LinkedHashSet<>(stringSet2);
        stringSet6.removeIf(x -> x.charAt(0) == 'R');
        IO.println(stringSet6.size());
        for (String s : stringSet6) {
            IO.println(s);
        }

        System.out.println("-------------------------");

        Set<String> stringSet7 = new TreeSet<>(stringSet2);
        stringSet7.remove("Isabella");
        IO.println(stringSet7.size());
        for (String s : stringSet7) {
            IO.println(s);
        }
        stringSet7.add("Romerito");
        stringSet7.add("Vanderleia");
        stringSet7.add("Daniel");
        IO.println(stringSet7.size());

        stringSet7.clear();
        IO.println(stringSet7.size());


    }
}
