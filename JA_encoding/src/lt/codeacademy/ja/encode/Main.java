package lt.codeacademy.ja.encode;

import lt.codeacademy.ja.encode.file.JaFileReader;
import lt.codeacademy.ja.encode.file.JaFileWriter;
import lt.codeacademy.ja.encode.input.JaInput;
import lt.codeacademy.ja.encode.service.JaEncodeService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        JaFileReader reader = new JaFileReader();
        Map<Integer, String> map = reader.read();
        JaEncodeService service = new JaEncodeService(map);

//        List<Integer> letters = reader.readLetter("antanui.txt");
//        service.checkEncode(letters);

//        List<Integer> codes = reader.readLetter("uzkoduota.txt");



        if(args[0].equals("send")){
            JaInput jaInput = new JaInput();
            List<String> text = jaInput.inputTextAsList();
            JaFileWriter writer = new JaFileWriter();
            writer.write("atkoduota.txt", text.toString());
            writer.write("uzkoduota.txt", service.encode(text));
        }else if (args[0].equals("read")){
            List<Integer> letters = reader.readLetter("uzkoduota.txt");
            service.checkEncode(letters);
            List<Integer> codes = reader.readLetter("uzkoduota.txt");
            System.out.println(service.decode(codes));
        }

    }
}