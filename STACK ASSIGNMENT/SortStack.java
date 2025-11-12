import java.util.Stack;

public class SortStack {
    static Stack<Integer> s = new Stack<>();

    static void sort() {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort();
            insert(x);
        }
    }

    static void insert(int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }
        int top = s.pop();
        insert(x);
        s.push(top);
    }

    public static void main(String[] args) {
        s.push(30);
        s.push(10);
        s.push(50);
        s.push(20);
        s.push(40);

        sort();

        while (!s.isEmpty()) System.out.println(s.pop());
    }
}
