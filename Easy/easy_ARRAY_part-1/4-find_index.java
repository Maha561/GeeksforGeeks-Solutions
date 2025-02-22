/* Given an unsorted array arr[] of integers 
and a key which is present in this array.
 You need to write a program to find the start index
 ( index where the element is first found from left in the array ) 
  and end index( index where the element is first found from right in the array ) 
  return an array of length 2 with elements start index and end index.
  (0 based indexing is used)

If the key does not exist in the array then return -1 
for both start and end index in this case. */


// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        
        int result[] = new int[2];
        
        result[0] =-1;
        result[1] =-1;
        
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]==key){
                
                result[0]=i;
                
                break;// to stop at the first occurence itself
                
            }
        }
        
        for(int i = arr.length-1;i>=0;i--){
            
            if(arr[i]==key){
                
                result[1] = i;
                
                break;
                
            }
        }   
    return result;      
    }
}
/*✅ Code Explanation: 💡
The findIndex method finds the first and last occurrence of a given key
 in the array and returns their indices. 🏆

🛠 Step-by-Step Breakdown: ⚡
Initialize Result Array: 📋

int result[] = new int[2];  
result[0] = -1;  // For first occurrence  
result[1] = -1;  // For last occurrence  
result[0] → Stores the index of the first occurrence of key.
result[1] → Stores the index of the last occurrence of key.
Initialized to -1 to indicate "not found". 🚫
Find First Occurrence: 🔍

for(int i = 0; i < arr.length; i++) {  
    if(arr[i] == key) {  
        result[0] = i;  // Store first occurrence  
        break;  // Exit loop after finding  
    }  
}  
✅ Logic:
Iterates from start to end.
Stops at the first match using break. 🚀
Find Last Occurrence: 🔄

for(int i = arr.length - 1; i >= 0; i--) {  
    if(arr[i] == key) {  
        result[1] = i;  // Store last occurrence  
        break;  // Exit loop after finding  
    }  
}  
✅ Logic:
Iterates from end to start.
Stops at the first match from the end (i.e., the last occurrence). 🎯
Return Result: 🎯

return result;  
Returns an array [firstIndex, lastIndex].
If the key isn’t found, returns [-1, -1]. 🚫
📊 Example Run: 🚀
Example 1:

int[] arr = {1, 2, 3, 4, 2, 5, 2};  
int key = 2;  
System.out.println(Arrays.toString(findIndex(arr, key)));  // Output: [1, 6]  
Steps:

First occurrence of 2: at index 1.
Last occurrence of 2: at index 6.
Result: [1, 6]

Example 2:

int[] arr = {5, 7, 8, 9};  
int key = 3;  
System.out.println(Arrays.toString(findIndex(arr, key)));  // Output: [-1, -1]  
3 is not present in the array.
Result: [-1, -1] 🚫
⚡ Time Complexity: ⏱
First Loop: O(N)
Second Loop: O(N)
✅ Total Time Complexity: O(N) 🚀

💾 Space Complexity: 🧠
Result Array: O(1)
No extra space apart from the result.
✅ Total Space Complexity: O(1) 🎯

⚠️ Key Considerations:
Key Not Found: 🚫

Returns [-1, -1] if the key doesn’t exist.
Single Occurrence: 🎯

Both first and last indices will be the same.
Multiple Occurrences: 🔄

Correctly identifies the first and last positions.
Empty Array: ⚠️

Returns [-1, -1] for an empty input array.
🎯 Final Verdict:
✅ Efficient O(N) solution
✅ Handles all edge cases
✅ Simple and clear logic 
GFG LINK : https://www.geeksforgeeks.org/problems/find-index4752/0 
*/