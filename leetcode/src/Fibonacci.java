/**
 * Created by majun on 2016/6/29.
 */
public class Fibonacci {
    //    public int fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//
//    }
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] ints = new int[n+1];
        ints[0] = 0;
        ints[1] = 1;
        for (int i = 2; i < n +1; i++) {
            ints[i] = ints[i - 1] + ints[i - 2];
        }
        return ints[n];
    }
}
