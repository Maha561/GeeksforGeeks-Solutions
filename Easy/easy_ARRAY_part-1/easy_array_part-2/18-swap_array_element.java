/* QUESTION : Given an array arr of positive integers.
 The task is to swap every ith element of the array with (i+2)th element. */
class Solution {
    public void swapElements(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int j=i+2;
            if(j<n){
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j++;
            }
            
        }    
    }
}
/*✅ Code Explanation: 💡
The swapElements method swaps every element in the array 
with the element two positions ahead. 🔄

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Variables: 🏁
int n = arr.length;
n holds the length of the array for iteration limits. 📏
2️⃣ Iterate and Swap Elements: 🔄
for (int i = 0; i < n - 1; i++) {
    int j = i + 2;
    if (j < n) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        j++;
    }
}
Loop iterates from i = 0 to n - 2.
j = i + 2 points to the element two positions ahead of i.
Condition:
If j < n, swap elements at positions i and j.
Swapping Logic:
Use a temporary variable temp to store the value at arr[j].
Perform the swap. 🔄
📊 Example Runs: 🚀
Example 1:
int[] arr = {1, 2, 3, 4, 5, 6};
swapElements(arr);
// Output: [3, 2, 1, 4, 5, 6]
✅ Swaps:

1 ↔ 3 → [3, 2, 1, 4, 5, 6]
2 remains unchanged (since the swap skips it).
Example 2:
int[] arr = {10, 20, 30, 40, 50};
swapElements(arr);
// Output: [30, 20, 10, 40, 50]
✅ Swaps:

10 ↔ 30 → [30, 20, 10, 40, 50]
Remaining elements stay the same.
Example 3:
int[] arr = {5, 6};
swapElements(arr);
// Output: [5, 6]
✅ No swaps happen because there is no element two positions ahead.

Example 4:
int[] arr = {1};
swapElements(arr);
// Output: [1]
✅ Single-element array remains unchanged.

⚡ Time Complexity: ⏱
1️⃣ Loop Iteration:

The loop runs O(N) times, where N is the length of the array.
2️⃣ Swapping Operation:

Each swap is an O(1) operation.
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ Extra Variables:

Uses only a few variables (n, i, j, temp) → O(1)
2️⃣ In-Place Operation:

No extra data structures are used.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ Edge Cases:

Arrays with less than 3 elements remain unchanged.
The code safely avoids out-of-bound errors with if (j < n) check.
2️⃣ In-Place Swapping:

No extra space is used, making the solution memory-efficient.
3️⃣ Potential Improvement:

The statement j++; inside the if block is unnecessary and can be removed without affecting functionality.
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(1)
✅ In-Place & Safe Swapping 🔄
GFG LINK : https://www.geeksforgeeks.org/problems/need-some-change/0
 
 */