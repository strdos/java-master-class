package input_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadingChallenge {

    public static void main(String[] args) {
        // Change the file path to your text document
        String filePath = "src/files/shakespeare.txt";

        try {
            // Read the text document
            Scanner scanner = new Scanner(new File(filePath));
            Map<String, Integer> wordFrequencyMap = new HashMap<>();

            // Tokenize the text, remove punctuation, and count occurrences
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (word.length() > 5) {
                    wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            // Sort the map by value in descending order
            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequencyMap.entrySet());
            sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            // Display the top 10 most used words
            int count = 0;
            for (Map.Entry<String, Integer> entry : sortedEntries) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
                count++;
                if (count == 10) {
                    break;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    }
}
