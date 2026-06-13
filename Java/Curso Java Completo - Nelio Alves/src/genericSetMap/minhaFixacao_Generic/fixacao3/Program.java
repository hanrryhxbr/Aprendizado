package genericSetMap.minhaFixacao_Generic.fixacao3;

import java.util.Arrays;
import java.util.List;

public class Program {
    static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2 ,3);
        printList(integers);

        List<String> strings = Arrays.asList("Maria", "Kleber", "Pedro");
        printList(strings);

    }

    public static void printList(List<?> list) {

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
