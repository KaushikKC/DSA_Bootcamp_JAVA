package com.questions;

public class BoundedArray {
    public static void main(String[] args) {

    }

    public int maxValue(int n, int index, int maxSum) {
        long right=n-index-1,left=index;
        long high=maxSum,low=1;
        int resultAns=1;

        long mid,leftsum,rightsum,totalSum,midIndex;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            totalSum=mid;
            leftsum=rightsum=0;
            midIndex=mid-1;
            if(right<=midIndex)
                rightsum=midIndex*(midIndex+1)/2 - (midIndex-right)*(midIndex-right+1)/2;
            else
                rightsum=midIndex*(midIndex+1)/2 + (right-midIndex);
            if(left<=midIndex)
                leftsum=midIndex*(midIndex+1)/2 - (midIndex-left)*(midIndex-left+1)/2;
            else
                leftsum=midIndex*(midIndex+1)/2 + (left-midIndex);

            totalSum+=leftsum+rightsum;

            if(totalSum<=maxSum)
            {
                resultAns=(int)mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return resultAns;
    }
}
