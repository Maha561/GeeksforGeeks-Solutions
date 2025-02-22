/* QUESTION : You are given an array arr[] of non-negative integers. 
Your task is to move all the zeros in the array to the right end 
while maintaining the relative order of the non-zero elements. 
The operation must be performed in place, 
meaning you should not use extra space for another arrAY*/

class Solution {
    void pushZerosToEnd(int[] arr) {
        
        int nonZero = 0;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]!=0){
                
                arr[nonZero]=arr[i];
                
                nonZero++;
                
            
            }
        }
        
        for(int j=nonZero;j<arr.length;j++){
            
            arr[j]=0;
        }
        
    }
}
/*✅ Code Explanation: 💡
The pushZerosToEnd method moves all zeros in the array to the end
 while maintaining the relative order of non-zero elements.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Pointer for Non-Zero Elements 🎯
int nonZero = 0;
nonZero acts as a pointer to track the position where the next non-zero element should be placed.
2️⃣ Move Non-Zero Elements Forward 🔄

for (int i = 0; i < arr.length; i++) {
    if (arr[i] != 0) {
        arr[nonZero] = arr[i];
        nonZero++;
    }
}
Iterates through the array.
For every non-zero element:
Places it at the nonZero index.
Increments the nonZero pointer.
This shifts all non-zero elements to the front of the array while preserving their order.
3️⃣ Fill Remaining Elements with Zeros ➖

for (int j = nonZero; j < arr.length; j++) {
    arr[j] = 0;
}
Fills the remaining positions (from nonZero to the end) with zeros.
📊 Example Runs: 🚀
Example 1:
int[] arr = {1, 0, 2, 0, 3, 0, 4};
pushZerosToEnd(arr);
// Output: [1, 2, 3, 4, 0, 0, 0]
✅ All zeros are moved to the end, and the order of non-zero elements is preserved.

Example 2:
int[] arr = {0, 0, 1, 2, 3};
pushZerosToEnd(arr);
// Output: [1, 2, 3, 0, 0]
✅ Zeros at the beginning are pushed to the end.

Example 3:
int[] arr = {1, 2, 3, 4, 5};
pushZerosToEnd(arr);
// Output: [1, 2, 3, 4, 5]
✅ No zeros, so the array remains unchanged.

Example 4:
int[] arr = {0, 0, 0, 0};
pushZerosToEnd(arr);
// Output: [0, 0, 0, 0]
✅ All zeros remain in place since the array contains only zeros.

⚡ Time Complexity: ⏱
1️⃣ First Loop (Moving Non-Zeros):

Iterates through the array once → O(N)
2️⃣ Second Loop (Filling Zeros):

Fills remaining positions → O(N - nonZero) (still O(N) in the worst case)
✅ Total Time Complexity:


O(N)
💾 Space Complexity: 🧠
1️⃣ Extra Variables:

Uses only one extra variable nonZero → O(1)
2️⃣ In-Place Operation:

No additional arrays or collections are used.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ In-Place Algorithm:

No additional space is used, making it space-efficient.
2️⃣ Maintains Order:

Non-zero elements retain their original order.
3️⃣ Handles Edge Cases:

Arrays with no zeros.
Arrays with all zeros.
Arrays with zeros at the start or end.
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(1)
✅ In-Place Solution 🧹
✅ Maintains Element Order 🎯
GFG LINK : https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/0
 */