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
        ListIterator<String> iterator2 = strings.listITerator(strings.size()-1);
        for(int i = 0; i< strings.size()/2; i++){
            String str = iterator2.previous();
            iterator2.set(iterator.next());
            iterator.set(str);
        }
        strings=names;
    }
}
