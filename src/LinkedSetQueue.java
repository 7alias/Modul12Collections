import java.util.*;

public class LinkedSetQueue {
//
//    public static void main(String[] args) {
//        Deque<Integer> queue = new ArrayDeque<>();
//        queue.push(1);
//        queue.push(2);
//        queue.push(3);
//
//        Set<Integer> set = new LinkedHashSet<>(queue); // 1
//
//        System.out.println(set);
//    }


//
//    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//
//        set.add("Hello");
//        set.add("Hello again");
//        set.add("Hello");
//
//        System.out.println(set);
//    }

    public static void main(String[] args) {
        Set<Double> set = new TreeSet<>();

        set.add(21.5);
        set.add(14.2);
        set.add(8d); // 1
        set.add(8.0);

        System.out.println(set);
    }
}


