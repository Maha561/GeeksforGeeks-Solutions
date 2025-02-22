/* QUESTION : Implement a Queue using an Array.
 Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue 
and print the popped element. If the queue is empty then return -1)

We just have to implement the functions push and pop 
and the driver code will handle the output. */





class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(rear==arr.length-1){
	        return;
	    }
	    else{
	        
	        arr[rear]=x;
	        rear++;
	    }
	    // Your code here
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(front==rear){
	        return -1;
	        
	    }
	    else{
	        int value=arr[front];
	        front++;
	        return value;
	        
	    }
		// Your code here
	} 
}
/*✅ Code Explanation: 💡
The MyQueue class implements a simple queue using an array with push and pop operations. It follows the FIFO (First In, First Out) principle. 📋➡️📋

🛠 Step-by-Step Breakdown: ⚡
Class Variables: 📊

int front, rear;  
int arr[] = new int[100005];  
front → Points to the front of the queue. 🎯
rear → Points to the next insertion position. 📥
arr[] → Array to store queue elements with a capacity of 100005. 📚
🔄 Methods:
1️⃣ Constructor — MyQueue() 🏗

MyQueue() {  
    front = 0;  
    rear = 0;  
}
Initializes front and rear pointers to 0, representing an empty queue.
2️⃣ Push Method — void push(int x) 📥
Purpose: Adds an element x to the rear of the queue.

void push(int x) {  
    if (rear == arr.length - 1) {  
        return;  // Queue is full  
    } else {  
        arr[rear] = x;  // Insert element  
        rear++;         // Move rear pointer  
    }  
}
✅ Logic:

Check Overflow: If rear reaches array capacity, stop insertion. ⚠️
Insert Element: Place x at arr[rear] and increment rear. 🚀
3️⃣ Pop Method — int pop() 📤
Purpose: Removes and returns the front element from the queue.

int pop() {  
    if (front == rear) {  
        return -1;  // Queue is empty  
    } else {  
        int value = arr[front];  // Get front element  
        front++;                 // Move front pointer  
        return value;            // Return popped element  
    }  
}
✅ Logic:

Check Underflow: If front == rear, the queue is empty — return -1. 🚫
Pop Element: Return arr[front] and move front forward. 🎯
📊 Example Run: 🚀
Example 1:

MyQueue q = new MyQueue();  

q.push(10);  
q.push(20);  
System.out.println(q.pop());  // Output: 10  
q.push(30);  
System.out.println(q.pop());  // Output: 20  
System.out.println(q.pop());  // Output: 30  
System.out.println(q.pop());  // Output: -1 (Queue is empty)  
✅ Queue State:


Initial: []  
After push(10): [10]  
After push(20): [10, 20]  
After pop(): [20]  
After push(30): [20, 30]  
After pop(): [30]  
After pop(): []  
⚡ Time Complexity: ⏱
Push: O(1) — Direct insertion at rear.
Pop: O(1) — Direct removal from front.
✅ Total Time Complexity: O(1) per operation. 🚀
💾 Space Complexity: 🧠
Array size: O(N) — Predefined array of size 100005.
✅ Total Space Complexity: O(N) 🎯
⚠️ Key Considerations:
Queue Overflow: ⚠️

The push method stops adding elements if the queue is full.
Queue Underflow: ⚠️

The pop method returns -1 when the queue is empty.
Optimization Tip: 💡

To reuse freed space after pop operations, consider implementing a circular queue. 🔄
🎯 Final Verdict:
✅ Efficient O(1) operations
✅ Handles overflow/underflow correctly
✅ Simple and functional array-based queue
 GFG LINK : https://www.geeksforgeeks.org/problems/implement-queue-using-array/0*/  