package lt.codeacademy.ja.encode.service;

import lt.codeacademy.ja.encode.file.JaFileWriter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JaEncodeService {
    private final Map<Integer, String> encodeMap;

    public JaEncodeService(Map<Integer, String> encodeMap){
        this.encodeMap = encodeMap;
    }

    public void checkEncode(List<Integer> letters){
        letters = letters.stream().filter(l -> !isExist(l)).collect(Collectors.toList());
        JaFileWriter jaFileWriter = new JaFileWriter();
        jaFileWriter.writeNotExistingCode(letters);
    }

    private boolean isExist(Integer key){
        return encodeMap.get(key) != null;
    }

}
