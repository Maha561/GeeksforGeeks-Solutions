/* QUESTION : Given a sorted array arr and an integer k,
 find the position(0-based indexing) at which k 
 is present in the array using binary search.

Note: If multiple occurrences are there, please return the smallest index. */


// User function Template for Java

class Solution {
    public int binarysearch(int[] arr, int k) {
        int n= arr.length;
        int low =0;
        int last =n-1;
        int result =-1;
        while(low<=last){
            int mid =(low+last)/2;
            if(k==arr[mid]){
                result = mid;
                last =mid-1;
                
                
            }
            else if(k<arr[mid]){
                last =mid-1;
            }
            else{
                low =mid+1;
            }
        }
        
        return result;
    
    }
}
/*✅ Code Explanation: 💡
The method binarysearch(int[] arr, int k) performs a binary search to find the first occurrence of element k in a sorted array arr[]. If k is not found, it returns -1. ✅

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

arr[] — A sorted array of integers. 📊
k — The target element to search for. 🎯
Initialization: 🛠

int low = 0;  
int last = n - 1;  
int result = -1;  
low and last define the search boundaries.
result stores the index of the first occurrence of k.
🔄 Logic:
Binary Search Loop: 🔍

while (low <= last) {  
    int mid = (low + last) / 2;  

    if (k == arr[mid]) {  
        result = mid;        // Store index of k  
        last = mid - 1;      // Continue search on the left  
    } else if (k < arr[mid]) {  
        last = mid - 1;      // Move to left half  
    } else {  
        low = mid + 1;       // Move to right half  
    }  
}
Find Midpoint: Calculates the mid index as (low + last) / 2.
Check for Match:
If arr[mid] == k, store mid in result.
Move last to mid - 1 to continue searching for an earlier occurrence.
Adjust Search Range:
If k < arr[mid], search left half.
If k > arr[mid], search right half.
📊 Example Run: 🚀
Example 1:
Input:
arr = {1, 2, 4, 4, 4, 5, 6}  
k = 4  
Process:

Initial range: low = 0, last = 6
Midpoints explored: 3 → 1 → 2
First occurrence of 4 found at index 2
Output:
2
Example 2:
Input:

arr = {1, 3, 5, 7, 9}  
k = 4  
Process:

Element 4 is not present in the array.
Output:

-1
⚡ Time Complexity: ⏱
Binary Search: O(log n) — The search space is halved with each iteration.
✅ Total Time Complexity: O(log n) 🚀
💾 Space Complexity: 🧠
Constant space — No extra data structures used.
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
Handles Duplicates: 🔢

Finds the first occurrence of k even if duplicates exist.
Edge Cases: ⚠️

k not present: Returns -1.
Array of size 1: Correctly returns 0 if matched, else -1.
All elements are k: Returns index 0.
Potential Improvement: 💡

Mid Calculation: To avoid integer overflow in large arrays, use:

int mid = low + (last - low) / 2;
🎯 Final Verdict:
✅ Efficient O(log n) search
✅ Correctly finds first occurrence
✅ Optimized space usage
GFG LINK : https://www.geeksforgeeks.org/problems/binary-search-1587115620/0 */