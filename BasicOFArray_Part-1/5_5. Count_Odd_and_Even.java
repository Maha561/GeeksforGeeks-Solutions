/* question - Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.

Note: Return two elements where the first one in the count of odd & second one is the count of even. */

class Solution {
    public int[] countOddEven(int[] arr) {
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
        
    return new int[]{countOdd,countEven};
    }
}

/*✅ Explanation of the Code:
The method countOddEven(int[] arr) counts the number of odd and even integers in an array.

Step-by-Step Breakdown:
Input: An integer array arr.

Initialize Counters:

countEven = 0 — to count even numbers.
countOdd = 0 — to count odd numbers.
Iterate Over the Array:

Loop through each element arr[i]:
If arr[i] % 2 == 0, increment countEven.
Else, increment countOdd.
Return Result:

Returns an integer array: new int[]{countOdd, countEven}.
Index 0 holds the count of odd numbers.
Index 1 holds the count of even numbers.
Example:
For input arr = {1, 2, 3, 4, 5}:

Odd numbers: 1, 3, 5 → countOdd = 3
Even numbers: 2, 4 → countEven = 2
Output: [3, 2]

Time Complexity:
The method loops through the array once.
For an array of size n, the loop runs n times.
🔸 Total Time Complexity: O(n)

Space Complexity:
Uses only two integer counters (countOdd, countEven) and a result array of size 2.
🔸 Total Space Complexity: O(1) (since the extra space doesn’t grow with input size)

 */

 // GFG links : https://www.geeksforgeeks.org/problems/count-odd-even/0  