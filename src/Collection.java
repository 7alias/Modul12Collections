import java.util.*;

public class Collection {

/*
    private static void collectionWork(Queue col) { // вставьте нужный код
        Object polledObject = col.poll();


    }
}
    private static void collectionWork(Collection collection) {
  Map col = (Map) collection; // вставьте нужный код
        col.put("Element 1", new Object());
    }
*/

    public static void main(String[] args) {

        Deque queue = new ArrayDeque();
        System.out.println(queue.remove());
    }
     /*
            Deque queue = new ArrayDeque();
            System.out.println(queue.pop());
        }

        Queue queue = new ArrayDeque();
        System.out.println(queue.peek());
    }*/
}
