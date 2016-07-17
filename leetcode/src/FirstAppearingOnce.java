import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/7/17.
 */
public class FirstAppearingOnce {
    //Insert one char from stringstream
    char[] cs = new char[256];
    List<Character> list = new ArrayList<>();

    public void insert(char ch) {
        cs[ch]++;
        if (cs[ch] == 1) {
            list.add(ch);
        } else {
            list.remove(new Character(ch));
        }
    }

    //return the first appearence once char in current stringstream
    public char firstAppearingOnce() {
        if (list.size() != 0) {
            return list.get(0);
        } else {
            return '#';
        }
    }
}
