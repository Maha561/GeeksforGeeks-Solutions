/* Question : Given an array, arr[] of positive integers.
 Your task is to return the product of array elements under
  the given modulo, mod with the value of 1000000007.
Note: The modulo operation finds the remainder after the division 
of one number by another. 
For example, k(mod(m))=k%m= remainder obtained when k is divided by m */
class Solution {
    public static long product(long arr[]) {
        long  n=arr.length;
        long product=1;
        long mod=1000000007;
        
        for(int i=0;i<n;i++){
            
            product=(product*arr[i])%mod;
        }
        return product;
        
    }
}


/* ✅ Code Explanation: 💡
The method product(long arr[]) calculates the product ✖️ of all elements in the array under modulo 10⁹ + 7 (1000000007) to avoid integer overflow.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

A long array arr[] containing numbers to multiply.
Initialization: 🏁

product = 1L — holds the ongoing product result. ✖️
mod = 1000000007L — a large prime number used to apply modulo and keep results within bounds. 🔢
Iterate Over the Array: 🔄

Loop from i = 0 to n - 1:
Multiply product with arr[i].
Apply modulo to prevent overflow:
product = (product * arr[i]) % mod;
Return Result: 🖨

After the loop, return the final product. ✅
📊 Example Run: 🚀
Input: arr = {2, 3, 4}

Calculation:

Start with product = 1
Multiply and apply modulo at each step:
(1 * 2) % 10⁹+7 = 2
(2 * 3) % 10⁹+7 = 6
(6 * 4) % 10⁹+7 = 24
Output: 24 ✅

⚡ Time Complexity: ⏱
The loop iterates over n elements, processing each in O(1) time.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses only a few variables (product, mod).
No extra space scales with input size.
✅ Total Space Complexity: O(1) 🎯

⚠️ Key Considerations:
Why Apply Modulo? 🔢

To avoid integer overflow, especially with large arrays or big numbers.
Ensures the result stays within the range of a long.
Edge Cases: ⚠️

Empty Array: Returns 1 (since product of no numbers is 1).
Array with Zero: Any zero in the array will result in a product of 0.
🎯 Final Verdict:
✅ Efficient (O(n))
✅ Overflow-safe using modulo
✅ Space-optimized (O(1)) 
*/
// GFG link :https://www.geeksforgeeks.org/problems/product-of-array-element/0  