import java.util.ArrayList;
import java.util.List;

public class ProblemThree {
    public static void main(String[] args) {
        System.out.println("Java is running!");
        String s = "aba";
        Solution solution = new ProblemThree().new Solution();
        String s1 = solution.longestPalindrome(s);
        System.out.println(s1);
    }

    class Solution {
    String s = "abcb";
    public String longestPalindrome(String s) {

        String s1 = "";
        int left = 0;
        int right= s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                s1=s1+s.charAt(left);
            }
            left++;
            right--;
        }
        
        return s1;
        
    }
    
}
}

