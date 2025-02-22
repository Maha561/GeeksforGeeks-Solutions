/*QUESTION : Given a sorted and rotated array arr[] of distinct elements,
 the task is to find the index of a target key.
  Return -1 if the key is not found. */
class Solution {
    int search(int[] arr, int key) {
        int result =-1;
        for(int i =0;i<=arr.length-1;i++){
            if(arr[i]==key){
                result=i;
            }
        }
        return result;
        
    }
}
/*✅ Code Explanation: 💡
The search method finds the last occurrence of a given key in an array.
 If the key is found, it returns its index; otherwise, it returns -1. 🔎

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Result Variable: 🎯
int result = -1;
result stores the index of the last occurrence of key.
Initially set to -1 (assuming key is not found). ❌
2️⃣ Iterate Through the Array: 🔄

for(int i = 0; i <= arr.length - 1; i++) {
    if(arr[i] == key) {
        result = i;
    }
}
Loop through the array from left to right.
If arr[i] == key, update result = i.
This ensures result stores the last occurrence of key.
3️⃣ Return the Result: 🚀

return result;
If key exists, returns last occurrence index.
If key does not exist, returns -1. ❌
📊 Example Walkthrough: 🚀
Example 1:
Input:

arr = {1, 2, 3, 4, 2, 5};  
key = 2;
Process:
Index 1: Found 2, update result = 1.
Index 4: Found 2, update result = 4. ✅
✅ Output:
4
Example 2:
Input:
arr = {5, 7, 9, 7, 8, 7};  
key = 7;
Process:
Index 1: Found 7, update result = 1.
Index 3: Found 7, update result = 3.
Index 5: Found 7, update result = 5. ✅
✅ Output:
5
Example 3:
Input:
arr = {1, 3, 5, 7};  
key = 2;
Process:
Key 2 is not found. ❌
✅ Output:
-1
⚡ Time Complexity: ⏱
✅ O(N) – The function traverses the array once.

💾 Space Complexity: 🧠
✅ O(1) – Uses only a single integer variable (result).

⚠️ Key Considerations:
1️⃣ Finds Last Occurrence – Unlike a simple linear search, this function does not return immediately when it finds key.
2️⃣ Handles Edge Cases – Works for empty arrays, duplicate values, and missing keys.

🏆 Final Verdict:
✅ Simple and efficient linear search 🔎
✅ Time Complexity: O(N)
✅ Space Complexity: O(1)
✅ Finds Last Occurrence of Key

🎉 A clean and effective approach for searching in an array! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/0
*/