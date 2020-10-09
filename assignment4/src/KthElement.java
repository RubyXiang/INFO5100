import java.util.PriorityQueue;

public class KthElement {
    public int findKthLargest(int[] nums, int k){
        int n = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums){
            pq.add(val);
            if (pq.size() > k)
                pq.poll();
        }
        n = pq.peek();
        System.out.println(n);
        return n;
    }
}
