/**
 * Created by majun on 2016/6/27.
 */
public class ReplaceSpace {
    //所有连续空格替换成一个字符
//    public String replaceSpace(StringBuffer str) {
//        if (str == null || str.length() == 0) {
//            return "";
//        }
//        String replace = str.toString().replaceAll("\\s+", "%20");
//        return replace;
//    }

    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String replace = str.toString().replace(" ", "%20");
        return replace;
    }
}
