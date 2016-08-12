/**
 * Created by majun on 16/8/5.
 */
public class GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid=1;
        while (start < end) {
            mid = start+(end - start)/2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public int guessNumber1(int n) {
        int start=1;
        int end=n;
        int mid=1;
        while(start<end)
        {
            mid = start+(end - start)/2;
            if (guess(mid) == 0) {
                return mid;
            }else if(guess(mid) > 0) {
                start=mid+1;
            }else {
                end=mid;
            }
        }

        return start;
    }

    public int guess(int num) {
        if (num == 6) {
            return 0;
        } else if (num > 6) {
            return 1;
        } else {
            return -1;
        }
    }
}
