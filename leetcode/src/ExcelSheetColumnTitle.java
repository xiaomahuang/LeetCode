/**
 * Created by majun on 16/8/14.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        while (n != 0) {
            int temp = n % 26;
            if (temp != 0) {
                builder.insert(0, (char) ('A' + temp - 1));
                n /= 26;
            } else {
                builder.insert(0, 'Z');
                n = (n / 26 - 1);
            }
        }
        return builder.toString();
    }
}
