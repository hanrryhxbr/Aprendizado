package trabalhandoComArquivos;

import java.io.*;
import java.util.*;

public class exercicioProposto {
    void main() {

        Locale.setDefault(Locale.US);

        String filePath = "c:\\users\\romer\\documents\\in.csv";

        File in = new File(filePath);
        boolean outDirectory = new File(in.getParent() + "\\out").mkdir();

        List<String[]> items = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String tempStr = br.readLine();
            while (tempStr != null) {
                String[] itemInfo = tempStr.split(",");
                items.add(itemInfo);
                tempStr = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        for (String[] item : items) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(in.getParent() + "\\out\\summary.csv", true))) {
                bw.write(item[0] + "," + String.format("%.2f", Double.parseDouble(item[1]) * Double.parseDouble(item[2])));
                bw.newLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
