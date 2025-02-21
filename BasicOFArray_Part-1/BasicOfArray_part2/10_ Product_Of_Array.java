/* Question : Given an array, arr[] of positive integers.
 Your task is to return the product of array elements 
 under the given modulo, mod with the value of 1000000007.
Note: The modulo operation finds the remainder after the
 division of one number by another. 
 For example, k(mod(m))=k%m= remainder obtained when k is divided by m */
 

// User function Template for Java

/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        long  n=arr.length;
        long product=1;
        long mod=1000000007;
        
        for(int i=0;i<n;i++){
            
            product=(product*arr[i])%mod;
        }
        return product;
        // your code here
    }
}
/*✅ Code Explanation: 💡
The method product(long arr[]) computes the product ✖️ of all elements in the array, applying modulo 10⁹ + 7 (1000000007) at each step to prevent integer overflow.

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

A long array arr[] containing the numbers to multiply.
Initialization: 🏁

n = arr.length — stores the length of the array. 📏
product = 1L — accumulator for the product. ✖️
mod = 1000000007L — used to apply modulo at each step, preventing overflow. 🔢
Iterate Over the Array: 🔄

Loop from i = 0 to n - 1:
Multiply product by arr[i].
Apply modulo to keep the product within bounds:
product = (product * arr[i]) % mod;
Return Result: 🖨

After processing all elements, return the final product. ✅
📊 Example Run: 🚀
Input: arr = {3, 5, 2}

Calculation:

Start with product = 1
Multiply and apply modulo at each step:
(1 * 3) % 10⁹+7 = 3
(3 * 5) % 10⁹+7 = 15
(15 * 2) % 10⁹+7 = 30
Output: 30 ✅

⚡ Time Complexity: ⏱
The loop runs over n elements, performing constant time operations per iteration.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
Uses a constant number of variables (product, mod, n).
No additional space based on input size.
✅ Total Space Complexity: O(1) 🎯

⚠️ Key Considerations:
Why Apply Modulo? 🔢

To prevent integer overflow with large numbers.
Keeps intermediate and final results within the long data type range.
Edge Cases: ⚠️

Empty Array: Returns 1 (as multiplying no numbers defaults to 1).
Array with Zero: If any element is 0, the final product will be 0.
🎯 Final Verdict:
✅ Efficient (O(n))
✅ Overflow-safe using modulo
✅ Space-optimized (O(1))
  GFG LINK :https://www.geeksforgeeks.org/problems/product-of-array-element/0 */   

