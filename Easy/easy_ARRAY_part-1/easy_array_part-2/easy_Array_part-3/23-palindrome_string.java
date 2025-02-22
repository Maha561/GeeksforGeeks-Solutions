/*QUESTION : You are given a string s. 
Your task is to determine if the string is a palindrome. 
A string is considered a palindrome 
if it reads the same forwards and backwards. */
class Solution {
    boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    
    }
}
/*✅ Code Explanation: 💡
The isPalindrome method checks if a given string s is a palindrome
 — meaning it reads the same forwards and backwards. 🔄✨

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Two Pointers: 🎯

int left = 0;  
int right = s.length() - 1;  
left starts at the beginning of the string (index 0).
right starts at the end of the string (s.length() - 1).
These two pointers will move towards the center, comparing characters. 🏃‍♂️🏃‍♀️

2️⃣ Compare Characters: 🔄

while (left < right) {  
    if (s.charAt(left) != s.charAt(right)) {  
        return false;  
    }  
    left++;  
    right--;  
}  
The while loop runs as long as left < right.
s.charAt(left) is compared with s.charAt(right):
If they don’t match, the string isn’t a palindrome → return false. ❌
If they match, move the pointers towards the center:
left++ ➔ moves right.
right-- ➔ moves left.
3️⃣ Return Result: ✅
return true;  
If the loop completes without finding mismatched characters, 
the string is a palindrome → return true. 🎉
📊 Example Runs: 🚀
Example 1:
String s = "madam";  
isPalindrome(s);  
// Output: true  
✅ Explanation:

Characters match: m == m, a == a, and d in the center.
Example 2:
String s = "hello";  
isPalindrome(s);  
// Output: false  
✅ Explanation:

First mismatch at h != o → returns false.
Example 3:
String s = "racecar";  
isPalindrome(s);  
// Output: true  
✅ Explanation:

All pairs match: r == r, a == a, c == c, and e in the center.
Example 4:
String s = "a";  
isPalindrome(s);  
// Output: true  
✅ Explanation:

Single-character strings are always palindromes.
Example 5:
String s = "";  
isPalindrome(s);  
// Output: true  
✅ Explanation:

An empty string is considered a palindrome.
⚡ Time Complexity: ⏱
The method compares N/2 character pairs, where N is the string length.
Each comparison is O(1).
✅ Total Time Complexity:
O(N)  
💾 Space Complexity: 🧠
Uses only two pointers (left and right).
No extra space proportional to input size.
✅ Total Space Complexity:
O(1)  
⚠️ Key Considerations:
1️⃣ Case Sensitivity & Special Characters:

The current code is case-sensitive ("Madam" will return false).
It also considers spaces and punctuation 
("A man, a plan, a canal, Panama" will return false).
To handle these, consider:
s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
2️⃣ Edge Cases Handled:

Empty String ✅
Single Character ✅
Even and Odd Length Strings ✅
🏆 Final Verdict:
✅ Efficient Palindrome Checker
✅ Time Complexity: O(N)
✅ Space Complexity: O(1)
✅ Simple and Readable Solution

💯 A clean and effective approach for palindrome checking! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/palindrome-string0817/0
 */ 
 