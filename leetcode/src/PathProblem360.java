import java.util.Scanner;

/**
 * Created by majun on 16/9/11.
 */
public class PathProblem360 {
    public void pathProblem() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            boolean isNToM = helper(s, s1, s2);
            StringBuilder stringBuilder = new StringBuilder(s);
            s = stringBuilder.reverse().toString();
            boolean isMtoN = helper(s, s1, s2);
            if (isMtoN && isNToM) {
                System.out.println("both");
            } else if (isMtoN) {
                System.out.println("backward");
            } else if (isNToM) {
                System.out.println("forward");
            } else {
                System.out.println("invalid");
            }
        }
    }

    public boolean helper(String s, String s1, String s2) {
        if (s.contains(s1)) {
            String tempString = s.substring(s.indexOf(s1) + s1.length());
            if (tempString.contains(s2)) {
                return true;
            }
        }
        return false;
    }
}
