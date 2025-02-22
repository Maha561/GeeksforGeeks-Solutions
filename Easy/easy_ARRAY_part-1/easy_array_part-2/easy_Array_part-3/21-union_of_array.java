/* QUESTION : Given two arrays a[] and b[], 
the task is to find the number of elements in the union between these two arrays.
The Union of the two arrays can be defined as the set
 containing distinct elements from both arrays. 
 If there are repetitions, then only one element occurrence should be there in the union.
Note: Elements of a[] and b[] are not necessarily distinct. */
class Solution {
    public static int findUnion(int a[], int b[]) {
        
        HashMap<Integer,Integer> union = new HashMap<Integer,Integer>();
        
        for(int num : a){
            
            union.put(num ,union.getOrDefault(num ,0)+1);
        }
        
        for(int num : b){
            
            union.put(num,union.getOrDefault(num ,0)+1);
            
        }
        
        return union.size();    
    }
}
/*✅ Code Explanation: 💡
The findUnion method computes the count of unique elements 
present in the union of two arrays a[] and b[].
 The union includes all distinct elements from both arrays. 🔗

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️
HashMap<Integer, Integer> union = new HashMap<>();
A HashMap union is used to store each unique element as a key and its frequency as the value.
Purpose: To automatically handle duplicates while tracking elements from both arrays. 🧮
2️⃣ Add Elements from First Array: ➕
for(int num : a) {
    union.put(num, union.getOrDefault(num, 0) + 1);
}
Iterate over array a[].
Use getOrDefault to check if the element exists:
If present, increment its count.
If absent, insert it with count 1.
This ensures that all elements from a[] are added uniquely. ✅
3️⃣ Add Elements from Second Array: 🔄
for(int num : b) {
    union.put(num, union.getOrDefault(num, 0) + 1);
}
Iterate over array b[] and apply the same logic.
Duplicate elements (across a[] and b[]) will be merged in the HashMap. 🧩
4️⃣ Return the Union Size: 📊
return union.size();
The size of the HashMap gives the count of unique elements in the union. 🎯
📊 Example Runs: 🚀
Example 1:
int[] a = {1, 2, 3, 4, 5};
int[] b = {4, 5, 6, 7, 8};
findUnion(a, b);  
// Output: 8
✅ Explanation:

Union: {1, 2, 3, 4, 5, 6, 7, 8}
Total unique elements = 8.
Example 2:
int[] a = {1, 1, 2, 3};
int[] b = {2, 2, 4, 5};
findUnion(a, b);  
// Output: 5
✅ Explanation:

Union: {1, 2, 3, 4, 5}
Total unique elements = 5.
Example 3:
int[] a = {7, 7, 7};
int[] b = {7, 7, 7};
findUnion(a, b);  
// Output: 1
✅ Explanation:

Union: {7}
Total unique elements = 1.
Example 4:
int[] a = {};
int[] b = {1, 2, 3};
findUnion(a, b);  
// Output: 3
✅ Explanation:

Union: {1, 2, 3}
Total unique elements = 3.
⚡ Time Complexity: ⏱
1️⃣ Processing Array a[]:

Iterates over N elements → O(N)
2️⃣ Processing Array b[]:

Iterates over M elements → O(M)
3️⃣ HashMap Operations:

put and getOrDefault in a HashMap take O(1) on average.
✅ Total Time Complexity:
O(N + M)
💾 Space Complexity: 🧠
1️⃣ HashMap Storage:

Stores up to (N + M) unique elements.
In the worst case, where no duplicates exist → O(N + M).
✅ Total Space Complexity:
O(N + M)
⚠️ Key Considerations:
1️⃣ Handles Duplicates:

Ensures each unique element is counted only once. 🔄
2️⃣ Edge Cases:

Empty arrays: Handled gracefully.
All duplicates: Only unique values are stored.
3️⃣ Optimization:

Uses a HashMap for efficient insert and lookup.
🏆 Final Verdict:
✅ Time-Efficient → O(N + M)
✅ Space-Optimized → O(N + M)
✅ Handles All Edge Cases 🎯

💯 A simple and effective solution to compute the union of two arrays! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/0

 */