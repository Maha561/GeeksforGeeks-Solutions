/* Given an array arr consisting of positive integer numbers,
 remove all duplicate numbers. */
class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        LinkedHashSet<Integer> duplicates = new LinkedHashSet<Integer>();
        for(int num : arr){
            duplicates.add(num);
            
        }
        return new ArrayList<>(duplicates);
        
    }
}
/*✅ Code Explanation: 💡
The removeDuplicate method removes duplicate elements
 from an array while maintaining the original order.
  It returns the modified list as an ArrayList<Integer>.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize a LinkedHashSet to Store Unique Elements: 🏷️

LinkedHashSet<Integer> duplicates = new LinkedHashSet<Integer>();
LinkedHashSet is used because:
It removes duplicates automatically.
It preserves the original order of elements.
2️⃣ Iterate Through the Array and Add Elements to LinkedHashSet: 🔄

for(int num : arr) {
    duplicates.add(num);
}
Set property ensures uniqueness (ignores duplicates).
3️⃣ Convert the LinkedHashSet to an ArrayList and Return: 🔁

return new ArrayList<>(duplicates);
Why convert to ArrayList?
The problem requires returning an ArrayList<Integer>.
LinkedHashSet doesn’t support index-based access like ArrayList.
📊 Example Runs: 🚀
Example 1:

int[] arr = {1, 2, 3, 2, 4, 1, 5};  
System.out.println(removeDuplicate(arr));  
// Output: [1, 2, 3, 4, 5]
Duplicates removed, order preserved. ✅
Example 2:

int[] arr = {5, 5, 5, 5, 5};  
System.out.println(removeDuplicate(arr));  
// Output: [5]
All duplicate values are filtered out. 🎯
⚡ Time Complexity: ⏱
Each insertion into LinkedHashSet is O(1) (on average).
Loop runs O(N) times, inserting each element once.
✅ Total Time Complexity: O(N)
💾 Space Complexity: 🧠
Extra space for LinkedHashSet → O(N) in the worst case (all elements unique).
✅ Total Space Complexity: O(N)
⚠️ Key Considerations:
1️⃣ Maintains Original Order: ✅
2️⃣ Efficient Duplicate Removal: ✅
3️⃣ Handles Edge Cases Like Empty Array: ✅

🏆 Final Verdict:
✅ Optimal O(N) solution
✅ Preserves order while removing duplicates
✅ Efficient with HashSet-based approach
✅ Handles all edge cases
GFG LINK  :https://www.geeksforgeeks.org/problems/remove-duplicates-in-small-prime-array/0
 */