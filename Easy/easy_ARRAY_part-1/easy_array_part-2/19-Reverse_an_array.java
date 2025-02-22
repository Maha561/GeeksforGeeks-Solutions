/* QUESTION : You are given an array of integers arr[].
 Your task is to reverse the given array.
Note: Modify the array in place. */
class Solution {
    public void reverseArray(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    
    }
}
/* ✅ Code Explanation: 💡
The reverseArray method reverses the elements of the given array 
in-place without using extra space. 🔄

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Two Pointers: 🏁
int i = 0;
int j = arr.length - 1;
i starts at the beginning of the array.
j starts at the end of the array.
The idea is to swap elements at these two pointers and move them towards the center. 🎯

2️⃣ Swap Elements Using a While Loop: 🔄
while (i < j) {
    int temp = arr[i];    // Temporary variable to store arr[i]
    arr[i] = arr[j];      // Swap arr[i] with arr[j]
    arr[j] = temp;        // Assign temp (original arr[i]) to arr[j]
    i++;                  // Move i forward
    j--;                  // Move j backward
}
The loop continues until i crosses j.
On each iteration:
The element at arr[i] is swapped with arr[j].
Pointers are updated to move towards the center.
This approach ensures an in-place reversal. ✅
📊 Example Runs: 🚀
Example 1:

int[] arr = {1, 2, 3, 4, 5};
reverseArray(arr);
// Output: [5, 4, 3, 2, 1]
✅ The array is reversed completely.

Example 2:
int[] arr = {10, 20, 30, 40};
reverseArray(arr);
// Output: [40, 30, 20, 10]
✅ Reverses the even-length array perfectly.

Example 3:
int[] arr = {7};
reverseArray(arr);
// Output: [7]
✅ A single-element array remains unchanged.

Example 4:
int[] arr = {};
reverseArray(arr);
// Output: []
✅ An empty array stays empty.

⚡ Time Complexity: ⏱
1️⃣ Swapping Elements:

Each iteration swaps one pair.
We only need N/2 swaps for an array of length N.
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ Extra Variables:

Uses only three variables (i, j, temp) → O(1)
2️⃣ In-Place Operation:

No extra arrays or data structures are used.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ In-Place Reversal:

No extra space is needed, making it highly efficient.
2️⃣ Handles Edge Cases:

Empty arrays.
Single-element arrays.
3️⃣ Preserves Data Integrity:

No data is lost during swaps.
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(1)
✅ Simple & Effective Approach 🧹

💯 Perfect for reversing arrays in-place with minimal overhead! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/reverse-an-array/0

 */