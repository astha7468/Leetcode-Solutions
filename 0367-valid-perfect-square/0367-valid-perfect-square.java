class Solution {
    public boolean isPerfectSquare(int num) {
        boolean isperfectsquare=true;
        int l =0; 
        int r = num;
        while(l<=r){
            long mid=l+(r-l)/2;
            long square=mid*mid;
              if(square==num) {
                return true;
              }
              else if(square>num){
                r=(int)mid-1; 
              }  
              else{
                 l=(int)mid+1;
                 }
                  
        }
        return false;
    }
       
}