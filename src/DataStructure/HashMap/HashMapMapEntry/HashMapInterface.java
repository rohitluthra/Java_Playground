package DataStructure.HashMap.HashMapMapEntry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
* Class represents Map entry for a hashmap
* */
public interface HashMapInterface<K,V> {

    int SIZE = 10;
    double LOADINGFACTOR = 0.75;

    V add(K key, V value);

    V remove(K key);

    V get(K key);

    boolean contains(K key);

    void clear();

    int size();

    Set<K> keySet();

    List<V> value();

}
