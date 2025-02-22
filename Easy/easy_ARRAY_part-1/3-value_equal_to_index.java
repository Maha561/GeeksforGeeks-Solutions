/* QUESTION : Given an array arr. 
Your task is to find the elements
 whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array 
which have the same value as its index. 
You need to include every such element's index. Follows 1-based indexing of the array. */
class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0;i<nums.size();i++){
            
            if(nums.get(i)==i+1){
                
                result.add(nums.get(i));
            }
        }    
        return result;  
    }
}
/* ✅ Code Explanation: 💡
The valueEqualToIndex method returns a list of elements 
whose value is equal to their 1-based index in the list. 🏆

🛠 Step-by-Step Breakdown: ⚡
Initialize Result List: 📋

List<Integer> result = new ArrayList<Integer>();  
result → Stores elements where value == index + 1.
Iterate Over List: 🔄

for (int i = 0; i < nums.size(); i++) {  
    if (nums.get(i) == i + 1) {  
        result.add(nums.get(i));  
    }  
}  
✅ Logic:

Loop through each element of nums.
Compare nums.get(i) with i + 1 (1-based index).
If they match, add the element to result. 🎯
Return Result List: 📋
return result;  
The final list contains all matching elements. 🚀
📊 Example Run: 🚀
Example 1:
List<Integer> nums = Arrays.asList(15, 2, 45, 4, 7);  
System.out.println(valueEqualToIndex(nums));  // Output: [2, 4]  
Steps:

Index 1 → Value 15 ≠ 1
Index 2 → Value 2 == 2 ✅
Index 3 → Value 45 ≠ 3
Index 4 → Value 4 == 4 ✅
Index 5 → Value 7 ≠ 5
Result: [2, 4]

Example 2:

List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);  
System.out.println(valueEqualToIndex(nums));  // Output: [1, 2, 3, 4, 5]  
All elements match their indices. 🎯

⚡ Time Complexity: ⏱
Iteration Over List: O(N)
✅ Total Time Complexity: O(N) 🚀
💾 Space Complexity: 🧠
Result List: O(K) — Where K is the number of matching elements.
✅ Total Space Complexity: O(K) 🎯
⚠️ Key Considerations:
Empty List: ⚠️

If nums is empty, returns an empty list.
No Matches: 🚫

If no elements match their index, returns an empty list.
1-Based Indexing: 💡

The comparison uses i + 1 to align with 1-based indexing.
🎯 Final Verdict:
✅ Efficient O(N) solution
✅ Handles edge cases gracefully
✅ Clean and readable code
GFG LINK : https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/0 
*/