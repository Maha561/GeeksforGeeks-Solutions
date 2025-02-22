/*QUESTION : Given an array arr[] of positive integers 
and another integer target. 
Determine if there exists two distinct indices
 such that the sum of there elements is equals to target. */
class Solution {
    boolean twoSum(int arr[], int target) {
        //Arrays.sort(arr);
        
        HashSet<Integer> pair = new HashSet<Integer>();
        
        for(int num : arr){
            if(pair.contains(target-num)){
                return true;
            }
            else{
                pair.add(num);
            }
        }
        return false;
        
    }
}
/* ✅ Code Explanation: 💡
The twoSum method checks whether there exist two distinct elements 
in the array whose sum equals the given target. 🎯

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️

HashSet<Integer> pair = new HashSet<Integer>();
A HashSet pair is used to store elements seen so far.
Purpose: To quickly check if the complement (target - num) exists. 🔍
2️⃣ Iterate Over the Array: 🔄

for(int num : arr) {
    if(pair.contains(target - num)) {
        return true;
    } else {
        pair.add(num);
    }
}
For each element num in the array:
Check if complement exists:
target - num is the value needed to complete the sum.
If it exists in pair, return true. ✅
Add current number to the set:
If no complement is found, add num to pair for future checks.
3️⃣ Return False if No Pair Found: ❌

return false;
If the loop finishes without finding a valid pair, return false. 🚫
📊 Example Runs: 🚀
Example 1:

int[] arr = {2, 7, 11, 15};
int target = 9;
twoSum(arr, target);  
// Output: true
✅ Explanation:

First Iteration: 2 → looks for 9 - 2 = 7 (not found yet).
Second Iteration: 7 → looks for 9 - 7 = 2 (found in set).
Result: true because 2 + 7 = 9. 🎯

Example 2:
int[] arr = {1, 2, 3, 4, 5};
int target = 10;
twoSum(arr, target);  
// Output: false
✅ Explanation:

No two numbers in the array sum up to 10.
Result: false. 🚫

Example 3:
int[] arr = {3, 3};
int target = 6;
twoSum(arr, target);  
// Output: true
✅ Explanation:

First 3 added to the set.
Second 3 finds 6 - 3 = 3 in the set.
Result: true because 3 + 3 = 6. 🎯

Example 4:
int[] arr = {-2, 1, 4, 5};
int target = 3;
twoSum(arr, target);  
// Output: true
✅ Explanation:

-2 + 5 = 3
Result: true. ✅

⚡ Time Complexity: ⏱
1️⃣ Iterating Through the Array:

The loop runs O(N) times, where N is the length of the array.
2️⃣ HashSet Operations:

contains() and add() operations in a HashSet take O(1) on average.
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ HashSet Storage:

The set can store up to N elements in the worst case.
✅ Total Space Complexity:
O(N)
⚠️ Key Considerations:
1️⃣ Edge Cases:

Arrays with less than 2 elements return false.
Handles negative numbers and zero correctly.
2️⃣ Duplicates:

Allows using the same number twice if it appears more than once (e.g., [3, 3] with target 6).
3️⃣ Efficiency:

No need to sort the array, ensuring O(N) time with a HashSet. ⚡
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(N)
✅ Handles All Edge Cases 🎯

💯 A clean and efficient approach for solving the Two Sum problem! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/key-pair5616/0

*/