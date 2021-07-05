package lt.codeacademy.ja.encode;

import lt.codeacademy.ja.encode.file.JaFileReader;
import lt.codeacademy.ja.encode.service.JaEncodeService;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JaFileReader reader = new JaFileReader();
        Map<Integer, String> map = reader.read();
        JaEncodeService service = new JaEncodeService(map);

        List<Integer> letters = reader.readLetter("antanui.txt");
        service.checkEncode(letters);

        System.out.println(letters);
    }
}
