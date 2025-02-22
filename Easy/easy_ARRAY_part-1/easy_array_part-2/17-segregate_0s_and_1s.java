/* QUESTION : Given an array arr consisting of only 0's and 1's in random order. 
Modify the array in-place to segregate 0s onto the left side and 1s
 onto the right side of the array. */
class Solution {
    void segregate0and1(int[] arr) {
        int zero = 0;
        // counting how many zeros
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]==0){
                
                zero++;
            }
            
        }
        
        // filling zero to the left
        
        for(int i =0;i<zero;i++){
            
            arr[i] = 0;
        }
        
        // filling 1 to the right
        
        for(int i = zero;i<arr.length;i++){
            
            arr[i] =1;
        }    
    }
}
/* ✅ Code Explanation: 💡
The segregate0and1 method rearranges an array
 consisting of only 0s and 1s so that all 0s appear on the left, 
 and all 1s appear on the right.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Count the Number of Zeros 🔢
int zero = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == 0) {
        zero++;
    }
}
Iterates through the array and counts the number of zeros.
The variable zero stores the count.
2️⃣ Fill the Left Side with Zeros ➖
for (int i = 0; i < zero; i++) {
    arr[i] = 0;
}
Fills the first zero positions of the array with 0s.
3️⃣ Fill the Right Side with Ones ➕
for (int i = zero; i < arr.length; i++) {
    arr[i] = 1;
}
Fills the remaining positions with 1s.
Since we already counted the zeros, the rest must be ones.
📊 Example Runs: 🚀
Example 1:
int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
segregate0and1(arr);
// Output: [0, 0, 0, 0, 1, 1, 1, 1]
✅ All zeros are moved to the left, and all ones are on the right.

Example 2:
int[] arr = {1, 1, 1, 1};
segregate0and1(arr);
// Output: [1, 1, 1, 1]
✅ No zeros, so the array remains unchanged.

Example 3:
int[] arr = {0, 0, 0, 0};
segregate0and1(arr);
// Output: [0, 0, 0, 0]
✅ No ones, so the array remains unchanged.

Example 4:
int[] arr = {1, 0, 1, 0, 1, 0};
segregate0and1(arr);
// Output: [0, 0, 0, 1, 1, 1]
✅ Zeros are grouped on the left, ones on the right.

⚡ Time Complexity: ⏱
1️⃣ Counting Zeros:

Iterates through the array once → O(N)
2️⃣ Filling Zeros:

Iterates through zero positions → O(zero) ≈ O(N)
3️⃣ Filling Ones:

Iterates through the remaining positions → O(N - zero) ≈ O(N)
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ Extra Variables:

Uses only one extra variable zero → O(1)
2️⃣ In-Place Operation:

No additional arrays or collections are used.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ In-Place Algorithm:

No extra space is used, making it efficient.
2️⃣ Preserves Stability (Relative Order Not Required):

Since only 0s and 1s exist, order is not important.
3️⃣ Handles Edge Cases:

Arrays with only 0s.
Arrays with only 1s.
Alternating 0s and 1s.
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(1)
✅ Simple & Clean Approach 🧹

💯 Perfect for sorting binary arrays efficiently! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/0
 */