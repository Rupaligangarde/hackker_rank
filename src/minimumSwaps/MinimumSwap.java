package minimumSwaps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MinimumSwap {

    static String secureChannel(int operation, String message, String key) {


        switch(operation){
            case 1:
                return encode(message, key);
            case 2:
                return decode(message, key);
            default:
                return "";
        }

    }
    private static String encode(String message, String key) {

        char[] messageArray = message.toCharArray();
        char[] keyArray = key.toCharArray();

        List<Character> output = new ArrayList<>();

        for (int i = 0; i < keyArray.length; i++) {
            int count = Character.getNumericValue(keyArray[i]);
            System.out.println(count);
            while (count > 0) {
                output.add(messageArray[i]);
                count--;
            }
        }

        for (int i = keyArray.length; i < messageArray.length; i++) {
            output.add(messageArray[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : output) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    private static String decode(String message, String key) {
        char[] keyArray = key.toCharArray();
        char[] input = message.toCharArray();

        List<Character> output = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            char letter = input[i];
            if (!(output.contains(letter))) {
                output.add(letter);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : output) {
            sb.append(ch);
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    private static List<Character> repeat(char count, char letter) {
        int repeatCount = Character.getNumericValue(count);
        List<Character> message = new ArrayList<>();
        for (int i = 0; i < repeatCount; i++) {
            System.out.print(letter);
            message.add(letter);
        }
        return message;

    }

    public static void main(String[] args) throws IOException {

//        int[] arr = {2, 3, 4, 1, 5};
//        int[] arr = {4, 3, 1, 2};


        String res = secureChannel(1, "open", "123");

    }
}

