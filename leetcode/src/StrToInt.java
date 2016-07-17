/**
 * Created by majun on 16/7/16.
 */
public class StrToInt {
    public int StrToInt(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        boolean flag = false;
        int temp = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 && chars[i] == '-' && chars.length > 1) {
                flag = true;
                continue;
            }
            if (i == 0 && chars[i] == '0' && chars.length > 1) {
                return 0;
            }
            if ('9' < chars[i] || chars[i] < '0') {
                return 0;
            }
            int num = chars[i] - '0';
            if (flag) {
                temp -= temp;
            } else {
                temp += num * Math.pow(10, chars.length - i - 1);

            }
        }
        return temp;
    }
}
