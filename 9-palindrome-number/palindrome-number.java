class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int revnum=0;

        while (x>0){
            int lastdigit =x%10;
            revnum= (revnum*10)+ lastdigit;
            x=x/10;
        }
        return revnum == original;
        
    }
}