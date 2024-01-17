package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class PutTogetherChallenge {

    private static Random random = new Random();
    public static void main(String[] args) {

        String[] names = {"Anna", "John", "Ben", "Ralph", "Greg", "Bob", "Kate"};

        //method 1
        Arrays.setAll(names, i -> names[i].toUpperCase());
        System.out.println(Arrays.toString(names));

        //method 2
        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(n -> n.toUpperCase());
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'Z') + ".");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s + " " + getReversedName(s.split(" ")[0]));
        System.out.println(Arrays.toString(names));
        Arrays.asList(names).forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ") + 1)));
        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar) {

/*        int result = random.nextInt(Character.getNumericValue(startChar), Character.getNumericValue(endChar));
        return Integer.toString(result).charAt(0);*/
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String getReversedName(String s) {
/*        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();*/
        return new StringBuilder(s).reverse().toString();
    }
}
