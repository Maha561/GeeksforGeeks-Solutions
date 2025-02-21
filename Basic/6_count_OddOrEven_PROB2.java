/*Question : Given an array arr[]. 
The task is to find the number of odd and even elements in the array.*/

class Solution {
    public static void countOddEven(Integer arr[]) {
        
        
        

        int countEven =0;
        int countOdd =0;
        for(int i =0;i<arr.length;i++){
            
            if(arr[i]%2==0){
                
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        
        System.out.println(countOdd+" "+countEven);
        
    }
}

/*✅ Code Explanation: 💡
The method countOddEven(Integer arr[]) counts how many odd 🔴 and even 🔵 numbers exist in the given array and prints the result.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An array of Integer objects arr[].
Initialization: 🏁

countEven = 0 🔵 — to count even numbers.
countOdd = 0 🔴 — to count odd numbers.
Loop through the array: 🔄

For every element num in arr[]:
Null Check: ✅ If num != null (prevents NullPointerException).
If num % 2 == 0, increment countEven 🔵.
Else, increment countOdd 🔴.
Output: 🖨

Prints the counts in the format:
"🔴 Odd count: X, 🔵 Even count: Y
⏱ Time Complexity: ⚡
The loop iterates through the array once.
For an array of size n, it takes O(n) time. 🔄
✅ Total Time Complexity: O(n) 🚀

💾 Space Complexity: 🧠
Uses constant space — just two counters (countOdd 🔴 and countEven 🔵).
No extra space that scales with input.
✅ Total Space Complexity: O(1) 🎯 */


// GFG links : https://www.geeksforgeeks.org/problems/count-odd-even-java/0  