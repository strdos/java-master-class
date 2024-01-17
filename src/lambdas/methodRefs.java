package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class PlainOld{
    private static int last_id = 1;
    private int id;
    public PlainOld() {
        id = last_id++;
        System.out.println("Creating a Plain Old Object, id = " + id);
    }
}
public class methodRefs {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Anna", "John", "Bob", "Greg", "Kate"));
        //names.forEach(s -> System.out.println(s)); //lambda
        //names.forEach(System.out::println); //method reference

        calculator((a, b) -> a + b, 10, 15); //lambda
        calculator(Integer::sum, 10, 15); //method reference

        calculator((a, b) -> a + b, "a", "bc"); //lambda
        calculator((a, b) -> a.concat(b), "a", "bc"); //lambda
        calculator(String::concat, "a", "bc"); //method reference

        Supplier<PlainOld> reference1 = () -> new PlainOld(); //lambda
        Supplier<PlainOld> reference2 = PlainOld::new; //method reference (referencing constructor)
        PlainOld po = reference2.get();

        UnaryOperator<String> uoAsLambda = s -> s.toUpperCase(); //lambda
        UnaryOperator<String> uoAsMethodRef = String::toUpperCase;

        System.out.println("Test".transform(uoAsMethodRef));

    }

    private static <T> void calculator(BinaryOperator<T> func, T t1, T t2) {
        T result = func.apply(t1, t2);
        System.out.println("Result of operation: " + result);
    }
}
