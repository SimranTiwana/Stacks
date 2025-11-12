import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowDeque {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();
            dq.offerLast(i);
        }

        for (int i = k; i < arr.length; i++) {
            System.out.print(arr[dq.peek()] + " ");

            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();

            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i])
                dq.pollLast();

            dq.offerLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }
}
