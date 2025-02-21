/* Question - Given a number n, determine whether it is a prime number or not. 
A prime number is a number greater than 1 
that has no positive divisors other than 1 and itself. */
class Solution {
    static boolean isPrime(int n) {
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
                
            }
            i++;
        }
        return true;
        
        
    }
}

/* ✅ Code Explanation: 💡
The method isPrime(int n) checks whether a given number n is a prime number 🔢.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

An integer n to check for primality.
Logic: 🔄

Initialize i = 2 — the smallest prime number.
Loop: While i < n, check if n is divisible by i.
If n % i == 0, it means n has a divisor other than 1 and itself, so it's not prime ❌ → return false.
Otherwise, increment i and continue the loop. 🔁
If the loop completes without finding a divisor, return true ✅ — indicating n is prime.
Edge Cases: ⚠️

This code will incorrectly return true for n <= 1, as 0 and 1 are not prime.
📊 Example Run: 🚀
Input: n = 7

Loop: 7 % 2 ≠ 0, 7 % 3 ≠ 0, 7 % 4 ≠ 0, ..., no divisors found.
Output: true ✅ (7 is prime)
Input: n = 9

Loop: 9 % 3 == 0 ➔ Divisible by 3.
Output: false ❌ (9 is not prime)
⚡ Time Complexity: ⏱
The loop runs from 2 to n-1 → up to (n - 2) iterations.
Worst-case time complexity: O(n) ⏳
🔴 Inefficient for large numbers — can be optimized (discussed below).

💾 Space Complexity: 🧠
Uses only a few variables (n, i).
No additional space that scales with input.
✅ Total Space Complexity: O(1) 🚀

 */
 //GFG links : https://www.geeksforgeeks.org/problems/prime-number2314/0  