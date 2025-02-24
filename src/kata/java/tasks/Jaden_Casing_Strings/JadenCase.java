package kata.java.tasks.Jaden_Casing_Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        StringBuilder sb = new StringBuilder();
        if (phrase == null) {
            System.out.println("IS NULL");
            return null;
        } else if (phrase == "") {
            return null;
        } else {
            String[] words = phrase.split(" ");
            if (words[0].length() > 0) {
                sb.append(Character.toUpperCase(words[0].charAt(0)) + words[0].subSequence(1, words[0].length()).toString().toLowerCase());
                for (int i = 1; i < words.length; i++) {
                    sb.append(" ");
                    sb.append(Character.toUpperCase(words[i].charAt(0)) + words[i].subSequence(1, words[i].length()).toString().toLowerCase());
                }
            }
        }

        return sb.toString();
    }

        //Another way of doing it.
//    public static String toJadenCase(String phrase) {
//        if (null == phrase || phrase.length() == 0) {
//            return null;
//        }
//
//        return Arrays.stream(phrase.split(" "))
//                .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
//                .collect(Collectors.joining(" "));
//    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes arent real"));
        System.out.println(toJadenCase(""));
        System.out.println(toJadenCase(null));

    }
}