package lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class LambdasChalleges {

    public static void main(String[] args) {

        //anonymous method
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String p: parts) {
                    System.out.println(p);
                }
            }
        };

        //lambda
        Consumer<String> printThePartsLambda = s -> {
            String[] parts = s.split(" ");
            for (String p: parts) {
                System.out.println(p);
            }
        };

        //another lambda
        Consumer<String> printThePartsLambda2 = s -> {
            String[] parts = s.split(" ");
            Arrays.asList(parts).forEach(part -> System.out.println(part));
        };

        //another lambda
        Consumer<String> printThePartsLambda3 = s -> Arrays.asList(s.split(" ")).forEach(w -> System.out.println(w));

/*        printTheParts.accept("Let's split this up into an array");
        printThePartsLambda.accept("Let's split this up into an array");
        printThePartsLambda2.accept("Let's split this up into an array");
        printThePartsLambda3.accept("Let's split this up into an array");*/

/*        System.out.println(everySecondChar("java"));
        System.out.println(evenChars.apply("java"));
        System.out.println(evenCharsUnary.apply("java"));
        System.out.println(evenCharsUnary.apply("1234567890"));
        System.out.println(everySecondCharacter(evenCharsUnary, "1234567890"));*/

        //anonymous method
        Supplier<String> challenge6 = new Supplier<String>() {
            @Override
            public String get() {
                return "I love Java";
            }
        };

        //lambda
        Supplier<String> challenge6lambda = () -> "I love Java";

        System.out.println(challenge6.get());
        System.out.println(challenge6lambda.get());


    }
    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if ((i % 2) == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    static Function<String, String> evenChars = s -> {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2) == 1) {
                returnVal.append(s.charAt(i));
            }
        }
        return returnVal.toString();
    };

    static UnaryOperator<String> evenCharsUnary = s -> {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2) == 1) {
                returnVal.append(s.charAt(i));
            }
        }
        return returnVal.toString();
    };

    static String everySecondCharacter(Function<String, String> f, String s) {
        return f.apply(s);
    }


}
