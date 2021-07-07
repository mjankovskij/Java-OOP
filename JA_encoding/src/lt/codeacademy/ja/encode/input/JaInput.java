package lt.codeacademy.ja.encode.input;

import java.util.*;

public class JaInput {
    private final Scanner sc = new Scanner(System.in);

    public List<String> inputTextAsList() {
        List<String> list =  new ArrayList<>(
                Arrays.asList(sc.nextLine().split(""))
        );
        list.replaceAll(s-> s.replace(" ", "tarpas"));
        return list;
    }

}