package DataStructure.Programmiz;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String[]  args)
    {

        /*
        * first parameter is capacity and second is Loadfactor
        *
        * By default,
            the capacity of the hash set will be 16
            the load factor will be 0.75
        */
        HashSet<String> hs = new HashSet<>();

        hs.add("first");

        Iterator<String> it = hs.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // hs.remove();
        /* Some Useful methods
        * - add(Object o)
        * - contains(Object o)
        * - isEmpty()
        * - iterator()
        * - remove(Object o)
        * - size()
        * */


        /*
        * Union of sets -> addAll()
        * */

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        evenNumbers.addAll(numbers);

        /*
         * Intersection of sets -> retainAll() pr retain()
         * */
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenN = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenN);

        evenN.retainAll(primeNumbers);


        /*
         * Difference of sets
         * */
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        primeNumbers.removeAll(oddNumbers);


        /*
        * Subset */

        boolean answer  = primeNumbers.containsAll(numbers);

    }
}
