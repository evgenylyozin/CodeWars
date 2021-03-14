package CodeWars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase == "") return null;
        return Arrays.stream(phrase.split(" "))
                .map(word->word.substring(0, 1)
                .toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("test string!"));
    }

}
