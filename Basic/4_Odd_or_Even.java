// question - Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

class Solution {
    static boolean isEven(int n) {
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
        // code here
    }
}


/*✅ Explanation of the Code:
The method isEven(int n) checks if a given integer n is even.

Step-by-Step Breakdown:
Input: An integer n.

Check Even/Odd:

Uses the modulo operator: n % 2.
If n % 2 == 0, the number is even, so return true.
Otherwise, return false.
Example:

isEven(4) → 4 % 2 == 0 → returns true.
isEven(7) → 7 % 2 == 1 → returns false.
Time Complexity:
The modulo operation n % 2 takes O(1) time.
🔸 Total Time Complexity: O(1) (constant time)

Space Complexity:
No extra space is used other than for the input and the returned boolean.
🔸 Total Space Complexity: O(1) (constant space)

 */

 
 // GFG Links : https://www.geeksforgeeks.org/problems/odd-or-even3618/0  

