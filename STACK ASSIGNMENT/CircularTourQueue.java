import java.util.LinkedList;
import java.util.Queue;

class Pump {
    int petrol, distance;
    Pump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

public class CircularTourQueue {
    public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};
        int n = petrol.length;

        Queue<Integer> q = new LinkedList<>();
        int start = 0, end = 0, currPetrol = 0;

        while (q.size() != n) {
            currPetrol += petrol[end] - distance[end];
            q.offer(end);

            while (currPetrol < 0) {
                currPetrol -= petrol[q.peek()] - distance[q.peek()];
                start = q.poll() + 1;
            }

            end = (end + 1) % n;
        }

        System.out.println("Start at pump: " + start);
    }
}
