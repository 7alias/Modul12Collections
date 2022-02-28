import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Generic {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add("Hello");
        for (int i = 1; i <= 24; i++) {
            queue.add(i);
        }
        queue.add(new Date());
        queue.add(new Date());
        String element = (String) queue.poll();
        System.out.println(element);

        Queue<String> stringsQueue = new LinkedList<>();

        stringsQueue.add(" test");
         element = stringsQueue.poll();

        System.out.println(element);


    }
}
