package collections;

import java.util.HashMap;
import java.util.Scanner;

public class Adventure {
    private static final String data = """
                road,at the end of the road, W: hill, E:well house,S:valley,N:forest
                hill,on top of hill with a view in all directions,N:forest, E:road
                well house,inside a well house for a small spring,W:road,N:lake,S:stream
                valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
                forest,at the edge of a thick dark forest,S:road,E:lake
                lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
                stream,near a stream with a rocky bed,W:valley, N:well house
                """;

    public record Location(String description, HashMap<Character, String> nextPlaces) {
    }
    public static void main(String[] args) {

        HashMap<String, Location> locations = new HashMap<>();

        String[] lines = data.split("\n");
        for (String line: lines) {
            String[] lineChunks = line.split(",");
            String location = lineChunks[0];
            String description = lineChunks[1].trim();

            HashMap<Character, String> nextPlaces = new HashMap<>();
            for (int i = 2; i < lineChunks.length; i++) {
                String[] finalChunks = lineChunks[i].split(":");
                Character key = finalChunks[0].trim().charAt(0);
                String value = finalChunks[1].trim();
                nextPlaces.put(key, value);
            }

            locations.put(location, new Location(description, nextPlaces));
        }
        Location location = locations.get("road");

        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        while(keepPlaying) {
            System.out.println("You're standing " + location.description() + ".");
            System.out.println("From here, you can see:");
                location.nextPlaces().forEach((key, value) -> System.out.println("a " + value + " to the " +
                                switch (key) {
                                    case 'E' -> "East (E)";
                                    case 'S' -> "South (S)";
                                    case 'W' -> "West (W)";
                                    case 'N' -> "North (N)";
                                    default -> "Invalid value";
                                })
                );
            System.out.println("Select Your Compass Direction (Q to quit) >> ");
            char input = scanner.nextLine().trim().toUpperCase().charAt(0);
            if (input == 'Q') {
                keepPlaying = false;
            } else if (location.nextPlaces().containsKey(input)) {
                location = locations.get(location.nextPlaces().get(input));
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
