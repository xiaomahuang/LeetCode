import java.util.Iterator;

/**
 * Created by majun on 16/8/11.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s==null)
        {
            return 0;
        }
        s=s.trim();
        if(s.length()==0)
        {
            return 0;
        }
        String[] strings=s.split("\\s+");
        return strings[strings.length-1].length();
    }
}
