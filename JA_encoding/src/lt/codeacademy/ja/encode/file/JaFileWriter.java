package lt.codeacademy.ja.encode.file;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JaFileWriter {

    public void writeNotExistingCode(List<Integer> codes) {
        StringBuilder result = new StringBuilder();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("bad_letters.txt"))) {
            for(int c: codes){
                result.append(c).append(" ");
            }
            bw.write(result.toString());
        } catch (IOException e) {
            System.out.println("Cannot write to file " + e.getMessage());
        }
    }

}
