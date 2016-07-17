import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by majun on 16/7/17.
 */
public class isNumeric {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != '-' && str[i] != '+' && str[i] != '.' && (str[i] > '9' || str[i] < '0') && str[i] != 'e' && str[i] != 'E') {
                return false;
            } else {
                if (str[i] == 'e' || str[i] == 'E') {
                    if (i == 0 || index != -1) {
                        return false;
                    }
                    index = i;
                }
            }
        }
        if (index == -1) {
            return isBeforeNumber(str, 0, str.length - 1);
        } else {
            return isBeforeNumber(str, 0, index - 1) && isAfterNumber(str, index + 1, str.length - 1);
        }

    }

    public boolean isAfterNumber(char[] str, int start, int end) {
        int length = end - start + 1;
        if (start > end) {
            return false;
        }
        for (int i=start;i<=end;i++)
        {
            if (str[i]=='.')
            {
                return false;
            }
            if (i == start) {
                if (str[i] == '+' || str[i] == '-') {
                    if (length == 1) {
                        return false;
                    } else {
                        if (str[i + 1] == '0') {
                            return isBeforeNumber(str, start + 1, end);
                        }
                        continue;
                    }
                }
            } else {
                if (str[i] == '+' || str[i] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBeforeNumber(char[] str, int start, int end) {
        int flag = -1;
        int length = end - start + 1;
        if (start > end) {
            return false;
        }
        for (int i = start; i <= end; i++) {
            if (i == 0) {
                if (str[i] == '+' || str[i] == '-') {
                    if (length == 1) {
                        return false;
                    } else {
                        if (str[i + 1] == '0') {
                            return isBeforeNumber(str, start + 1, end);
                        }
                        continue;
                    }
                }
                if (str[i] == '.') {
                    flag = 1;
                    if (length == 1) {
                        return false;
                    } else {
                        continue;
                    }
                }
                if (str[i] == '0' && length > 1 && str[i + 1] != '.') {
                    return false;
                }
            } else {
                if (str[i] == '+' || str[i] == '-') {
                    return false;
                }
                if (str[i] == '.') {
                    if (flag!=-1)
                    {
                        return false;
                    }else {
                        flag=1;
                    }
                }
            }
        }
        return true;
    }
}
