package genericSetMap.exerciciosPropostos.exerciciosPropostos_Map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    static void main() {

        Map<String, Integer> voteRegister = new TreeMap<>();

        String path = IO.readln("Enter file full path: ");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(",");
                String key = fields[0];
                int value = Integer.parseInt(fields[1]);
                //voteRegister.merge(key, value, Integer::sum);
                //solução mais elegante
                Integer addVotesQuantity = voteRegister.putIfAbsent(key, value);
                if (addVotesQuantity != null) {
                    voteRegister.compute(key, (k, oldValue) -> oldValue + value);
                }

                line = br.readLine();
            }

        }
        catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }

        for (String keys : voteRegister.keySet()) {

            System.out.println(keys + ": " + voteRegister.get(keys));
        }
    }
}
