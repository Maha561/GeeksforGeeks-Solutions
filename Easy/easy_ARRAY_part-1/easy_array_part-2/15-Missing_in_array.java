/* QUESTION : You are given an array arr of size n - 1
 that contains distinct integers in the range from 1 to n (inclusive).
  This array represents a permutation of the integers from 1 to n 
  with one element missing. Your task is to identify and return the missing element. */
class Solution {
    int missingNumber(int arr[]) {
        int n=arr.length;
        long sumofnumbers=(long)(n+1)*(n+2)/2;
        long sum=0;
        int i=0;
        for(i=0;i<n;i++){
            sum=sum+arr[i];
        }
        return (int)(sumofnumbers-sum);  
    }
}
/* ✅ Code Explanation: 💡
The missingNumber method 
finds the missing number in an array 
containing distinct numbers from 1 to N+1, with one number missing.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Calculate Expected Sum of Numbers 🔢
int n = arr.length;
long sumofnumbers = (long)(n + 1) * (n + 2) / 2;
n is the length of the array (contains N elements, but should have N+1).
The formula for the sum of the first K natural numbers is:


Example: If array has 5 elements, the sum should be of numbers 1 to 6.
2️⃣ Calculate Actual Sum of Array Elements ➕

long sum = 0;
for (int i = 0; i < n; i++) {
    sum += arr[i];
}
Iterate through the array and calculate the sum of existing elements.
3️⃣ Find the Missing Number 🔍

return (int)(sumofnumbers - sum);
The missing number is simply:
Missing Number
=
Expected Sum
−
Actual Sum
Missing Number=Expected Sum−Actual Sum
This works because only one number is missing, and subtraction reveals it directly.
📊 Example Runs: 🚀
Example 1:

int[] arr = {1, 2, 4, 5, 6};  
System.out.println(missingNumber(arr));  
// Output: 3
✅ The array should have numbers 1 to 6. Missing number is 3.

Example 2:

int[] arr = {2, 3, 1, 5};  
System.out.println(missingNumber(arr));  
// Output: 4
✅ The array should have numbers 1 to 5. Missing number is 4.

Example 3:

int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};  
System.out.println(missingNumber(arr));  
// Output: 8
✅ The array should have numbers 1 to 9. Missing number is 8.

⚡ Time Complexity: ⏱
1️⃣ Calculating Expected Sum:

Constant time operation → O(1)
2️⃣ Iterating Through Array:

Single loop over N elements → O(N)
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ Extra Variables:

Only uses a few variables (sumofnumbers, sum, and counters) → O(1)
2️⃣ No Extra Data Structures:

Does not use any additional arrays or collections.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ Handles Large Numbers:

Uses long to avoid integer overflow when calculating sums.
2️⃣ Efficient Approach:

Better than sorting or hash-based methods in terms of space.
3️⃣ Assumptions:

Array contains distinct integers from 1 to N+1.
Exactly one number is missing.
🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(1)
✅ Simple, Clean, and Effective Approach 🚀
GFG LINK : https://www.geeksforgeeks.org/problems/missing-number-in-array1416/0

 */