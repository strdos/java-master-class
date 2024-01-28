package collections;

import java.util.HashSet;
import java.util.Set;

public class TaskMain {
    public static void main(String[] args) {

        Set<Task> unionSet = getUnion(TaskData.getTasks("bob"), TaskData.getTasks("ann"));
        System.out.println(unionSet);

        Set<Task> intersectSet = getIntersect(TaskData.getTasks("bob"), TaskData.getTasks("ann"));
        System.out.println(intersectSet);

        Set<Task> differenceSet = getIntersect(TaskData.getTasks("bob"), TaskData.getTasks("ann"));
        System.out.println(differenceSet);

    }
    @SafeVarargs
    public static Set<Task> getUnion(Set<Task>... taskSets) {
        Set<Task> unionSet = new HashSet<>();
        for (Set<Task> set: taskSets) {
            unionSet.addAll(set);
        }
        return unionSet;
    }

    public static Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> diffSet = new HashSet<>(set1);
        diffSet.removeAll(set2);
        return diffSet;
    }

}
