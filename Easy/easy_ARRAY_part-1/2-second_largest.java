/* QUESTION : Given an array of positive integers arr[], 
return the second largest element from the array. 
If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element. */

class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        // if  there is  no  second largst element
        // it has 1 element only
        if(n<2){
            return -1;
        }
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        
        }
        //return largest;
        // keep  in  mind function will end once reaches  the  return statement
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest=arr[i];
            }
            
        }
        return secondlargest==Integer.MIN_VALUE?-1:secondlargest;   
    }
}
/*✅ Code Explanation: 💡
The getSecondLargest method finds the second largest element in an array.
 If no second largest exists, it returns -1. 🏆🥈

🛠 Step-by-Step Breakdown: ⚡
Check Array Length: 📏
if (n < 2) {  
    return -1;  // No second largest if array has less than 2 elements  
}  
Edge Case: If the array has less than 2 elements, return -1. 🚫
Find the Largest Element: 🏆
int largest = arr[0];  
for (int i = 1; i < n; i++) {  
    if (arr[i] > largest) {  
        largest = arr[i];  
    }  
}  
✅ Logic:
Initialize largest with arr[0].
Traverse the array to find the maximum element. 🔄
Find the Second Largest Element: 🥈

int secondlargest = Integer.MIN_VALUE;  
for (int i = 0; i < n; i++) {  
    if (arr[i] > secondlargest && arr[i] != largest) {  
        secondlargest = arr[i];  
    }  
}  
✅ Logic:

Initialize secondlargest with Integer.MIN_VALUE.
Traverse the array again:
If an element is greater than secondlargest and not equal to largest, update secondlargest.
Return Result: 🎯
return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest;  
If secondlargest was not updated (i.e., no second largest exists), return -1.
Otherwise, return secondlargest.
📊 Example Run: 🚀
Example 1:
int[] arr = {5, 8, 12, 7, 9};  
System.out.println(getSecondLargest(arr));  // Output: 9  
Steps:

Largest = 12
Second Largest = 9
Example 2:
int[] arr = {4, 4, 4, 4};  
System.out.println(getSecondLargest(arr));  // Output: -1  
Reason:
All elements are identical, so no second largest exists. 🚫
⚡ Time Complexity: ⏱
Finding Largest: O(N)
Finding Second Largest: O(N)
✅ Total Time Complexity: O(N) 🚀
💾 Space Complexity: 🧠
Extra Space: O(1) — Only a few variables used.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Edge Case — Single Element: ⚠️

If array has only one element, returns -1.
All Elements Equal: 🚫

If all elements are the same, returns -1.
Negative Numbers: 🔢

Works with negative integers as well.
Optimized Approach: 💡

This method makes 2 passes over the array.
✅ Optimization Tip: 
You can reduce to a single pass by updating largest and secondlargest in one loop.
🎯 Final Verdict:
✅ Efficient O(N) solution
✅ Constant space usage
✅ Handles all edge cases
GFG LINK : https://www.geeksforgeeks.org/problems/second-largest3735/0 
 */
