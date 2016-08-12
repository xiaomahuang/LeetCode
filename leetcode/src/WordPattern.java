import java.util.ArrayList;
import java.util.List;

/**
 * Created by majun on 16/8/10.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        if((pattern==null&&str==null)||(pattern.length()==0&&str.length()==0))
        {
            return true;
        }
        if(pattern==null||str==null||pattern.length()==0||str.length()==0)
        {
            return false;
        }
        String[] strings=str.split(" ");
        char[] cs=pattern.toCharArray();
        if(strings.length!=cs.length){
            return false;
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<cs.length;i++)
        {
            if(cs[i]==' ')
            {
                continue;
            }
            if(list.contains(strings[i])){
                return false;
            }
            for(int j=i+1;j<cs.length;j++)
            {
                if(cs[i]==cs[j])
                {
                    if(!strings[i].equals(strings[j]))
                    {
                        return false;
                    }else
                    {
                        cs[j]=' ';
                    }
                }
            }
            list.add(strings[i]);
        }
        return true;
    }
}
