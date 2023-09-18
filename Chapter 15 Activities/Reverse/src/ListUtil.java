import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();   
        ListIterator<String> iterator2 = strings.listIterator(strings.size()-1);

        while(iterator.hasNext()){
            String str = iterator.next();
            iterator.remove();

        }
    }
}