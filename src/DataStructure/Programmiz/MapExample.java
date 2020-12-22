package DataStructure.Programmiz;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args)
    {


    /*    The Map interface maintains 3 different sets:

        the set of keys
        the set of values
        the set of key/value associations (mapping).
*/


        Map<Integer, String> languages = new HashMap<Integer, String>();
        /* Common methods
        * put(k, v)
        * get(k)
        * getOrDefault(k, defaultValue)
        * containsKey(k)
        * containsValue(v)
        * size()
        * isEmpty()

        * replace(k,v) // raplace value of k with new value v
        * remove(k)
        * keySet() -> returns a set of all the keys in a map
        * value() -> returns a set of all the values in a map
        * entrySet() -> returns a set of all key/ values mapping present in a map
        * */

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("HashMap: " + languages);

        for(Integer key: languages.keySet())
        {
            System.out.println(key);
        }

        for(String values: languages.values())
        {
            System.out.println(values);
        }

        for (Map.Entry<Integer, String> set: languages.entrySet())
        {
            System.out.println(set);
            // getKey () ;
            // getValue() ;
        }
    }
}
