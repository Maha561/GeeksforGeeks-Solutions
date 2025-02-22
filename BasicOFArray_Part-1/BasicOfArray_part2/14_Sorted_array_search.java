/*Given an array, arr[] sorted in ascending order and an integer k. 
Return true if k is present in the array, otherwise, false. */


class Solution {
    static boolean searchInSorted(int arr[], int k) {
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return true;
                
            }
            
        }
        return false;
        // Your code here
    }
}
/*✅ Code Explanation: 💡
The method searchInSorted(int arr[], int k) performs a linear search 🔍 
to check whether the element k exists in the array arr[]. 
It returns true if found and false otherwise.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

arr[] — an integer array (assumed to be sorted). 📊
k — the target element to search for. 🎯
Initialization: 🏁

n = arr.length — stores the length of the array. 📏
Linear Search: 🔄

Iterate over the array from i = 0 to n - 1.
Condition Check:
If arr[i] == k, return true immediately. ✅
If the loop completes without finding k, return false. ❌
📊 Example Run: 🚀
Input:
arr = {1, 3, 5, 7, 9}, k = 5  
Process:
Start iterating:
i = 0 → arr[0] = 1 (not 5)
i = 1 → arr[1] = 3 (not 5)
i = 2 → arr[2] = 5 (match found) ✅
Output:
true
⚡ Time Complexity: ⏱
In the worst case, the loop checks all n elements.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses only a few variables (n, i), independent of input size.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Early Termination: 💡
The method returns true as soon as it finds the element, optimizing for cases where k appears early in the array. 🚀
Edge Cases: ⚠️

Element not found: Returns false. ❌
Empty array: Directly returns false. 📭
Multiple occurrences: Returns true on the first match.
Optimization Opportunity: 💡

Since the array is sorted, using a binary search can reduce time complexity to O(log n). 📉
🎯 Final Verdict:
✅ Simple and effective linear search (O(n))
✅ Space-optimized (O(1))
✅ Handles all edge cases
GFG LINKS :  https://www.geeksforgeeks.org/problems/who-will-win-1587115621/0 */  


