package arrayLists;

import java.util.*;

public class ArrayListPractice {

    //private static ArrayList<String> groceryList = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> groceryList = new ArrayList<>();

        while(true) {
            printActions();
            try {
                switch(scanner.nextInt()) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> addItems(groceryList);
                    case 2 -> removeItems(groceryList);
                }
            groceryList.sort(Comparator.naturalOrder());
            System.out.println(groceryList);
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
        }
    }
    private static void addItems(ArrayList<String> groceryList) {
        System.out.println("Enter items to be added to the list: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        //groceryList.addAll(List.of(array));
        for (String item: array) {
            if (!groceryList.contains(item)) {
                groceryList.add(item.trim());
            }
        }
    }

    private static void removeItems(ArrayList<String> groceryList) {
        System.out.println("Enter items to be removed from the list: ");
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(",");
        groceryList.removeAll(List.of(array));
    }

    private static void printActions() {
        System.out.println("Available actions: ");
        System.out.println("0 - to shut down");
        System.out.println("1 - to add item(s) to list (comma delimited list) ");
        System.out.println("2 - to remove any item(s) from list (comma delimited list) ");
        System.out.println("Enter a number for which action you want to do: ");
    }
}
