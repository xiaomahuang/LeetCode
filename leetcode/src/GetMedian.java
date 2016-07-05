import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ws03 on 2016/6/19.
 */
public class GetMedian {
    int count = 0;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void insert(Integer num) {
        count++;
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int i = maxHeap.poll();
            minHeap.offer(i);
        } else {
            minHeap.offer(num);
            int i = minHeap.poll();
            maxHeap.offer(i);
        }

    }

    public Double getMedian() {
        if (count % 2 == 0) {
            return (Double.valueOf(maxHeap.peek()) + Double.valueOf(minHeap.peek())) / 2;
        } else {
            return Double.valueOf(maxHeap.peek());
        }
    }

}
