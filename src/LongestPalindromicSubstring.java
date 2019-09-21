public class LongestPalindromicSubstring {  //最长回文子串问题
    /**
     * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
     * Input: "babad"
     * Output: "bab"
     * Note: "aba" is also a valid answer.
     * Input: "cbbd"
     * Output: "bb"
     */
    public String longestPalindrome(String s) {
        int len = s.length();
        int max = 0;
        String maxsub = null;
        if(len == 0 || (len == 2 && s.substring(0,1) == s.substring(1,2))) {
            System.out.println("ssss");
            return s;
           }
        if(len == 1 || (len == 2 && s.substring(0,1) != s.substring(1,2))) return s.substring(0,1);
        for(int i = 0; i<len; i++)
            for(int j = i+1; j<len; j++){
                String sub = s.substring(i,j+1);
                if(judge(sub)){
                    if(j-i > max){
                        max = j-i;
                        maxsub = sub;

                    }
                }
            }

        return maxsub;
    }
    public boolean judge(String s){
        int len = s.length();
        char []str = s.toCharArray();
        int i = 0;
        while(i <= len-1-i) {
            if (str[i] != str[len - 1 - i])return false;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        String k = l.longestPalindrome("bb");
        System.out.println(k);
    }
}
