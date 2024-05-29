class Solution {

    public int reverse(int num){
            int reverse = 0;
            while(num>0){
                reverse = (reverse * 10) + num%10;
                num = num/10;
            }
            
        return reverse;
    }
    public boolean isPalindrome(int x) {

        if(x<0 || (x!=0 && x%10 == 0)) return false;
        else if(x==0) return true;

        else{
        return x==reverse(x);
    }
    }
}