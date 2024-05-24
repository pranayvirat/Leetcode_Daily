class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] char_index = new int[128];
        int[] char_index2 = new int[128];

        for(int i=0;i<s.length();i++){
            char_index[s.charAt(i)] = i;

            char_index2[t.charAt(i)] = i;

        }
        int res = 0;

        for(int i=0;i< char_index.length;i++){
            res += Math.abs(char_index[i]-char_index2[i]);
        }
        return res;
    }
}