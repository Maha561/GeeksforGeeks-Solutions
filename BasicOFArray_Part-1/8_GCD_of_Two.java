// Question : Given two positive integers a and b, find GCD of a and b.

//Note: Don't use the inbuilt gcd function
class Solution {
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
  

/* ✅ Code Explanation: 💡
The method gcd(int a, int b) computes the Greatest Common Divisor (GCD) of two integers using the Euclidean Algorithm. 🔢

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

Two integers a and b.
Logic (Euclidean Algorithm): 🔄

Base Case:
If b == 0, return a ✅ — because GCD(a, 0) = a.
Recursive Case:
Call gcd(b, a % b) — repeatedly reduce the problem size. 🔁
How It Works: 🧮

The GCD of two numbers doesn’t change if the larger number is replaced by its remainder when divided by the smaller.
This process repeats until the remainder is 0.
📊 Example Run: 🚀
Find GCD of 48 and 18:

gcd(48, 18) → 18 ≠ 0 → call gcd(18, 48 % 18) → gcd(18, 12)
gcd(18, 12) → 12 ≠ 0 → call gcd(12, 18 % 12) → gcd(12, 6)
gcd(12, 6) → 6 ≠ 0 → call gcd(6, 12 % 6) → gcd(6, 0)
gcd(6, 0) → 0 == 0 → return 6 ✅
Output: 6

⚡ Time Complexity: ⏱
The Euclidean Algorithm has a time complexity of O(log min(a, b)) due to rapid reduction at each step. 📉
✅ Total Time Complexity: O(log min(a, b)) 🚀

💾 Space Complexity: 🧠
Uses recursive calls, leading to a call stack depth of O(log min(a, b)).
✅ Total Space Complexity: O(log min(a, b)) (due to recursion)

 */
 // GFG Links : https://www.geeksforgeeks.org/problems/gcd-of-two-numbers3459/0  
