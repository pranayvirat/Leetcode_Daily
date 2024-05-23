class Solution {
    public int longestPalindrome(String s) {
        int[] character_counts = new int[128];

        for(char c : s.toCharArray()){
            character_counts[c]++;
        }

        int res = 0;

        for(int a: character_counts){
            res += a/2*2;
            if(res%2 == 0 && a%2 == 1){
                res += 1;
            }
        }
        return res;
        
    }
}