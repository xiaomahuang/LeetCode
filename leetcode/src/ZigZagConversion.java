/**
 * Created by majun on 16/8/12.
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1) {
            return s;
        }
        StringBuilder[] strings = new StringBuilder[numRows];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            int j = i % (2 * numRows - 2);
            if (j < numRows) {
                strings[j].append(s.charAt(i));
            } else {
                strings[2 * (numRows-1) - j].append(s.charAt(i));
            }
        }
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            string.append(strings[i].toString());
        }
        return string.toString();
    }

    public String convert1(String s, int numRows) {
        if(numRows<=1)return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<sb.length;i++){
            sb[i]=new StringBuilder("");   //init every sb element **important step!!!!
        }
        int incre=1;
        int index=0;
        for(int i=0;i<s.length();i++){
            sb[index].append(s.charAt(i));
            if(index==0){incre=1;}
            if(index==numRows-1){incre=-1;}
            index+=incre;
        }
        String re="";
        for(int i=0;i<sb.length;i++){
            re+=sb[i];
        }
        return re.toString();
    }
}
