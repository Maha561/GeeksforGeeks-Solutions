/* Given an array arr[],
 check whether it is sorted in non-decreasing order. 
 Return true if it is sorted otherwise false. */

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        int n=arr.length;
        
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
}
/*✅ Code Explanation: 💡
The arraySortedOrNot method checks whether the given array is sorted in non-decreasing order
 (each element is less than or equal to the next). 📈⚡

🛠 Step-by-Step Breakdown: 🧩
Initialize Variables: 🔢

int n = arr.length;
n stores the length of the array.
Iterate and Compare Adjacent Elements: 🔍

for(int i = 0; i < n - 1; i++) {
    if(arr[i] > arr[i + 1]) {
        return false;
    }
}
✅ Logic:

Loop from index 0 to n-2.
For every arr[i], check if it is greater than arr[i + 1].
If any pair violates the non-decreasing order, return false immediately. 🚫
If No Violations Found: 🎯

return true;
If the loop completes without finding a violation, 
the array is sorted, and true is returned. ✅
📊 Example Runs: 🚀
Example 1:
int[] arr = {1, 2, 3, 4, 5};  
System.out.println(arraySortedOrNot(arr));  // Output: true  
The array is in ascending order. ✅
Example 2:
int[] arr = {5, 3, 7, 9};  
System.out.println(arraySortedOrNot(arr));  // Output: false  
At index 0, 5 > 3 violates the non-decreasing order. 🚫
Example 3:
int[] arr = {1, 1, 2, 3, 3};  
System.out.println(arraySortedOrNot(arr));  // Output: true  
Duplicate elements are allowed as long as the sequence doesn’t decrease. 📈
⚡ Time Complexity: ⏱
The loop runs O(N - 1) times, where N is the length of the array.
✅ Total Time Complexity: O(N)
💾 Space Complexity: 🧠
Uses constant space.
✅ Total Space Complexity: O(1)
⚠️ Key Considerations:
Empty Array or Single Element: 📭

If n <= 1, the array is trivially sorted. ✅
Strictly Increasing vs. Non-Decreasing: ⚖️

This method checks for non-decreasing order (duplicates allowed).
Early Exit Optimization: 🚀

Returns false immediately upon finding an unsorted pair, improving efficiency.
🏆 Final Verdict:
✅ Optimal O(N) solution
✅ Constant space
✅ Efficient early exit
✅ Handles duplicates and edge cases
GFG LINK : https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/0
 */