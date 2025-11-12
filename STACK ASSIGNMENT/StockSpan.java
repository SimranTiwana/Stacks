public class StockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {
            span[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (price[j] <= price[i]) span[i]++;
                else break;
            }
        }

        for (int x : span) System.out.print(x + " ");
    }
}
