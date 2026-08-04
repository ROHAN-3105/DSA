class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }

        while(low<high){
            int mid=(low+high)/2;
            if(minspeed(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
            return low;
    }

        private boolean minspeed(int[] piles, int h,int speed){
            int hrs=0;
            for(int num:piles){
                hrs+=(int)Math.ceil((double)num/speed);
            }
            return hrs<=h;

        
        
    }
}