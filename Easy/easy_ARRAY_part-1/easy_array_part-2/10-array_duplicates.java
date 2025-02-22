/* QUESTION : Given an array arr of integers, 
find all the elements that occur more than once in the array.
 If no element repeats, return an empty array. */
 class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        Set<Integer> unique = new HashSet<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();
        
        for(int num : arr){
            if(unique.contains(num)){
                duplicates.add(num);
            }
            else
            {
                unique.add(num);
                
            }
        }  
        return duplicates;   
    }
}
/*✅ Code Explanation: 💡
The findDuplicates method identifies 
and returns a list of duplicate elements in the given array.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Data Structures: 🗂️

Set<Integer> unique = new HashSet<Integer>();  
List<Integer> duplicates = new ArrayList<Integer>();  
unique Set: Tracks distinct elements encountered.
duplicates List: Stores elements that appear more than once.
2️⃣ Iterate Through the Array: 🔄
for (int num : arr) {  
    if (unique.contains(num)) {  
        duplicates.add(num);  
    } else {  
        unique.add(num);  
    }  
}
For each element num in arr:
✅ If it's already in unique, it's a duplicate → Add to duplicates.
🚀 If not, add it to the unique set.
3️⃣ Return the List of Duplicates: 📋
return duplicates;
Returns a list of all duplicate elements found in the array.
📊 Example Runs: 🚀
Example 1:
int[] arr = {1, 2, 3, 2, 4, 5, 3};  
System.out.println(findDuplicates(arr));  
// Output: [2, 3]
2 and 3 are duplicates. ✅
Example 2:
int[] arr = {1, 1, 1, 2, 2, 3};  
System.out.println(findDuplicates(arr));    
// Output: [1, 1, 2]   
Handles multiple duplicates.  
Returns all repeated instances.🎯
Example 3:
int[] arr = {1, 2, 3, 4, 5};  
System.out.println(findDuplicates(arr));  
// Output: []
No duplicates → Empty list returned. ✅
⚡ Time Complexity: ⏱
Each element is checked against the set:
contains and add in HashSet → O(1) average time.
✅ Total Time Complexity: O(N)
💾 Space Complexity: 🧠
Uses additional space for:
unique Set: O(N)
duplicates List: O(D) where D = number of duplicates
✅ Total Space Complexity: O(N)

⚠️ Key Considerations:
1️⃣ Duplicates in the output list can repeat if an element appears more than twice.
2️⃣ Maintains insertion order of duplicates.
3️⃣ Handles edge cases like empty arrays or arrays without duplicates.

🏆 Final Verdict:
✅ Optimal O(N) time complexity
✅ O(N) space usage for tracking elements
✅ Handles repeated duplicates correctly
✅ Efficient and clean solution
 GFG LINK : https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/0
   */
