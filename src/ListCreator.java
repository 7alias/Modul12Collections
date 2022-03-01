import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCreator {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        ListIterator<Integer> listIterator = linkedList.listIterator();
        {

            do {
                System.out.print(linkedList);
                Collections.reverse(linkedList);
                System.out.println(" ");
                System.out.println(" ");
                System.out.print(linkedList);
                break;
            } while (listIterator.hasNext());
        }
    }
}
