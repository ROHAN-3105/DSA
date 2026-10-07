class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("+")){
                int f=st.pop();
                int sec=st.peek();
                st.push(f);
                st.push(f+sec);

            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;

        
    }
}