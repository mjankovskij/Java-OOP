package lt.codeacademy.ja.encode.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
}
