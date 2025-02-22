/* QUESTION : Given an array, arr of integers, 
your task is to return the smallest and 
second smallest element in the array.
 If the smallest and second smallest 
 do not exist, return -1. */
 

// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int n=arr.length;
        int firstsmallest=arr[0];
        int secondsmallest=Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            if(arr[i]<firstsmallest){
                 firstsmallest=arr[i];
                
            }
        }
        for(int i=0;i<n;i++){
            if(secondsmallest>arr[i]&& arr[i]!=firstsmallest){
                secondsmallest=arr[i];
            }
        }
        if(secondsmallest==Integer.MAX_VALUE){
            return new int[]{-1};
        }
        else{
            return new int[]{ firstsmallest ,secondsmallest };
        }
        
        
    }
}
/*✅ Code Explanation: 💡
The method minAnd2ndMin(int arr[]) finds the smallest and second smallest distinct elements in the array. If there is no second smallest (i.e., all elements are the same), it returns {-1}. ✅

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

Array arr[] of integers.
Initialization: 🛠


int firstsmallest = arr[0];  
int secondsmallest = Integer.MAX_VALUE;  
firstsmallest is initialized to the first element.
secondsmallest is set to Integer.MAX_VALUE to represent no valid second smallest found yet.
🔄 Logic:
Step 1: Find the Smallest Element: 🥇

for(int i = 1; i < n; i++) {  
    if(arr[i] < firstsmallest) {  
        firstsmallest = arr[i];  
    }  
}
Iterates through the array to find the smallest element.
Step 2: Find the Second Smallest Element: 🥈

for(int i = 0; i < n; i++) {  
    if(arr[i] != firstsmallest && arr[i] < secondsmallest) {  
        secondsmallest = arr[i];  
    }  
}
Looks for the smallest element that is greater than firstsmallest.
Step 3: Return Result:

if(secondsmallest == Integer.MAX_VALUE) {  
    return new int[]{-1};  
} else {  
    return new int[]{firstsmallest, secondsmallest};  
}
If no valid second smallest was found, returns {-1}.
Otherwise, returns {firstsmallest, secondsmallest}.
📊 Example Run: 🚀
Example 1:
Input:
arr = {3, 1, 4, 1, 5, 9}  
Process:

First Smallest → 1
Second Smallest → 3
Output:
[1, 3]
Example 2:
Input:
arr = {2, 2, 2, 2}  
Process:

First Smallest → 2
No distinct second smallest found.
Output:

[-1]
⚡ Time Complexity: ⏱
First Loop: O(n) — to find the smallest element.
Second Loop: O(n) — to find the second smallest.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Constant space used for variables.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Handles Duplicates: 🔢

Correctly skips over duplicate smallest elements.
Edge Cases: ⚠️

All elements identical: Returns {-1}.
Array with only one element: Returns {-1}.
Already sorted array: Still works in O(n) time.
Optimizations: 💡

This could be optimized to a single pass solution by tracking both first and second smallest in one loop.
🎯 Final Verdict:
✅ Efficient O(n) approach
✅ Handles duplicates and edge cases
✅ Simple, clear logic
GFG LINKS :https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/0  */
