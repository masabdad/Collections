import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

        // 2. Set Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A"); // Duplicate ignored
        hashSet.add("C");
        System.out.println("Set (HashSet): " + hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("B");
        System.out.println("Set (TreeSet - Sorted): " + treeSet);

        // Iterate Set
        System.out.println("\nIterating Set (HashSet):");
        for (String item : hashSet) {
            System.out.println(item);
        }

        // Iterate TreeSet
        // Automatically Sorts By Natural Sequence
        System.out.println("\nIterating Set (TreeSet - Sorted):");
        for (String item : treeSet) {
            System.out.println(item);
        }

    }
}
