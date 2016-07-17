/**
 * Created by majun on 16/7/17.
 */
public class Match {
    public boolean match(char[] pattern, char[] str) {
        if (str == null || pattern == null) {
            return false;
        }
        return matchPattern(str, 0, pattern, 0);
    }

    public boolean matchPattern(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex==str.length&&patternIndex!=pattern.length)
        {
            return false;
        }
        if (patternIndex == pattern.length && strIndex == str.length) {
            return true;
        }
        if (patternIndex==pattern.length)
        {
            if (strIndex!=str.length-1)
            {
                if (str[strIndex+1]=='*')
                {
                    return matchPattern(str,strIndex+2,pattern,patternIndex);
                }
            }
            return false;
        }else {
            if (strIndex != str.length - 1) {
                if (str[strIndex + 1] == '*') {
                    if (str[strIndex] == pattern[patternIndex] || str[strIndex] == '.') {
                        return matchPattern(str, strIndex, pattern, patternIndex + 1) || matchPattern(str, strIndex + 2, pattern, patternIndex + 1) || matchPattern(str, strIndex + 2, pattern, patternIndex);
                    } else {
                        return matchPattern(str, strIndex + 2, pattern, patternIndex);
                    }
                }
            }
        }
        if (str[strIndex] == '.' || str[strIndex] == pattern[patternIndex]) {
            return matchPattern(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }
}
