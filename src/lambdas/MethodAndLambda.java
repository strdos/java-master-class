package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MethodAndLambda {

    private static Random random = new Random();
    public static void main(String[] args) {

        String[] names = new String[] {"Boris", "Chris", "David"};

        UnaryOperator<String> toUpperCase = String::toUpperCase;
        UnaryOperator<String> evenChars = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                StringBuilder results = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    if ((i % 2) == 1) {
                        results.append(s.charAt(i));
                    }
                }
                return results.toString();
            }
        };
        UnaryOperator<String> evenCharsLambda = s -> {
            StringBuilder results = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((i % 2) == 1) {
                    results.append(s.charAt(i));
                }
            }
            return results.toString();
        };

/*        List<String> result = Arrays.asList(names);
        result.forEach(toUpperCase::apply);
        System.out.println(Arrays.toString(names));


        Arrays.asList(names).forEach(evenCharsLambda::apply);
        //Arrays.asList(names).forEach(System.out::println);
        System.out.println(Arrays.toString(names));*/

        List<UnaryOperator<String>> functions = new ArrayList<>();
        functions.add(toUpperCase);
        functions.add(evenChars);

        applyChanges(names, functions);

    }

    private static void applyChanges(String[] source, List<UnaryOperator<String>> functions) {

        List<String> sourceAsList = Arrays.asList(source);
        for (var f: functions) {
            sourceAsList.replaceAll(s -> s.transform(f));
            System.out.println(Arrays.toString(source));
        }
    }
}
