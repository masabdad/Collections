import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        // 1. List Example
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A"); // Allows duplicates
        list.add("C");
        System.out.println("List (ArrayList): " + list);

        // Iterating List
        System.out.println("Iterating List:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
