/*  QUESTION : Given an integer k and array arr. 
Your task is to return the position of the first occurrence of k
 in the given array and if element k is not present in the array then return -1.
Note: 1-based indexing is followed here. */
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==k){
                return i+1;
            }
        }
        return -1; 
    }
}
/*✅ Code Explanation: 💡
The search method finds the first occurrence of a
 target element k in an ArrayList arr.
  It returns the 1-based index of the element if found,
   or -1 if the element doesn't exist in the list. 🔍

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Iterate Through the ArrayList: 🔄
for(int i = 0; i < arr.size(); i++) {
    if(arr.get(i) == k) {
        return i + 1;
    }
}
Loop through each element in the ArrayList arr.
arr.get(i) fetches the element at index i.
Comparison:
If arr.get(i) == k, it means the target is found.
The method returns i + 1 to provide a 1-based index (since Java uses 0-based indexing). 📋
2️⃣ Handle Element Not Found: ⚠️

return -1;
If the loop completes without finding k, it returns -1.
This indicates that the target element does not exist in the ArrayList. 🚫
📊 Example Runs: 🚀
Example 1:

ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
int k = 30;
search(k, arr);  
// Output: 3
✅ Explanation:

The element 30 is at index 2 (0-based) → returns 2 + 1 = 3.
Example 2:

ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 15, 25, 35));
int k = 100;
search(k, arr);  
// Output: -1
✅ Explanation:

Element 100 is not in the list → returns -1.
Example 3:

ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));
int k = 2;
search(k, arr);  
// Output: 2
✅ Explanation:

The first occurrence of 2 is at index 1 → returns 1 + 1 = 2.
Example 4:
ArrayList<Integer> arr = new ArrayList<>();
int k = 5;
search(k, arr);  
// Output: -1
✅ Explanation:

The list is empty → returns -1.
⚡ Time Complexity: ⏱
1️⃣ Best Case (Element at Start):

Target k found at the first position → O(1)
2️⃣ Worst Case (Element at End or Not Present):

Iterate through the entire list → O(N)
✅ Total Time Complexity:
O(N)  
Where N is the size of the ArrayList.

💾 Space Complexity: 🧠
No extra data structures are used.
Only a few variables for iteration and comparison.
✅ Total Space Complexity:
O(1)  
⚠️ Key Considerations:
1️⃣ 1-Based Indexing:

Returns 1-based positions as per the problem requirements.
2️⃣ Handles Edge Cases:

Empty list ✅
Element not present ✅
Multiple occurrences (returns first) ✅
3️⃣ Optimizations:

Linear search is optimal for unsorted lists.
For sorted lists, consider binary search for improved efficiency (O(log N)).
🏆 Final Verdict:
✅ Simple and Efficient Linear Search
✅ Time Complexity: O(N)
✅ Space Complexity: O(1)
✅ Handles All Edge Cases

💯 An effective solution for searching in an ArrayList! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/searching-a-number0324/0
 */