// Last updated: 7/9/2026, 3:12:56 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int max =-1;
        int sum =0;
        for(int num:nums){
            int t = num;
            int ma=0;
            int min =9;
        while(t>0){
            int d=t%10;
            if(d>ma) ma= d;
            if(d<min) min= d;
            t/=10;
        }
        int range=ma-min;
        if(range>max){
            max=range;
        }
        
        
        }
    for(int num:nums){
    int t= num;
    int ma=0;
    int min =9;
    while(t>0){
        int d =t%10;
        if(d>ma) ma=d;
        if(d<min) min= d;
        t/=10;
    }
    int range= ma-min;
    if(range==max){
        sum+=num;
    }
    
    }
return sum;
        
    }
}