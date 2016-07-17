
/**
 * Created by ws03 on 2016/6/18.
 */
public class Main {
    public static void main(String[] args) {
        isNumeric isNumeric=new isNumeric();
        String s="1a3.14";
        char[] chars=s.toCharArray();
        System.out.print(isNumeric.isNumeric(chars));
    }
}
