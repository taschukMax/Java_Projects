package book.collection;


import java.util.HashSet;
import java.util.Set;

public class App00 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Max");
        set.add("Nadya");
        set.add("Family");
        System.out.println(set);
        System.out.println(set.contains("Max"));
        System.out.println(set.contains("Maxim"));
        set.remove("Family");
        System.out.println(set);
    }
}
