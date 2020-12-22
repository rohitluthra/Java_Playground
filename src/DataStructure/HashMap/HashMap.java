package DataStructure.HashMap;

import java.util.Iterator;
import java.util.LinkedList;

public class HashMap {

    public int size;
    public int initializedSize;
    public int itemsInhashMap;
    public LinkedList<Object[]>[] map;

    public HashMap(int size)
    {
        this.initializedSize = size;
        this.size = size * 4/3; // Load Factor is 0.75
        this.map = new LinkedList[this.size];
    }

    public float load()
    {
        return (float) this.itemsInhashMap / size;
    }

    public boolean set(String key, Object value)
    {
        int pos = Math.abs(key.hashCode() % size);
        if(map[pos] == null)
        {
            if(this.itemsInhashMap >= this.initializedSize)
                return false; // no more space left
            LinkedList newLL = new LinkedList();
            Object[] array = {key, value};
            newLL.add(array);
            this.map[pos] = newLL;
        }
        else{

            LinkedList newLL = this.map[pos];
            Iterator it =  newLL.iterator();
            Object[] array = {key, value};

            while(it.hasNext())
            {
                Object[] temp = (Object[])it.next();
                if (temp[0] == key) {
                    it.remove();
                    this.itemsInhashMap--;
                    break;
                }
                if(this.itemsInhashMap >= this.initializedSize)
                    return false; // no more space left
                newLL.add(array);
            }

        }
        this.itemsInhashMap++;
        return true;
    }

    public Object get(String key)
    {
        int pos = Math.abs(key.hashCode() % size);
        if(map[pos] != null)
        {

            LinkedList item = this.map[pos];
            Iterator it = item.iterator();
            while(it.hasNext()) {
                Object[] temp = (Object[]) it.next();
                if (temp[0] == key)
                    return temp[1];
            }
        }
        return null;
    }

    public Object delete(String key)
    {
        int pos = Math.abs(key.hashCode() % size);
        if (this.map[pos] != null)
        {
            LinkedList item = this.map[pos];
            Iterator it = item.iterator();
            while(it.hasNext()) {
                Object[] temp = (Object[]) it.next();
                if (temp[0] == key) {
                    Object returnValue = temp[1];
                    it.remove();
                    this.itemsInhashMap--;
                    return returnValue;
                }
            }
        }
        return null;
    }
}
