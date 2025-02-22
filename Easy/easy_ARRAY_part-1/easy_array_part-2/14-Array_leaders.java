/* QUESTION : You are given an array arr of positive integers.
 Your task is to find all the leaders in the array.
  An element is considered a leader
   if it is greater than or equal to all elements to its right. 
   The rightmost element is always a leader. */
   class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> leader = new ArrayList<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                leader.add(max);
            }
        }
        // for(int j=leader.length()-1;i>=0;i--){
            //leader.add(j);
        //}//  we can perform this  aas leader is  arraylist
        
        Collections.reverse(leader);//to  perform  reverse operation in arraylist .we use this method called Collections.reverse() 
        return leader;
      
    }
}
/*✅ Code Explanation: 💡
The leaders method finds leader elements in an array.
A leader is an element that is greater than or equal 
to all elements to its right in the array.

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Initialize Maximum Variable 🔢
int max = Integer.MIN_VALUE;
ArrayList<Integer> leader = new ArrayList<Integer>();
max stores the maximum element found from the right side.
leader is an ArrayList<Integer> to store leader elements.
2️⃣ Traverse the Array from Right to Left 🔄

for(int i = arr.length - 1; i >= 0; i--) {
    if(arr[i] >= max) {
        max = arr[i];
        leader.add(max);
    }
}
We iterate backward (from last element to first).
If arr[i] is greater than or equal to max, it is a leader.
Update max = arr[i] and add it to the leader list.
3️⃣ Reverse the leader List 🔁
Collections.reverse(leader);
Leaders are collected in reverse order (right to left).
We use Collections.reverse(leader) to restore the correct order.
4️⃣ Return the Result 📋
return leader;
The function returns an ArrayList of leader elements in correct order.
📊 Example Runs: 🚀
Example 1:
int[] arr = {16, 17, 4, 3, 5, 2};  
System.out.println(leaders(arr));  
// Output: [17, 5, 2]
✅ Leaders are 17, 5, and 2 (since no elements to their right are larger).

Example 2:
int[] arr = {1, 2, 3, 4, 5};  
System.out.println(leaders(arr));  
// Output: [5]
✅ Only 5 is a leader (as no element is to its right).

Example 3:
int[] arr = {10, 9, 8, 7, 6};  
System.out.println(leaders(arr));  
// Output: [10, 9, 8, 7, 6]
✅ All elements are leaders, as each is greater than all elements to its right.

⚡ Time Complexity: ⏱
1️⃣ Looping through the array (right to left):

O(N), where N is the length of the array.
2️⃣ Reversing the list:

O(N) in worst case (when all elements are leaders).
✅ Total Time Complexity:
O(N)
💾 Space Complexity: 🧠
1️⃣ Leader ArrayList:

Stores at most N elements → O(N) in worst case.
2️⃣ Auxiliary Space:

Uses only a few extra variables (max and loop counters) → O(1).
✅ Total Space Complexity:
O(N)
(Optimal for storing results)

⚠️ Key Considerations:
1️⃣ Handles All Edge Cases:
✔️ All elements are leaders (descending order).
✔️ Only one leader (ascending order).
✔️ Empty array (returns an empty list).

2️⃣ Efficient Implementation:

O(N) time complexity (better than brute-force O(N²)).
3️⃣ Uses Collections.reverse() efficiently to avoid extra space.

🏆 Final Verdict:
✅ Time-Efficient → O(N)
✅ Space-Optimized → O(N)
✅ Simple, Clean, and Effective Approach 🚀
  GFG LINK : https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/
*/