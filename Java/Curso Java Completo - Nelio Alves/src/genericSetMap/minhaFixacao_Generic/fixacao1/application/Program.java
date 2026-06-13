package genericSetMap.minhaFixacao_Generic.fixacao1.application;

import genericSetMap.minhaFixacao_Generic.fixacao1.services.PrintService;

public class Program {
    static void main() {

        PrintService<String> ps = new PrintService<>();

        int n = Integer.parseInt(IO.readln("How many Strings? "));

        for (int i = 0; i < n; i++) {

            String value = IO.readln();
            ps.addValue(value);
        }

        IO.println("First: " + ps.first());
        ps.print();
    }
}
