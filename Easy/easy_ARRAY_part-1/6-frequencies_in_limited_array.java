/* QUESTION : You are given an array arr[] containing positive integers. 
The elements in the array arr[] range from 1 to n 
(where n is the size of the array), 
and some numbers may be repeated or absent.
 Your task is to count the frequency of all numbers in the range 1 to n
  and return an array of size n 
  such that result[i] represents the frequency of the number i (1-based indexing). */
class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        int n=arr.length;
        int[] result = new int[n];
        for(int i=0;i<=arr.length-1;i++){
            result[arr[i]-1]++;
        }
        List<Integer> resultList = new  ArrayList<>( );
        for(int i=0;i<arr.length;i++){
            resultList.add(result[i]);
        }
        return resultList;
    }
}
/*✅ Code Explanation: 💡
The frequencyCount method counts the frequency of elements 
from 1 to N in the array and returns a List of frequencies. 📋🎯

🛠 Step-by-Step Breakdown: ⚡
Initialize Variables: 🔢

int n = arr.length;  
int[] result = new int[n];  
n holds the length of the array.
result[] is an auxiliary array initialized to store frequencies of numbers from 1 to N.
Count Frequencies: 🔍

for(int i = 0; i <= arr.length - 1; i++) {  
    result[arr[i] - 1]++;  
}  
✅ Logic:

Iterates over each element in arr.
arr[i] - 1 maps values from 1 to N to the 0-based index.
result[arr[i] - 1]++ increments the frequency count.
⚠️ Edge Case Alert:

If arr[i] > n or arr[i] < 1, this could cause IndexOutOfBoundsException.
Convert Result to List: 📋
List<Integer> resultList = new ArrayList<>();  
for(int i = 0; i < arr.length; i++) {  
    resultList.add(result[i]);  
}  
return resultList;  
Converts the result[] array into a List<Integer> for the final output.
Ensures the result follows the expected return type.
📊 Example Run: 🚀
Example 1:

int[] arr = {2, 3, 2, 3, 5};  
System.out.println(frequencyCount(arr));  // Output: [0, 2, 2, 0, 1]  
Steps:

Elements: 2 → 2 → 3 → 3 → 5
Frequencies:
1 → 0
2 → 2
3 → 2
4 → 0
5 → 1
Example 2:

int[] arr = {1, 1, 1, 1};  
System.out.println(frequencyCount(arr));  // Output: [4, 0, 0, 0]  
All elements are 1.
Frequency of 1 → 4, others → 0.
⚡ Time Complexity: ⏱
Counting Pass: O(N)

Loops through the array once to count frequencies.
Conversion to List: O(N)

Converts the result array to a list.
✅ Total Time Complexity: O(N) 🚀

💾 Space Complexity: 🧠
Uses an extra array result[] of size N.
Plus, the List<Integer> for the final result.
✅ Total Space Complexity: O(N) 🎯

⚠️ Key Considerations:
Invalid Elements: 🚫

If any element in arr is < 1 or > N, the current code will break.
Fix: Add bounds checking in the counting loop.
No Modification in Original Array: 🛡

The original arr is untouched, and a new list is returned.
Empty Array: 📭

Returns an empty list if arr.length == 0.
⚡ Improved Counting Loop (with Bound Check):
java
Copy
Edit
for(int i = 0; i < arr.length; i++) {  
    if(arr[i] >= 1 && arr[i] <= n) {  
        result[arr[i] - 1]++;  
    }  
}
🚀 This will ensure that invalid elements are skipped safely. ✅

🎯 Final Verdict:
✅ Efficient O(N) solution
✅ Proper conversion to List
✅ Needs bounds check for robustness
  GFG LINK : https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
  */