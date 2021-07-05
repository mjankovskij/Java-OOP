package lt.codeacademy.ja.encode.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class JaFileReader {
    public final String JA_FILENAME = "ja.txt";

    public Map<Integer, String> read() {
        Map<Integer, String> encodes = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(JA_FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                if (arr.length != 2) {
                    continue;
                }
                try {
                    encodes.put(Integer.parseInt(arr[0]), arr[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Cannot parse " + arr[0]);
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot read file " + JA_FILENAME + e.getMessage());
        }
        return encodes;
    }

    public List<Integer> readLetter(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            return null;
        }
        List<Integer> letters = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(" ");
                addItems(letters, arr);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file " + fileName + e.getMessage());
        }
        return letters;
    }

    private void addItems(List<Integer> letters, String[] items) {
        try {
            Arrays.stream(items)
                    .forEach(item -> letters.add(Integer.valueOf(item)));
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse " + e.getMessage());
        }
    }
}
