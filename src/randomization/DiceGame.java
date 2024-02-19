package randomization;

import java.util.*;

public class DiceGame {

    private static final Random random = new Random();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        List<Integer> currentDice = new ArrayList<>();

        do {
            rollDice(currentDice);
        } while (!pickLosers(currentDice));
        System.out.println("Game over.");
    }

    private static void rollDice(List<Integer> currentDice) {

        var randomCount = 5 - currentDice.size();

        var newDice = random.ints(randomCount,1, 7)
                .sorted()
                .boxed()
                .toList();

        currentDice.addAll(newDice);
        System.out.println("Your dice are " + currentDice);
    }

    private static boolean pickLosers(List<Integer> currentDice) {

        String prompt = """
                
                Press Enter to score.
                Type "ALL" to re-roll all the dice.
                List numbers (separated by spaced) to re-roll selected dice.
                """;
        System.out.println(prompt + "-->");

        String userInput = scanner.nextLine();
        if (userInput.isBlank()) {
            return true;
        } else try {
            removeDice(currentDice, userInput.split(" "));
        } catch (Exception e) {
            e.printStackTrace(System.out);
            System.out.println("Invalid input. Try again.");
        }
        return false;
    }

    private static void removeDice(List<Integer> currentDice, String[] selectedDice) {

        if (selectedDice.length == 1 && selectedDice[0].contains("ALL")) {
            currentDice.clear();
        } else {
            for (String el: selectedDice) {
                currentDice.remove(Integer.valueOf(el));
            }
            System.out.println("Keeping " + currentDice);
        }
    }
}
