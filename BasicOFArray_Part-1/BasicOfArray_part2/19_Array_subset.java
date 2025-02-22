/* QUESTION : Given two arrays a[] and b[], 
your task is to determine whether b[] is a subset of a[]. */
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> subset = new HashMap<Integer,Integer>();
        // adding all the elements of a to hashmap
        for(int num:a){
            subset.put(num,subset.getOrDefault(num,0)+1);
        }
        // check b is a asubset of a
        for(int num : b){
            if(!subset.containsKey(num)||subset.get(num) == 0){
                return false;
            }
            subset.put(num,subset.getOrDefault(num,0)-1);
            
        }
        
        return true;    
    }
}
/* ✅ Code Explanation: 💡
The method isSubset(int a[], int b[]) checks if array b is a subset of array a. It uses a HashMap to efficiently manage element frequencies. ✅

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

Array a[] — potential superset. 🅰️
Array b[] — potential subset. 🅱️
Data Structure Used: 🛠

HashMap<Integer, Integer> named subset is used to:
Store elements from array a.
Track frequencies of each element. 🔢
Logic: 🔄

Step 1: Build Frequency Map for a[]

java
Copy
Edit
for(int num : a) {
    subset.put(num, subset.getOrDefault(num, 0) + 1);
}
Adds each element from a[] to subset with its count.
Step 2: Verify b[] as Subset

java
Copy
Edit
for(int num : b) {
    if(!subset.containsKey(num) || subset.get(num) == 0) {
        return false;
    }
    subset.put(num, subset.get(num) - 1);
}
For each element in b[], check if it exists in the subset map.
If an element is missing or its count is 0, return false. 🚫
Otherwise, decrement the count (handles duplicate elements).
Return Result:

If all elements of b[] are found in a[], return true. ✅
📊 Example Run: 🚀
Input:
java
Copy
Edit
a = {1, 2, 3, 4, 5}  
b = {2, 4, 5}
Process:
Frequency Map of a[]:

css
Copy
Edit
{1:1, 2:1, 3:1, 4:1, 5:1}
Checking Elements of b[]:

2 found → decrement count → {1:1, 2:0, 3:1, 4:1, 5:1}
4 found → decrement count → {1:1, 2:0, 3:1, 4:0, 5:1}
5 found → decrement count → {1:1, 2:0, 3:1, 4:0, 5:0}
Output:
arduino
Copy
Edit
true
⚡ Time Complexity: ⏱
Building HashMap: O(n) — where n is the size of array a[].
Checking Subset: O(m) — where m is the size of array b[].
✅ Total Time Complexity: O(n + m) 🚀
💾 Space Complexity: 🧠
HashMap: Stores up to n elements from array a[].
✅ Total Space Complexity: O(n) 🎯
⚠️ Key Considerations:
Handles Duplicates: 🔢

The use of counts ensures that duplicates in b[] are validated correctly.
Order-Independent: 🛠

Subset checking is based solely on element presence and count, not order.
Edge Cases: ⚠️

Empty b[]: Always a subset → returns true.
Empty a[]: Only an empty b[] is a subset → otherwise false.
Duplicate Elements in b[]: Handled using frequency counts.
🎯 Final Verdict:
✅ Efficient subset check (O(n + m))
✅ Handles duplicates correctly
✅ Uses HashMap for optimized lookups
 GFG LINK : https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/0 */  