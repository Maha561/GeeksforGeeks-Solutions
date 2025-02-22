/* Given an array, arr of n integers, 
and an integer element x,
 find whether element x is present in the array.
 Return the index of the first occurrence of x 
 in the array, or -1 if it doesn't exist. */

 class Solution {

    static int search(int arr[], int x) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
                
            }
            
        }
        return -1;
        

        // Your code here
    }
}
/*✅ Code Explanation: 💡
The method search(int arr[], int x) performs a linear search 🔍 to find the first occurrence of element x in the array arr[].

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

arr[] — an integer array to search within.
x — the target element to find.
Initialization: 🏁

n = arr.length — stores the length of the array. 📏
Linear Search: 🔄

Iterate over the array from i = 0 to n - 1.
Condition Check:
If arr[i] == x, return the index i immediately. ✅
If the loop completes without finding x, return -1 to indicate that the element isn't present. ❌
📊 Example Run: 🚀
Input:

arr = {4, 2, 7, 1, 9}, x = 7  
Process:
Start iterating:
i = 0 → arr[0] = 4 (not 7)
i = 1 → arr[1] = 2 (not 7)
i = 2 → arr[2] = 7 (match found) ✅
Output:
2
⚡ Time Complexity: ⏱
In the worst case, the loop checks all n elements.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Only a few variables are used (n, i), independent of input size.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Early Termination: 💡

The function returns as soon as the element is found, making it efficient for cases where x is near the start. 🚀
Edge Cases: ⚠️

Element not found: Returns -1.
Empty array: Directly returns -1.
Multiple occurrences: Returns the first occurrence.
Optional Enhancements: 💡

For sorted arrays, a binary search (O(log n)) could be more efficient.
🎯 Final Verdict:
✅ Simple and efficient linear search (O(n))
✅ Space-optimized (O(1))
✅ Handles edge cases properly
 GFG LINK :https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/0 */ 
 