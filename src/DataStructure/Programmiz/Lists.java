package DataStructure.Programmiz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main (String [] args)
    {
/*
        - The List interface is an ordered collection that allows us to add and remove elements like an array.

        - Classes that Implement List
           - Since List is an interface, we cannot create objects from it.
           - In order to use functionalities of the List interface, we can use these classes.
                ArrayList
                LinkedList
                Vector
                Stack

*/

        List<String> list  = new ArrayList<String>();

        list.add("1");
        list.add("2");
        list.add("3");

        System.out.println(list);

        // Java Array to ArrayList Conversion
        // ArrayList<String> languages = new ArrayList<String>(Arrays.asList(arr));

        List<Integer> liinkedList = new LinkedList<Integer>();

       /*  Methods of List
        - The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.

        - Some of the commonly used methods of the Collection interface that's also available in the List interface are:

        add() - adds an element to a list
        size() - returns the length of lists
        toArray() - converts a list into an array
        contains() - returns true if a list contains specified element
        remove() - removes an element from the list
        isEmpty()
        toString() - converts arrayList to string (not string array)

        addAll() - adds all elements of one list to another
        get() - helps to randomly access elements from lists
        iterator() - returns iterator object that can be used to sequentially access elements of lists
        set() - changes elements of lists .set(2, "new element at 2")
        removeAll() - removes all the elements from the list
        clear() - removes all the elements from the list (more efficient than removeAll())

*/
    }
}
