import java.util.*;

public class encode_and_decode_strings_271 {
    public static String encode(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs) {
            stringBuilder.append(s.length()).append("/").append(s);
        }
        return stringBuilder.toString();
    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slashIndex = str.indexOf("/", i);
            int length = Integer.parseInt(str.substring(i, slashIndex));
            String res = str.substring(slashIndex + 1, slashIndex + 1 + length);
            result.add(res);
            i = slashIndex + 1 + length;
        }
        return result;
    }

    public static void main(String args[]) {
        String[] arrayOfStrings = { "hello", "world", "leetcode" };
        String encodedString = encode(arrayOfStrings);
        System.out.println(encodedString);
        List<String> decodedStrings = decode(encodedString);
        System.out.println(decodedStrings);
    }
}