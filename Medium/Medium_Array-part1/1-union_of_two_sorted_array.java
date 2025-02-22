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
/*✅ Code Explanation: 💡
The findUnion method returns a sorted list
 containing the union of two arrays 
 — i.e., all unique elements present in either array. 🔗📋

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️
HashSet<Integer> union = new HashSet<Integer>();
A HashSet is used to store unique elements from both arrays.
Sets automatically handle duplicates, ensuring each element appears only once. 💾
2️⃣ Add Elements from Both Arrays: ➕➕
for(int num : a) {
    union.add(num);
}

for(int num : b) {
    union.add(num);
}
Iterate over array a and add all elements to the union set.
Repeat for array b.
Since HashSet does not allow duplicates, any repeated elements are added only once. 🔄✅
3️⃣ Convert Set to List & Sort: 🔄📋
ArrayList<Integer> sortedunion = new ArrayList<Integer>(union);
Collections.sort(sortedunion);
Convert the HashSet into an ArrayList for sorting.
Collections.sort() sorts the list in ascending order. ⬆️
4️⃣ Return the Result: 🚀
return sortedunion;
The method returns the sorted list containing the union of both arrays. 🏆
📊 Example Walkthrough: 🚀
Example 1:
Input:
a = {1, 2, 3, 4, 5};  
b = {3, 4, 5, 6, 7};
Process:
Union Set After Adding a: {1, 2, 3, 4, 5}
Union Set After Adding b: {1, 2, 3, 4, 5, 6, 7}
Sorted Union List: [1, 2, 3, 4, 5, 6, 7]
✅ Output:

[1, 2, 3, 4, 5, 6, 7]
Example 2:
Input:
a = {8, 3, 1, 2};  
b = {5, 3, 7, 8};  
Process:
Union Set: {1, 2, 3, 5, 7, 8}
Sorted Union List: [1, 2, 3, 5, 7, 8]
✅ Output:
[1, 2, 3, 5, 7, 8]
Example 3:
Input:
a = {1, 1, 1};  
b = {1, 1};  
Process:
Union Set: {1}
Sorted Union List: [1]
✅ Output:
[1]
⚡ Time Complexity: ⏱
1️⃣ Adding Elements to HashSet:

O(N + M) where N and M are the sizes of arrays a and b respectively.
Inserting into a HashSet takes O(1) on average.
2️⃣ Converting Set to List:

O(U) where U is the number of unique elements.
3️⃣ Sorting the List:

O(U log U) for sorting the union list.
✅ Total Time Complexity:
O((N + M) + U log U)
💾 Space Complexity: 🧠
1️⃣ HashSet:

Stores up to N + M unique elements → O(U).
2️⃣ ArrayList:

Stores the sorted union → O(U).
✅ Total Space Complexity:
O(U)
⚠️ Key Considerations:
1️⃣ Handles Duplicates:

The HashSet ensures that duplicates are removed automatically. ✅
2️⃣ Sorted Output:

Uses Collections.sort() to return the union in ascending order. ⬆️
3️⃣ Edge Cases:

Empty Arrays: Returns the non-empty array or an empty list if both are empty.
Identical Arrays: Returns one copy of the array (no duplicates).
No Overlap: Combines all unique elements from both arrays.
🏆 Final Verdict:
✅ Efficient Union Implementation 🔗
✅ Time Complexity: O((N + M) + U log U)
✅ Space Complexity: O(U)
✅ Handles Duplicates & Sorted Output 📋

🎉💯 "A clean and optimized approach to find the union of two arrays!" 🚀🔥
✅ Code Explanation: 💡
The findUnion method returns a sorted list containing the union of two arrays — i.e., all unique elements present in either array. 🔗📋

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️
java
Copy
Edit
HashSet<Integer> union = new HashSet<Integer>();
A HashSet is used to store unique elements from both arrays.
Sets automatically handle duplicates, ensuring each element appears only once. 💾
2️⃣ Add Elements from Both Arrays: ➕➕
java
Copy
Edit
for(int num : a) {
    union.add(num);
}

for(int num : b) {
    union.add(num);
}
Iterate over array a and add all elements to the union set.
Repeat for array b.
Since HashSet does not allow duplicates, any repeated elements are added only once. 🔄✅
3️⃣ Convert Set to List & Sort: 🔄📋
java
Copy
Edit
ArrayList<Integer> sortedunion = new ArrayList<Integer>(union);
Collections.sort(sortedunion);
Convert the HashSet into an ArrayList for sorting.
Collections.sort() sorts the list in ascending order. ⬆️
4️⃣ Return the Result: 🚀
java
Copy
Edit
return sortedunion;
The method returns the sorted list containing the union of both arrays. 🏆
📊 Example Walkthrough: 🚀
Example 1:
Input:
java
Copy
Edit
a = {1, 2, 3, 4, 5};  
b = {3, 4, 5, 6, 7};
Process:
Union Set After Adding a: {1, 2, 3, 4, 5}
Union Set After Adding b: {1, 2, 3, 4, 5, 6, 7}
Sorted Union List: [1, 2, 3, 4, 5, 6, 7]
✅ Output:
java
Copy
Edit
[1, 2, 3, 4, 5, 6, 7]
Example 2:
Input:
java
Copy
Edit
a = {8, 3, 1, 2};  
b = {5, 3, 7, 8};  
Process:
Union Set: {1, 2, 3, 5, 7, 8}
Sorted Union List: [1, 2, 3, 5, 7, 8]
✅ Output:
java
Copy
Edit
[1, 2, 3, 5, 7, 8]
Example 3:
Input:
java
Copy
Edit
a = {1, 1, 1};  
b = {1, 1};  
Process:
Union Set: {1}
Sorted Union List: [1]
✅ Output:
java
Copy
Edit
[1]
⚡ Time Complexity: ⏱
1️⃣ Adding Elements to HashSet:

O(N + M) where N and M are the sizes of arrays a and b respectively.
Inserting into a HashSet takes O(1) on average.
2️⃣ Converting Set to List:

O(U) where U is the number of unique elements.
3️⃣ Sorting the List:

O(U log U) for sorting the union list.
✅ Total Time Complexity:

java
Copy
Edit
O((N + M) + U log U)
💾 Space Complexity: 🧠
1️⃣ HashSet:

Stores up to N + M unique elements → O(U).
2️⃣ ArrayList:

Stores the sorted union → O(U).
✅ Total Space Complexity:

java
Copy
Edit
O(U)
⚠️ Key Considerations:
1️⃣ Handles Duplicates:

The HashSet ensures that duplicates are removed automatically. ✅
2️⃣ Sorted Output:

Uses Collections.sort() to return the union in ascending order. ⬆️
3️⃣ Edge Cases:

Empty Arrays: Returns the non-empty array or an empty list if both are empty.
Identical Arrays: Returns one copy of the array (no duplicates).
No Overlap: Combines all unique elements from both arrays.
🏆 Final Verdict:
✅ Efficient Union Implementation 🔗
✅ Time Complexity: O((N + M) + U log U)
✅ Space Complexity: O(U)
✅ Handles Duplicates & Sorted Output 📋

🎉💯 "A clean and optimized approach to find the union of two arrays!" 🚀🔥

GFG LINK : https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/0
 */