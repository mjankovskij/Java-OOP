package lt.codeacademy.ja.encode.service;

import lt.codeacademy.ja.encode.file.JaFileWriter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record JaEncodeService(Map<Integer, String> encodeMap) {

    public void checkEncode(List<Integer> letters) {
        letters = letters.stream().filter(l -> !isExist(l)).collect(Collectors.toList());
        JaFileWriter jaFileWriter = new JaFileWriter();
        jaFileWriter.writeNotExistingCode(letters);
    }

    private boolean isExist(Integer key) {
        return encodeMap.get(key) != null;
    }

    public String decode(List<Integer> codes) {
        return codes.stream().map(this::decodeLetter).collect(Collectors.joining());
    }

    public String decodeLetter(int key) {
        String str = isExist(key) ? encodeMap.get(key) : "";
        return str.equals("tarpas") ? " " : str;
    }
}