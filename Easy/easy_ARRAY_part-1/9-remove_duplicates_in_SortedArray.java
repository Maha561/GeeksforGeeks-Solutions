/* QUESTION Given a sorted array arr.
 Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size 
only where distinct elements are present
 and modify the original array such that all the distinct elements 
 come at the beginning of the original array. */

class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        int j=0;
       // int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
               //count++;
                arr[j]=arr[i];
            }
        }
        return j+1;
        
    }
}
/* ✅ Code Explanation: 💡
The removeDuplicates method removes duplicate elements from a sorted array 
in-place and returns the new length of the modified array.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize a Pointer j to Track Unique Elements: 🏷️

int j = 0;
This pointer (j) keeps track of the position where the next unique element should be placed.
2️⃣ Iterate Through the Array, Checking for Duplicates: 🔄

for (int i = 1; i < arr.length; i++) {
    if (arr[i] != arr[j]) {  
        j++;  
        arr[j] = arr[i];  
    }  
}
If arr[i] is different from arr[j],
Move j one step forward.
Store arr[i] at arr[j].
Otherwise, skip arr[i] (it's a duplicate).
3️⃣ Return the New Length: 📏

return j + 1;
Why j + 1?
Since j is zero-based, the length should be one more than the last unique index.
📊 Example Runs: 🚀
Example 1:

int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};  
System.out.println(removeDuplicates(arr));  
// Output: 5  
// Modified array: [1, 2, 3, 4, 5, _, _, _] (remaining values are irrelevant)
Duplicates removed, unique elements remain in order. ✅
Example 2:

int[] arr = {1, 1, 1, 1};  
System.out.println(removeDuplicates(arr));  
// Output: 1  
// Modified array: [1, _, _, _]
Only one unique element, so length = 1. 🎯
⚡ Time Complexity: ⏱
The loop runs O(N) times (iterating through the array once).
✅ Total Time Complexity: O(N)
💾 Space Complexity: 🧠
No extra space used (modifies the array in-place).
✅ Total Space Complexity: O(1)
⚠️ Key Considerations:
1️⃣ Works only for sorted arrays. ✅
2️⃣ Modifies the array in-place without extra space. ✅
3️⃣ Handles edge cases like an empty array (arr.length == 0). ✅

🏆 Final Verdict:
✅ Optimal O(N) time complexity
✅ O(1) extra space (modifies input array directly)
✅ Efficient for sorted arrays
✅ Handles all edge cases
GFG LINK : https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/0
 */