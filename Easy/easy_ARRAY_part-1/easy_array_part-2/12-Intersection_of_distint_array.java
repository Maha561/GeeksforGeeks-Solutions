/* Given two unsorted integer arrays a[] and b[] 
each consisting of distinct elements,
 the task is to return the count of elements in the intersection 
 (or common elements) of the two arrays.
Intersection of two arrays can be defined as the set containing distinct common elements
 between the two arrays.  */
class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashSet<Integer> intersection = new HashSet();
        int count =0;
        
        for(int num :a){
            
            intersection.add(num);
        }
        
        for(int num : b){
            if(intersection.contains(num)){
                
                count++;
                
                intersection.remove(num);
            }
        }
        
        return count;
    }
}
/* ✅ Code Explanation: 💡
The numberofElementsInIntersection method 
returns the count of unique elements that appear in both arrays.
 It ignores duplicates and ensures each common element is only counted once.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️

HashSet<Integer> intersection = new HashSet();  
int count = 0;  
intersection HashSet:

Stores elements from array a[].
Ensures uniqueness (automatically ignores duplicates).
count:

Tracks the number of unique common elements found.
2️⃣ Add Elements from First Array: ➕
for (int num : a) {  
    intersection.add(num);  
}
Iterates over array a[] and adds each element to the intersection set.
Duplicates in a[] are ignored due to HashSet properties.
3️⃣ Find Intersection with Second Array: 🔄
for (int num : b) {  
    if (intersection.contains(num)) {  
        count++;  
        intersection.remove(num);  
    }  
}
Iterates over array b[] to find common elements.
✅ If num exists in the intersection set:
count++ ➔ Increments the counter.
intersection.remove(num) ➔ Removes the element to avoid counting duplicates.
4️⃣ Return the Count of Intersection Elements: 📋

return count;  
Returns the total number of unique common elements between a[] and b[].
📊 Example Runs: 🚀
Example 1:
int[] a = {1, 2, 3, 4, 5};  
int[] b = {3, 4, 5, 6, 7};  
System.out.println(numberofElementsInIntersection(a, b));  
// Output: 3  
✅ Elements 3, 4, 5 are common in both arrays.

Example 2:
int[] a = {1, 2, 2, 3};  
int[] b = {2, 2, 3, 4};  
System.out.println(numberofElementsInIntersection(a, b));  
// Output: 2  
✅ Despite duplicates, only 2 and 3 are counted once.

Example 3:
int[] a = {1, 2, 3};  
int[] b = {4, 5, 6};  
System.out.println(numberofElementsInIntersection(a, b));  
// Output: 0  
✅ No common elements ➔ Result is 0.

⚡ Time Complexity: ⏱
1️⃣ Building the intersection Set:

Inserting elements from a[] → O(N)
(Each insert into HashSet is O(1) on average)
2️⃣ Checking Elements in b[]:

Iterating over b[] and checking membership → O(M)
(Each lookup & remove is O(1) on average)
✅ Total Time Complexity:
O(N + M)  
💾 Space Complexity: 🧠
1️⃣ intersection HashSet:

Stores up to N unique elements from a[] → O(N)
2️⃣ Auxiliary Variables:

Only uses a simple counter → O(1)
✅ Total Space Complexity:
O(N)  
⚠️ Key Considerations:
1️⃣ Efficient Handling of Duplicates:

Uses HashSet to automatically manage duplicates.
2️⃣ Unique Count:

Each common element is counted only once, even if duplicated in b[].
3️⃣ Edge Cases Handled:

Empty arrays.
Arrays with no common elements.
Arrays containing repeated elements.
🏆 Final Verdict:
✅ Time-Efficient → O(N + M)
✅ Space-Optimized → O(N)
✅ Accurate Counting → Unique elements only
✅ Simple and Effective Approach 💯 
GFG LINK : https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/0
*/