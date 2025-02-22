/* Question : Given an array arr[],
 print all its elements space-separated.
Note: You don't need to move to the next 
line after printing all elements of the array (space-separated)*/


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
⚠️ Issue: The condition should be i < arr.length - 1 to avoid printing an extra space after the last element.
End of Function: ✅

The function doesn’t print a newline at the end. Depending on the use case, adding System.out.println(); after the loop could be beneficial.
📊 Example Run: 🚀
Input:

arr = {1, 2, 3, 4, 5}
Current Output:

1 2 3 4 5  
(Note: An extra space appears at the end.)

Expected Output:

1 2 3 4 5
⚡ Time Complexity: ⏱
The loop runs through n elements once.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
No extra space is used apart from the given array.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Fix the Extra Space Issue:

Update the condition to if (i < arr.length - 1) to prevent an extra trailing space.
Edge Cases: ⚠️

Empty Array: No output should be printed.
Single Element Array: Should print the element without an extra space.
Optional Enhancement: 💡

Add a newline at the end for better output formatting:

System.out.println();
🎯 Final Verdict:
✅ Efficient (O(n))
✅ Space-optimized (O(1))
✅ Minor fix needed for the extra space
GFG LINK  :https://www.geeksforgeeks.org/problems/print-elements-of-array4910/0 */ 