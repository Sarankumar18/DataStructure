import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int i = 0;
        
        for (; i < k; i++) {
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();

            dq.offerLast(i);
        }

        for (; i < nums.length; i++) {
            res.add(nums[dq.peekFirst()]);

            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.removeFirst();

            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.removeLast();

            dq.offerLast(i);
        }
        res.add(nums[dq.peekFirst()]);

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
