/* QUESTION : You are given an array of integers arr[]. 
Your task is to reverse the given array.
Note: Modify the array in place.*/
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
The reverseArray method reverses the elements of an array
 in-place without using extra space. 🔄📊

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initial Setup: 🔧
int i = 0;
int j = arr.length - 1;
i starts at the beginning of the array (index 0).
j starts at the end of the array (index arr.length - 1).
These pointers help in swapping elements from both ends. 🔄

2️⃣ Reversing Logic: 🔁
while (i < j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
}
The while loop continues until the two pointers meet or cross.
In each iteration:
Elements at positions i and j are swapped. 🔄
i moves forward (i++) and j moves backward (j--).
This results in the array being reversed in-place. 💾✅
📊 Example Walkthrough: 🚀
Example 1:
Input:
arr = {1, 2, 3, 4, 5};
Process:
Initial: i = 0, j = 4
Iteration 1: Swap arr[0] (1) and arr[4] (5) → {5, 2, 3, 4, 1}
Iteration 2: Swap arr[1] (2) and arr[3] (4) → {5, 4, 3, 2, 1}
i = 2, j = 2 → Loop ends
✅ Output:

{5, 4, 3, 2, 1}
Example 2:
Input:
arr = {7, 9, 3};
Process:
Initial: i = 0, j = 2
Iteration 1: Swap arr[0] (7) and arr[2] (3) → {3, 9, 7}
i = 1, j = 1 → Loop ends
✅ Output:
{3, 9, 7}
⚡ Time Complexity: ⏱
Each element is visited once for swapping.
The loop runs for n/2 iterations, where n is the length of the array.
✅ Total Time Complexity:
O(n)
💾 Space Complexity: 🧠
Reversing is done in-place without using extra space.
Only a temporary variable (temp) is used for swapping.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ In-Place Reversal:

No extra array or data structure is used. 💾
2️⃣ Handles Edge Cases:

Empty Array: No action taken.
Single Element: No swap required.
Even/Odd Length Arrays: Correctly reversed in all cases.
3️⃣ Potential Enhancements:

Add null checks to prevent NullPointerException.
🏆 Final Verdict:
✅ Efficient In-Place Array Reversal 🔄
✅ Time Complexity: O(n)
✅ Space Complexity: O(1)
✅ Handles Edge Cases Gracefully 💪

🎉💯 "A simple yet powerful approach to reverse arrays!" 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/reverse-an-array/0
*/


