class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        List <String> ans = new ArrayList<>();

        int i=0;
        while(i<n){
            while(i<n && s.charAt(i)== ' '){
                i++;
            }
            if(i>=n){
                break;
            }
            int j=i;
            while(j<n && s.charAt(j)!=' '){
                j++;
                
            }
            ans.add(s.substring(i,j));
            i=j;
        }
        StringBuilder sb= new StringBuilder();
        for(int j=ans.size()-1; j>=0; j--){
            sb.append(ans.get(j));
            if(j!=0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}