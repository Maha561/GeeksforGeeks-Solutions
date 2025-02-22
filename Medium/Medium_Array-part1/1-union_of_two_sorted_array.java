/*Question : Given two sorted arrays a[] and b[],
 where each array may contain duplicate elements ,
  the task is to return the elements in the union
   of the two arrays in sorted order.
Union of two arrays can be defined as the set containing
 distinct common elements that are present in either of the arrays. */
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        HashSet<Integer> union = new HashSet<Integer>();
        
        for(int num : a){
            
            union.add(num);
        }
        
        for(int num : b){
            
            union.add(num);
        }
        
        ArrayList<Integer> sortedunion = new ArrayList<Integer>(union);
        
        Collections.sort(sortedunion);
        
        return sortedunion;
    
    }
}
/* ✅ Code Explanation: 💡
The findUnion method returns the union of two arrays 
as a sorted list without duplicates. 🔗📋

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize HashSet: 🗂️
HashSet<Integer> union = new HashSet<Integer>();
A HashSet is used to store unique elements from both arrays.
HashSet removes duplicates automatically. ✅
2️⃣ Add Elements from Array a: ➕
for(int num : a) {
    union.add(num);
}
Iterate over array a and add all elements to the HashSet.
Duplicates in a are ignored. 🚫
3️⃣ Add Elements from Array b: ➕
for(int num : b) {
    union.add(num);
}
Iterate over array b and add all elements to the HashSet.
If an element already exists, HashSet ignores it.
4️⃣ Convert HashSet to List & Sort: 🔄
ArrayList<Integer> sortedunion = new ArrayList<Integer>(union);  
Collections.sort(sortedunion);
Convert HashSet to ArrayList for sorting. 📋
Use Collections.sort to sort the list in ascending order. 📈
5️⃣ Return the Result: 🚀
return sortedunion;
Return the sorted list containing the union of arrays. ✅
📊 Example Walkthroughs: 🚀
Example 1:
Input:
a = {1, 2, 3, 4};  
b = {3, 4, 5, 6};
Process:
HashSet after adding a → {1, 2, 3, 4}
HashSet after adding b → {1, 2, 3, 4, 5, 6}
After sorting → [1, 2, 3, 4, 5, 6]
✅ Output:
[1, 2, 3, 4, 5, 6]
Example 2:
Input:
a = {1, 1, 2, 2};  
b = {2, 3, 3, 4};
Process:
HashSet → {1, 2, 3, 4}
Sorted List → [1, 2, 3, 4]
✅ Output:
[1, 2, 3, 4]
Example 3:
Input:
a = {};  
b = {1, 2, 3};
Process:
HashSet → {1, 2, 3}
Sorted List → [1, 2, 3]
✅ Output:
[1, 2, 3]
⚡ Time Complexity: ⏱
1️⃣ Inserting into HashSet: O(N + M)

N = size of array a, M = size of array b
HashSet insertion takes O(1) on average.
2️⃣ Sorting the List: O(K log K)

K = number of unique elements in the union.
✅ Total Time Complexity: O((N + M) + K log K)

💾 Space Complexity: 🧠
1️⃣ HashSet: O(K) — stores unique elements.
2️⃣ ArrayList: O(K) — for the sorted union list.

✅ Total Space Complexity: O(K)

⚠️ Key Considerations:
1️⃣ Removes Duplicates automatically via HashSet.
2️⃣ Handles Edge Cases:

Empty arrays
Arrays with all duplicates
Arrays with no overlapping elements
🏆 Final Verdict:
✅ Efficient Union Finder 🔗
✅ Handles Duplicates Gracefully 🚫
✅ Time Complexity: O((N + M) + K log K) ⏱
✅ Space Complexity: O(K) 🧠
✅ Returns a Sorted Union 📈

🎉 A clean and optimized approach! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/0
 */