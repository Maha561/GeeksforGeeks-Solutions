// Questions : You are given an integer array arr[]. 
//The task is to find the sum of it.
// User function Template for Java
class Solution {
    int sum(int arr[]) {
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}


/* ✅ Code Explanation: 💡
The method sum(int arr[]) calculates the sum 🔢 of all elements in the given integer array.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An integer array arr[].
Initialization: 🏁

Variable sum = 0 — to accumulate the total sum. 🧮
Iterate Over the Array: 🔄

Loop through each element arr[i] using a for-loop:
Add arr[i] to sum in each iteration. ➕
Return Result: 🖨

After completing the loop, return the final sum. ✅
📊 Example Run: 🚀
Input: arr = {1, 2, 3, 4, 5}

Calculation:

Start with sum = 0
Add elements one by one:
0 + 1 → 1 ➔ 1 + 2 → 3 ➔ 3 + 3 → 6 ➔ 6 + 4 → 10 ➔ 10 + 5 → 15
Output: 15 ✅

⚡ Time Complexity: ⏱
The loop runs once through the array of size n.
Each element is processed exactly once.
✅ Total Time Complexity: O(n) 🚀

💾 Space Complexity: 🧠
Uses only a single integer sum for accumulation.
No extra space dependent on input size.
✅ Total Space Complexity: O(1) 🎯 */
//GFG Links  : https://www.geeksforgeeks.org/problems/sum-of-array2326/0   