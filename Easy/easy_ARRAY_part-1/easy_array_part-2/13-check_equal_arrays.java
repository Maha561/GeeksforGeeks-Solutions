/* Given two arrays a[] and b[] of equal size,
 the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal
 if both contain the same set of elements,
  arrangements (or permutations) of elements may be different though.
Note: If there are repetitions,
 then counts of repeated elements must also be the same for two arrays to be equal. */
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        
        return false;
    }
}
/* ✅ Code Explanation: 💡
The checkEqual method checks if two integer arrays a[] and b[]
 contain the same elements (including duplicates) in any order.
  It returns true if they are equal and false otherwise.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Sort Both Arrays: 🔢

Arrays.sort(a);  
Arrays.sort(b);  
The arrays a[] and b[] are sorted in ascending order.
Sorting ensures that identical elements will appear at the same indices if the arrays are equal.
2️⃣ Compare Arrays: 🔍

if (Arrays.equals(a, b)) {  
    return true;  
}  
Arrays.equals(a, b) compares both arrays element by element after sorting.
✅ If all elements match at the corresponding positions, it returns true.
❌ If there’s any difference, it returns false.
3️⃣ Return Result: 📋

return false;  
If the arrays aren't equal, the method returns false.
📊 Example Runs: 🚀
Example 1:

int[] a = {1, 2, 3};  
int[] b = {3, 2, 1};  
System.out.println(checkEqual(a, b));  
// Output: true  
✅ Arrays contain the same elements in different orders → true.

Example 2:

int[] a = {1, 2, 2, 3};  
int[] b = {1, 2, 3, 3};  
System.out.println(checkEqual(a, b));  
// Output: false  
❌ Arrays differ in element counts (2 appears twice in a[] but only once in b[]) → false.

Example 3:

int[] a = {};  
int[] b = {};  
System.out.println(checkEqual(a, b));  
// Output: true  
✅ Both arrays are empty → true.

⚡ Time Complexity: ⏱
1️⃣ Sorting Both Arrays:

Sorting a[] → O(N log N)
Sorting b[] → O(M log M)
(N = length of a[], M = length of b[])
2️⃣ Comparing Arrays:

Element-wise comparison → O(min(N, M))
✅ Total Time Complexity:

O(N log N + M log M)  
💾 Space Complexity: 🧠
1️⃣ Sorting (In-place for Arrays.sort()):

No extra space is used beyond the input arrays → O(1)
2️⃣ Auxiliary Space:

Minimal space for loop counters and boolean return → O(1)
✅ Total Space Complexity:

O(1)  
⚠️ Key Considerations:
1️⃣ Handles Duplicates:

Duplicates are considered — arrays must match exactly in both elements and counts.
2️⃣ Efficient Comparison:

Relies on sorting, which simplifies the equality check.
3️⃣ Edge Case Handling:

Empty arrays: Considered equal.
Different sizes: Automatically return false after sorting.
🏆 Final Verdict:
✅ Simple & Clean Solution 💡
✅ Time-Efficient → O(N log N + M log M)
✅ Space-Optimized → O(1)
✅ Accurately Handles Duplicates & Edge Cases 🚀
GFG LINK : https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/0
 */
