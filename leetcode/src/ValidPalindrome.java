/**
 * Created by majun on 16/8/12.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()<=1)
        {
            return true;
        }
        int[] nums=new int[s.length()];
        int count=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            {
                count++;
                nums[count]=s.charAt(i)-'a';
            }else if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                count++;
                nums[count]=s.charAt(i)-'A';
            }
        }
        int start=0;
        int end=count;
        while(start<end)
        {
            if(nums[start]!=nums[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
