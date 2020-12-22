package DataStructure.HashMap.HashMapMapEntry;

public class MapEntry<K, V> {

    private boolean removed;
    private K key;
    private V value;

    public boolean isRemoved() {
        return removed;
    }

    public void setRemoved(boolean removed) {
        this.removed = removed;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public boolean equals(Object o)
    {
        if (!(o instanceof MapEntry)){
            return false;
        }
        else{
            @SuppressWarnings("unchecked")
            MapEntry<K,V> temp = (MapEntry<K,V>)o;
            return temp.getKey().equals(this.key) && temp.getValue().equals(this.value);
        }
    }

    public String toString()
    {
        return key.toString() + " " + value.toString();
    }
}
