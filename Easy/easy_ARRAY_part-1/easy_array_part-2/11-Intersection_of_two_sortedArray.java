/* Question : Given two sorted arrays arr1[] and arr2[]. 
Your task is to return the intersection of both arrays.
Intersection of two arrays is said to be elements 
that are common in both arrays. 
The intersection should not count duplicate elements.
Note: If there is no intersection then return an empty array. */

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        
        LinkedHashSet<Integer> intersection =  new LinkedHashSet<Integer>();
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int num : arr1){
            
            intersection.add(num);
        }
        
        for(int num : arr2){
            
            if(intersection.contains(num)){
                
                result.add(num);
                
                intersection.remove(num);
            }
        }
        
        return result;    
    }
}
/*✅ Code Explanation: 💡
The intersection method 
returns a list containing the unique intersection of two arrays
 — elements that appear in both arrays without duplicates.
🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️

LinkedHashSet<Integer> intersection = new LinkedHashSet<Integer>();  
ArrayList<Integer> result = new ArrayList<Integer>();  
intersection Set:
Stores elements from arr1.
LinkedHashSet maintains insertion order and ensures uniqueness.
result List:
Stores elements found in both arrays.
2️⃣ Add Elements from First Array: ➕

for (int num : arr1) {  
    intersection.add(num);  
}
Adds all elements from arr1 to the intersection set.
Duplicates in arr1 are automatically removed due to set properties.
3️⃣ Find Intersection with Second Array: 🔄

for (int num : arr2) {  
    if (intersection.contains(num)) {  
        result.add(num);  
        intersection.remove(num);  
    }  
}
Iterates over arr2 to find common elements.
✅ If num exists in the intersection set, it is:
Added to result.
Removed from the set to avoid adding duplicates to the result.
4️⃣ Return the Intersection Result: 📋

return result;  
Returns the list of unique elements that appear in both arrays.
📊 Example Runs: 🚀
Example 1:

int[] arr1 = {1, 2, 3, 4, 5};  
int[] arr2 = {3, 4, 5, 6, 7};  
System.out.println(intersection(arr1, arr2));  
// Output: [3, 4, 5]
✅ Elements 3, 4, and 5 are common in both arrays.

Example 2:

int[] arr1 = {1, 2, 2, 3};  
int[] arr2 = {2, 2, 3, 4};  
System.out.println(intersection(arr1, arr2));  
// Output: [2, 3]
✅ Duplicates are removed; 2 and 3 appear once in the result.

Example 3:
int[] arr1 = {1, 2, 3};  
int[] arr2 = {4, 5, 6};  
System.out.println(intersection(arr1, arr2));  
// Output: []
✅ No common elements, so the result is an empty list.

⚡ Time Complexity: ⏱
1️⃣ Building intersection Set:

O(N) where N is the length of arr1.
2️⃣ Checking Elements in arr2:

O(M) where M is the length of arr2.
contains and remove in a LinkedHashSet → O(1) average time.
✅ Total Time Complexity: O(N + M)

💾 Space Complexity: 🧠
1️⃣ intersection Set:

Stores up to N unique elements from arr1 → O(N).
2️⃣ result List:

Stores the intersection elements → O(min(N, M)).
✅ Total Space Complexity: O(N)

⚠️ Key Considerations:
1️⃣ Maintains insertion order in the result due to LinkedHashSet.
2️⃣ Avoids duplicate entries in the result list.
3️⃣ Efficiently handles edge cases like:

Empty arrays.
Arrays with no common elements.
Arrays with repeated elements.
🏆 Final Verdict:
✅ Time-Efficient (O(N + M))
✅ Space-Optimized (O(N))
✅ Handles duplicates and maintains order
✅ Clean and effective approach
 GFG LINK : https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/0
 */