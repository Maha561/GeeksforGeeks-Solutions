/*Given two integers, n and m. The task is to check the relation between n and m. Return "lesser" if n < m,  "equal" if n == m, and "greater" if n > m. */

class Solution {
    String compareNM(int n, int m) {
        if(n<m){
            return "lesser";
            
        }
        else if(n==m){
            return "equal";
        }
        
        
        else{
            return "greater";
        }
        // code here
        
    }
}   

/*Code Explanation:
The method compareNM(int n, int m) compares two integers n and m and returns:

"lesser" if n < m
"equal" if n == m
"greater" if n > m
Step-by-step flow:

Input: Two integers n and m.
Comparison:
If n is less than m, return "lesser".
If n is equal to m, return "equal".
If n is greater than m, return "greater".
Output: A string indicating the relation between n and m.
Time Complexity:
Each comparison (n < m, n == m, n > m) takes O(1) time.
The method uses at most 2 comparisons in the worst case.
🔸 Total Time Complexity: O(1) (constant time)

Space Complexity:
No extra space is used apart from a few variables and the returned string.
String literals like "lesser", "equal", and "greater" are constants.
🔸 Total Space Complexity: O(1) (constant space)

✅ Final Verdict:
Time Complexity: O(1)
Space Complexity: O(1)s
 */

 // GFG Links : https://www.geeksforgeeks.org/problems/java-if-else-decision-making0924/0   
 


