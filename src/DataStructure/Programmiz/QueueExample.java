package DataStructure.Programmiz;
import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {

    public static void main (String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new CustomComparator());

        pq.add(1);

        System.out.println(pq);

    }

    static class CustomComparator implements Comparator<Integer> {


        @Override
        public int compare(Integer i1, Integer i2)
        {
            int value =  i1.compareTo(i2);
            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
            }


        }

    }


}
