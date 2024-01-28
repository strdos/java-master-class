package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private static String allTasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, Medium
            Data Design, assignee Table, Medium
            Data Design, Cross Reference Tables, High
            Data Design, Encryption Policy, High
            Data Access, Write Views, Low
            Data Access, Set Up Users, Low
            Data Access, Set Up Access Policy, Low
            """;

    private static String annsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy,Medium, In Progress
            Research, Cloud solutions, Medium, In Progress
            Data Design, Encryption Policy, High
            Data Design, Project Table, Medium
            Data Access, Write Views,Low, In Progress
            """;

    private static String bobsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium
            Data Design,Encryption Policy,High
            Data Access,Write Views, Low, In Progress
            """;

    private static String carolsTasks = """
            Infrastructure, Logging, High, In Progress
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low 
            """;

    public static Set<Task> getTasks(String owner) {
        HashSet<Task> tasksSet = new HashSet<>();
        String assignee = ("ann,bob,carol").contains(owner.toLowerCase()) ? owner : null;
        String selectedSet = switch(assignee) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> allTasks;
        };
        for (var task: selectedSet.split("\n")) {
            String[] taskAttributes = task.split(",");
            Arrays.asList(taskAttributes).replaceAll(String::trim);
            Status status = taskAttributes.length <= 3 ? Status.IN_QUEUE : Status.valueOf(taskAttributes[3].toUpperCase().replace(' ', '_'));
            Priority priority = Priority.valueOf(taskAttributes[2].toUpperCase());
            
            tasksSet.add(new Task(taskAttributes[0], taskAttributes[1], assignee, priority, status));
        }
        return tasksSet;
    }
}
