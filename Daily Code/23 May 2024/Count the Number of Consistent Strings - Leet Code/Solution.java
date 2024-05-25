class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int result = 0;

        for(String s : words){
            int flag = s.length();
            for(int i=0;i<s.length();i++){
                if(allowed.contains(String.valueOf(s.charAt(i)))){
                    flag--;
                }
            }
            if(flag==0){
                result++;
            }
        }
     
        return result;
        
    }
}