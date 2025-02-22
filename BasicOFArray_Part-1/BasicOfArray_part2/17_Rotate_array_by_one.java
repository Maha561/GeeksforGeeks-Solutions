/* Given an array arr,
 rotate the array by one position in clockwise direction.
 */
class Solution {
    public void rotate(int[] arr) {
        int n =arr.length;
        int last = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = last;
    
    }
}
/*✅ Code Explanation: 💡
The method rotate(int[] arr) performs a right rotation 🔄 on the input array by one position. The last element moves to the front, and all other elements shift one step to the right. ➡️

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An integer array arr[]. 📊
Initialization: 🏁

n = arr.length — gets the length of the array. 📏
last = arr[n - 1] — stores the last element before rotation. 💾
Shifting Elements: 🔄

Loop from i = n - 1 down to 1:
Shift each element one position to the right:
arr[i] = arr[i - 1];
Placing Last Element: 🔙

Set arr[0] = last to place the saved last element at the front. 🚀
📊 Example Run: 🚀
Input:
arr = {1, 2, 3, 4, 5}
Process:
Save last element: last = 5
Shifting:
arr[4] = arr[3] → {1, 2, 3, 4, 4}
arr[3] = arr[2] → {1, 2, 3, 3, 4}
arr[2] = arr[1] → {1, 2, 2, 3, 4}
arr[1] = arr[0] → {1, 1, 2, 3, 4}
Insert last element:
arr[0] = 5 → {5, 1, 2, 3, 4}
Output:
{5, 1, 2, 3, 4}
⚡ Time Complexity: ⏱
The loop runs n - 1 times to shift elements.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses only one extra variable (last).
✅ Total Space Complexity: O(1) 🎯
⚠️ Key Considerations:
In-Place Rotation: 💡

The rotation happens in-place without extra space (except for one variable). ✅
Edge Cases: ⚠️

Empty Array: No changes; the method will handle it gracefully.
Single Element: No effect after rotation.
Array with Duplicates: Works as expected.
Extensions: 🚀

To rotate by k positions, consider reversing parts of the array.
For left rotation, adjust the shifting logic accordingly.
🎯 Final Verdict:
✅ Efficient right rotation by one (O(n))
✅ In-place operation (O(1) space)
✅ Handles edge cases smoothly
GFG LINK : https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/0 */

