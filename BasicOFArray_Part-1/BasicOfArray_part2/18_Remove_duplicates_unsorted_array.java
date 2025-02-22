/*Given an array arr of integers
 which may or may not contain duplicate elements. 
 Your task is to remove duplicate elements.
 */
class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        
        // to maintain the order we are using LinkedHashSet
        
        LinkedHashSet<Integer> unique = new LinkedHashSet<Integer>();
        
        for(int num : arr){
            unique.add(num);
        }
        
        return new ArrayList<>(unique);

    }
}
/*✅ Code Explanation: 💡
The method removeDuplicate(int arr[]) removes duplicate elements from the input array while maintaining the original order. It returns an ArrayList of unique elements. 🎯

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An integer array arr[]. 📊
Data Structure Used: 🛠

Uses LinkedHashSet to:
Eliminate duplicates automatically. ✅
Preserve insertion order. 📋
Logic: 🔄

Create a LinkedHashSet<Integer> named unique.
Iterate through each num in arr:
pgsql
Copy
Edit
unique.add(num);  
Duplicate values are ignored by the set.
Convert unique into an ArrayList and return. 🚀
📊 Example Run: 🚀
Input:
java
Copy
Edit
arr = {1, 2, 3, 2, 4, 3, 5}
Process:
Adding to LinkedHashSet:
Add 1 → {1}
Add 2 → {1, 2}
Add 3 → {1, 2, 3}
Add 2 → (ignored)
Add 4 → {1, 2, 3, 4}
Add 3 → (ignored)
Add 5 → {1, 2, 3, 4, 5}
Output:
csharp
Copy
Edit
[1, 2, 3, 4, 5]
⚡ Time Complexity: ⏱
Inserting n elements into a LinkedHashSet takes O(1) on average per insertion.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses additional space for LinkedHashSet and the resulting ArrayList.
✅ Total Space Complexity: O(n) 🎯
⚠️ Key Considerations:
Order Preservation: 📋

Using LinkedHashSet ensures the original order is retained after removing duplicates. ✅
Edge Cases: ⚠️

Empty Array: Returns an empty list.
All Unique Elements: Returns the original list.
All Duplicates: Returns a list with one element.
Alternatives: 💡

Using a HashSet would also remove duplicates but would not preserve order.
Manual implementation using a HashMap or boolean array (for known ranges) is possible but more complex.
🎯 Final Verdict:
✅ Efficient duplicate removal (O(n))
✅ Maintains original order
✅ Simple and clean approach using built-in Java collections
GFG LINK : https://www.geeksforgeeks.org/problems/remove-duplicates-from-unsorted-array4141/0 */ 
