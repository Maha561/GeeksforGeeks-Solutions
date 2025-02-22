// QUESTION : stack implementation using array


class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if(top==arr.length-1){
            return;
        }
        else{
            top++;
            arr[top]=x;
        }
        
        
    }

    public int pop() {
        if(top==-1){
            return -1;
        }
        else{
            int value = arr[top];
            top--;
            return value;
            
            
        }
        // Your Code
    }
}
/*✅ Code Explanation: 💡
The MyStack class implements a stack using an array with push and pop operations. It follows the LIFO (Last In, First Out) principle. 📥➡️📤

🛠 Step-by-Step Breakdown: ⚡
Class Variables: 📊

private int[] arr;  
private int top;  
arr → Array to store stack elements with a capacity of 1000. 📚
top → Index of the topmost element in the stack. 🎯
🔄 Methods:
1️⃣ Constructor — MyStack() 🏗

public MyStack() {  
    arr = new int[1000];  
    top = -1;  
}
Initializes arr[] with a size of 1000.
top = -1 indicates an empty stack.
2️⃣ Push Method — void push(int x) 📥
Purpose: Inserts an element x on top of the stack.

public void push(int x) {  
    if (top == arr.length - 1) {  
        return;  // Stack Overflow  
    } else {  
        top++;         // Move top pointer  
        arr[top] = x;  // Insert element  
    }  
}
✅ Logic:

Check Overflow: If top reaches arr.length - 1, stop insertion. ⚠️
Insert Element: Move top up and assign x to arr[top]. 🚀
3️⃣ Pop Method — int pop() 📤
Purpose: Removes and returns the top element from the stack.

public int pop() {  
    if (top == -1) {  
        return -1;  // Stack Underflow  
    } else {  
        int value = arr[top];  // Get top element  
        top--;                 // Move top pointer down  
        return value;          // Return popped element  
    }  
}
✅ Logic:

Check Underflow: If top == -1, the stack is empty — return -1. 🚫
Pop Element: Return arr[top] and move top down. 🎯
📊 Example Run: 🚀
Example 1:

MyStack s = new MyStack();  

s.push(10);  
s.push(20);  
System.out.println(s.pop());  // Output: 20  
s.push(30);  
System.out.println(s.pop());  // Output: 30  
System.out.println(s.pop());  // Output: 10  
System.out.println(s.pop());  // Output: -1 (Stack is empty)  
✅ Stack State:

Initial: []  
After push(10): [10]  
After push(20): [10, 20]  
After pop(): [10]  
After push(30): [10, 30]  
After pop(): [10]  
After pop(): []  
⚡ Time Complexity: ⏱
Push: O(1) — Direct insertion at top.
Pop: O(1) — Direct removal from top.
✅ Total Time Complexity: O(1) per operation. 🚀
💾 Space Complexity: 🧠
Array size: O(N) — Predefined array of size 1000.
✅ Total Space Complexity: O(N) 🎯
⚠️ Key Considerations:
Stack Overflow: ⚠️

The push method stops adding elements if the stack is full.
Stack Underflow: ⚠️

The pop method returns -1 when the stack is empty.
Optimization Tip: 💡

Use dynamic resizing (like ArrayList or LinkedList) for flexible stack size. 🔄
🎯 Final Verdict:
✅ Efficient O(1) operations
✅ Handles overflow/underflow correctly
✅ Simple and functional array-based stack 
GFG LINK : https://www.geeksforgeeks.org/problems/implement-stack-using-array/0 */