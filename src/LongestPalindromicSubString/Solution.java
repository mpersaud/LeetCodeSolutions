package LongestPalindromicSubString;

class Solution {
    public static String longestPalindrome(String s) {
        int i = 0;
        int j = 1;
        while (j -1< s.length()&& i<s.length()) {
            while (j < s.length()-1 && s.charAt(i) != s.charAt(j)) {
                j++;

            }
            System.out.println("i:"+i);
            System.out.println("j:"+j);
            if (helperPalindrome(s,i,j)){
                return s.substring(i, j+1);
            }
            i++;
            j = i + 1;
        }

        return "";
    }
    static boolean helperPalindrome(String s,int i, int j) {
        System.out.println("S:"+s.substring(i,j));

        while(i!=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
       //test cases
       //System.out.println(longestPalindrome("babad"));
       //System.out.println(longestPalindrome("cbbd"));
       //System.out.println(longestPalindrome(""));
       //almost_palindromes("abcdaa");
       //ascii_deletion_distance("thought","sloughs");
       //System.out.println(longestPalindrome("cabbad"));
//       System.out.println(bracket_match("())"));
//       System.out.println(bracket_match("(())"));
//

    }
}
