package lr8.quest12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
public class Main {
    public static void main(String[] args) {

        String pathRead = "src/quest12/Lermontov.txt";
        String pathWrite = "src/quest12/Pushkin.txt";

        List<String> list = readFile(pathRead);
        list = searchWords(list);
        writeFile(pathWrite, list);
    }
    public static void writeFile(String path, List<String> list) {
        try {
            Files.write(Paths.get(path), list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        if (path != null) {
            try {
                list = Files.readAllLines(Paths.get(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static List<String> searchWords(List<String> list) {
        List<String> searchList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (String line : list) {
                if (line.length() > 0) {
                    line = line.replaceAll("\\p{Punct}", " ").trim();
                    String[] words = line.split("\\s+");
                    if (words.length > 1) {
                        for (int i = 0; i < words.length - 1; i++) {
                            if (words[i].length() > 0 && words[i + 1].length() > 0) {
                                if (Character.toLowerCase(words[i].charAt(words[i].length() - 1)) == Character.toLowerCase(words[i + 1].charAt(0))) {
                                    searchList.add(words[i] + " " + words[i + 1]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return searchList;
    }
}

