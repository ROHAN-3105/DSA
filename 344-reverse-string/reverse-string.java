class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char[] stack= new char[n];
        int top=-1;

        for(int i=0;i<n;i++){
            top++;
            stack[top]=s[i];
        }

        for(int i=0;i<n;i++){
            s[i]=stack[top];
            top--;
        }
        
    }
}