package lr8.quest11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("В ведите сколько будет рандомных чисел double");
        Scanner scanner1 = new Scanner(System.in);
        int k = Integer.parseInt(scanner1.nextLine());
        AddFile(k);
        Scanner sc = new Scanner(new File("src/quest11/in.txt"));
        sc = new Scanner(sc.nextLine()).useDelimiter(" ");
        List<Double> dlist = new ArrayList<>();
        sc.forEachRemaining(x -> listPositiveDouble(dlist, Double.parseDouble(x)));

        int indexMax = dlist.indexOf(Collections.max(dlist));
        FileWriter outFile = new FileWriter("src/quest11/out.txt", true);

        for (int i = 0; i < dlist.size(); i++) {
            if (i != indexMax) outFile.write(dlist.get(i) + " ");
        }
        outFile.write(String.valueOf(dlist.get(indexMax)));
        outFile.close();
    }

    static void listPositiveDouble(List<Double> list, double val) {
        if (val > 0.0) list.add(val);
    }
    public static void AddFile(int k){
        Path path = Paths.get("src/quest11/in.txt");

        String[] pri = new String[k];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < k; i++) {
            double start = -400;
            double end = 400;
            double random = new Random().nextDouble();
            double result = start + (random * (end - start));
            pri[i] = String.valueOf(result);
        }
        Arrays.sort(pri);

        try {

            byte[] bs = Arrays.toString(pri).replaceAll("[<>\\[\\],]", "").getBytes();
            Path writtenFilePath = Files.write(path, bs);

            System.out.println("Written content in file:\n"+ new String(Files.readAllBytes(writtenFilePath)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
