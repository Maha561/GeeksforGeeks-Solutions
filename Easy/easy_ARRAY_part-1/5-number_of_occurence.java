/* QUESTION : Given a sorted array, arr[] and a number target,
 you need to find the number of occurrences of target in arr[].  */
class Solution {
    int countFreq(int[] arr, int target) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
/*✅ Code Explanation: 💡
The countFreq method counts how many times a target element appears in an array. 📋🎯

🛠 Step-by-Step Breakdown: ⚡
Initialize Counter: 🔢

int count = 0;  
A variable count is initialized to 0 to keep track of how many times the target appears.
Traverse the Array: 🔍

for(int i = 0; i < arr.length; i++) {  
    if(arr[i] == target) {  
        count++;  // Increment count when target matches  
    }  
}  
✅ Logic:
Iterates over each element in arr.
if(arr[i] == target) checks if the current element matches the target.
count++ increments the counter for every match.
Return the Count: 🎯

return count;  
After traversing the array, returns the total frequency of the target.
📊 Example Run: 🚀
Example 1:

int[] arr = {1, 2, 3, 2, 4, 2, 5};  
int target = 2;  
System.out.println(countFreq(arr, target));  // Output: 3  
Steps:

The target (2) appears at indices 1, 3, and 5.
Total count: 3
Example 2:

int[] arr = {5, 7, 9, 10};  
int target = 3;  
System.out.println(countFreq(arr, target));  // Output: 0  
3 is not present in the array.
Result: 0 🚫
⚡ Time Complexity: ⏱
Single Pass: O(N) — where N is the length of the array.
Traverses the array exactly once.
✅ Total Time Complexity: O(N) 🚀

💾 Space Complexity: 🧠
No extra space is used apart from a simple counter.
Constant space usage.
✅ Total Space Complexity: O(1) 🎯

⚠️ Key Considerations:
Empty Array: ⚠️

If arr is empty, the function returns 0.
Target Not Found: 🚫

Returns 0 if the target doesn’t exist in the array.
All Elements Match: 🎯

If all elements equal the target, it returns arr.length.
🎯 Final Verdict:
✅ Simple O(N) solution
✅ Covers all edge cases
✅ Minimal space usage
 GFG LINK : https://www.geeksforgeeks.org/problems/number-of-occurrence2259/0
 */