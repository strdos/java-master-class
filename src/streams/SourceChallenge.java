package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SourceChallenge {

    static int counter;
    public static void main(String[] args) {

//        Collections.stream()
//        Arrays.stream(T[])
//        Stream.of(T...)
//        Stream.iterate()
//        Stream.generate()
//        IntStream.range()
//        IntStream.rangeClosed()

        var bStream = Stream.iterate(1, s -> s + 1)
                .limit(15)
                .map(s -> "B" + s);

        String [] iArray = new String[15];
        for (int i = 0; i < 15; i++) {
            iArray[i] = "I" + (i + 16);
        }
        Arrays.setAll(iArray, s -> "I" + (16 + s));   //another way
        var iStream = Arrays.stream(iArray);

        var nStream = IntStream.range(31, 46)
                        .mapToObj(s -> "N" + s);

        var gStream = Stream.iterate(46, s -> s <= 60, s -> s + 1)
                        .map(s -> "G" + s);

        var oStream = Stream.generate(SourceChallenge::getCounter)
                        .limit(15)
                        .map(s -> "O" + (s + 61));

        var streamBI = Stream.concat(bStream, iStream);
        var streamNG = Stream.concat(nStream, gStream);
        var streamBING = Stream.concat(streamBI, streamNG);
        var streamBINGO = Stream.concat(streamBING, oStream);

        streamBINGO.forEach(System.out::println);
    }

    static int getCounter() {
        return counter++;
    }
}
