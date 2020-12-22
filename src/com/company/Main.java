package com.company;


import javax.xml.soap.SOAPPart;
import java.util.*;

// For a deeper and more comprehensive guide to java please use the following...
// https://docs.oracle.com/javase/tutorial/java/index.html 
public class Main {

    public static void main(String[] args) {
	// Following code is jst for practice


        int size = 100;
        int [] array = new int[size];
        int [] array_2 = {1,2,3,4,5,6};

        /*
        * array.length -> calculating lenght of int [], stirng [] or char []
        * array.size() -> calculating the size of an object
        * string.length() -> length of the string
        * */


        String [] string_1 = new String[size];


        /* Creating List for Integer Object */
        List<Integer> list_1 = new ArrayList<Integer>(); // creating empty list
        List<Integer> list_2 = new ArrayList<> (); // this is also valid declaration
        List<Integer> list_3 = new ArrayList<Integer>(new Integer(100)); // Integer object 100 as a first element
        List<Integer> list_4 = new ArrayList<>(new Integer(120)); // Valid syntax with 120 as first element
        List<Integer> list_5 = new ArrayList<>(120); // Valid syntax with 120 as first element


        /*Creating List with String Objects */
        List<String> list_6 = new ArrayList<String>(Arrays.asList(new String ("hello"))); // Valid Declaration fo string
        List<String> list_7 = new ArrayList<>(Arrays.asList(new String("Hello"))); // Valid Declaration fo string
        List<String> list_8 = new ArrayList<>(Arrays.asList("Hello", "Hi")); // Adding twi elements in the list
        List<String> list_9 = new ArrayList<>(Arrays.asList(string_1)); // Valid Declaration for string



    }
}


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }


    Stack<Integer> stack = new Stack<Integer>();
    Queue<Integer> queue = new LinkedList<Integer>();


/*
    Sets
    HashSet, TreeSet and LinkedHashSet. Does not contains Duplicates

    HashSet         - stores added values in random order without duplicates
    TreeSet         - stores the added values in naturally ordered way w/o duplicates
    LinkedHashSet   - stores the added values in the order of insertion w/o duplicates
*/

/*
    Implementation of HashSet
*/

    String input = Integer.toString(20);

    Set<Character> hashSet = new HashSet<Character>();
    // hashSet.add(input.charAt(i));

    // using Iterator
    Iterator <Character> it = hashSet.iterator();
    //while(it.hasNext())
    {
        System.out.println(it.next() + " ");
    }


    /*Maps
    *
    *map is an interface in Java while HashMap, TreeMap and LinkedHashMaps are classes
    *
    * HashMap = stores keys and values in an unordered way and contains only unique keys
    *
    * TreeMap = stores key and values in a naturally ordered way and contains only unique keys
    *
    * LinkedHashMap = stores keys and values in the order of keys insertions and contains only unique keys
    *
    *
    * */

    Map<Character, Integer> hmw = new HashMap<Character, Integer >();
    Map<String, String> stringStringMap = new HashMap <>();

}

