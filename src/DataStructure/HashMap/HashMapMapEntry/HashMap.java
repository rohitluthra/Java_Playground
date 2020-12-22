//package DataStructure.HashMap.HashMapMapEntry;
//
//import java.util.List;
//import java.util.Set;
///**
// * A class representing a hash map ( linear probing collision ).
// *
// * @param <K>
// *            type of key of entries.
// * @param <V>
// *            type of value of entries.
// */
//public class HashMap<K,V> implements HashMapInterface<K,V> {
//    private MapEntry<K,V>[] table;
//    private int size;
//
//    public HashMap()
//    {
//        this.size = 0;
//    }
//    private double getNextLoadFactor() {
//        return (double) (size + 1) / (double) this.table.length;
//    }
//
//    @Override
//    public V add(K key, V value) {
//
//        if (key == null && value == null)
//        {
//            return null;
//        }
//        if (this.getNextLoadFactor() > LOADINGFACTOR)
//        {
//
//        }
//
//        int index = this.AddIndex(K key);
//
//    }
//
//    public int AddIndex(K Key)
//    {
//
//    }
//    @Override
//    public V remove(K key) {
//        return null;
//    }
//
//    @Override
//    public V get(K key) {
//        return null;
//    }
//
//    @Override
//    public boolean contains(K key) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public Set<K> keySet() {
//        return null;
//    }
//
//    @Override
//    public List<V> value() {
//        return null;
//    }
//}
