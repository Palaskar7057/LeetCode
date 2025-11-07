class Solution {
    public int maxArea(int[] height) {
    int res=0;
    int li=0;
    int ri=height.length-1;
    while(li<ri){
        int right=height[ri];
        int left=height[li];
        int area=Math.min(left,right)*(ri-li);
        res=Math.max(res,area);
        if(left<right){
            li++;
        } else{
            ri--;
        }
        
    }
    return res;
    }
} 