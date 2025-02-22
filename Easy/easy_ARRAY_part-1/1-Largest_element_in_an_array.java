/* QUESTION : Given an array arr[]. The task is to find the largest element and return it.
 */



 class Solution {
    public static int largest(int[] arr) {
        int n=arr.length;
        int max=arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        
    }
}
/* ✅ Code Explanation: 💡
The largest method finds the largest element in an array using a linear search. 🏆

🛠 Step-by-Step Breakdown: ⚡
Initialize Variables: 📊
int n = arr.length;  
int max = arr[0];  
n → Stores the size of the array. 📏
max → Initializes with the first element as the maximum. 🎯
Iterate & Compare: 🔄
for (int i = 0; i < n; i++) {  
    if (arr[i] > max) {  
        max = arr[i];  
    }  
}  
✅ Logic:
Traverse the array arr[].
Compare each element with max.
If arr[i] is greater, update max. 🚀
Return Result: 🏆
return max;  
After the loop, max holds the largest element.
📊 Example Run: 🚀
Example 1:
int[] arr = {3, 9, 2, 5, 7};  
System.out.println(largest(arr));  // Output: 9  
✅ Iteration Breakdown:
Initial max = 3  
Compare 9 > 3 → max = 9  
Compare 2 > 9 → No change  
Compare 5 > 9 → No change  
Compare 7 > 9 → No change  
Final max = 9  
⚡ Time Complexity: ⏱
Traversal: O(N) — Linear scan of all elements.
✅ Total Time Complexity: O(N) 🎯
💾 Space Complexity: 🧠
Extra Space: O(1) — No extra space used, just variables.
✅ Total Space Complexity: O(1) 🚀
⚠️ Key Considerations:
Edge Case — Empty Array: ⚠️

Current code assumes array has at least one element.
✅ Fix Suggestion: Add a check for empty arrays.
Negative Numbers: 💡

Works perfectly even if all elements are negative.
Multiple Maximums: 🎯

Returns the first occurrence if there are multiple max values.
🎯 Final Verdict:
✅ Efficient O(N) solution
✅ Constant space
✅ Handles diverse inputs correctly
GFG LINK :https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0 */