/* QUESTION : Given an array arr of positive integers.
 The task is to swap every ith element of the array with (i+2)th element. */
class Solution {
    public void swapElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int j=i+2;
            if(j<n){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
            }
            
        }    
    }
}
/* GFG LINK : https://www.geeksforgeeks.org/problems/need-some-change/0
 
 */