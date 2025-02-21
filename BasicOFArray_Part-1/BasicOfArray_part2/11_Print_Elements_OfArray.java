/* Question : Given an array arr[],
 print all its elements space-separated.
Note: You don't need to move to the next line 
after printing all elements of the array (space-separated) */


// User function Template for Java

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length){
                System.out.print(" ");
                
            }
            
            
            //System.out.p
        }
        
        //   
    }
}
/* ✅ Code Explanation: 💡
The method printArray(int arr[]) prints all elements of the given array separated by spaces. 🖨️

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An integer array arr[].
Iterate Over the Array: 🔄

Loop through each index i from 0 to arr.length - 1.
Print the current element arr[i].
Spacing Between Elements: 📏

If i < arr.length, print a space (" ").
⚠️ Issue: The condition should be i < arr.length - 1, otherwise an extra space will be printed at the end.
End of Function: ✅

No newline is explicitly added, assuming the function is called in an environment where output is managed.
📊 Example Run: 🚀
Input:
java
Copy
Edit
arr = {1, 2, 3, 4, 5}
Output (Expected):
Copy
Edit
1 2 3 4 5
⚡ Time Complexity: ⏱
The loop iterates through all n elements.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses only the given array and no additional space.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:Fix the Extra Space Issue:

The condition if (i < arr.length) should be changed to if (i < arr.length - 1).
Edge Cases: ⚠️

Empty Array: No output should be printed.
Single Element: Should print the element without an extra space.
🎯 Final Verdict:
✅ Efficient (O(n))
✅ Space-optimized (O(1))
✅ Handles edge cases properly
GFG LINKS : https://www.geeksforgeeks.org/problems/print-elements-of-array4910/0 */  
