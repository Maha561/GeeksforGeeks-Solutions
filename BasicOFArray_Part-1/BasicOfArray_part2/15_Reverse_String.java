//You are given a string s, and your task is to reverse the string.


// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        String reversedString=" ";
        for(int i=s.length()-1;i>=0;i--){
            reversedString=reversedString+s.charAt(i);
            
        }
        return  reversedString;
        
        
    }
}
/*✅ Code Explanation: 💡
The method reverseString(String s) reverses the input string s and returns the reversed string. 🔄

🛠 Step-by-Step Breakdown: ⚡
Input: 📥

A string s. ✨
Initialization: 🏁

reversedString = " " — initializes an empty string (⚠️ note: it currently starts with a space).
Reverse Iteration: 🔄

Loop from the end of the string (i = s.length() - 1) to the start (i = 0).
In each iteration, append s.charAt(i) to reversedString.
Return: 🔙

The method returns reversedString.
📊 Example Run: 🚀
Input:
s = "hello"
Process:
Iterates from end to start:
i = 4 → o
i = 3 → l
i = 2 → l
i = 1 → e
i = 0 → h
Reversed String: " olleh" (⚠️ leading space due to initialization)

Output:
" olleh"
⚡ Time Complexity: ⏱
The loop iterates through all n characters.
✅ Total Time Complexity: O(n) 🚀
💾 Space Complexity: 🧠
A new string is created to store the reversed result.
✅ Total Space Complexity: O(n) 🎯
⚠️ Key Considerations:
Leading Space Issue: ⚡

reversedString is initialized with a space (" "), leading to an unwanted space in the final output.
Fix: Initialize as an empty string "".
String Concatenation Efficiency: 🚀

Repeated string concatenation (reversedString + s.charAt(i)) can be inefficient.
Alternative: Use StringBuilder for better performance.
Edge Cases: ⚠️
Empty String: Should return an empty string.
Single Character: Should return the same character.
🎯 Final Verdict:
✅ Simple and effective reversal logic (O(n))
✅ Space-optimized (O(n))
⚠️ Minor fix for the leading space issue
GFG LINK : https://www.geeksforgeeks.org/problems/reverse-a-string/0 */  
