/*QUESTION : When learning a new language,
 we first learn to output some message. 
 Here, we'll start with the famous Hello World message.
  Now, here you are given a function to complete. 
  Don't worry about the ins and outs of functions, 
  just add the command (System.out.print("Hello World")) 
  to print Hello World */

class Geeks {

    // Function to print hello
     void printHello() {
        System.out.println("Hello World");
        
    }
}
/*✅ Code Explanation: 💡
The printHello method in the Geeks class 
prints the classic "Hello World" message to the console. 🖨️🌍

🛠 Step-by-Step Breakdown: 🧩
1️⃣ Class Definition: 🏛️
class Geeks {
    // Function to print hello
}
The class Geeks encapsulates the method printHello.
No main method is included, so this class 
needs to be called from another class with a main method. 🏗️
2️⃣ Method Definition: 🛠️
void printHello() {
    System.out.println("Hello World");
}
void: The method returns nothing.
printHello: A method with no parameters.
System.out.println("Hello World");:
Prints "Hello World" followed by a newline.
System.out is the standard output stream in Java.
📊 Example Usage: 🚀
Example 1: Calling the Method
public class Main {
    public static void main(String[] args) {
        Geeks obj = new Geeks();  // Create an instance of Geeks
        obj.printHello();         // Call the printHello method
    }
}
✅ Output:
Hello World
⚡ Time Complexity: ⏱
The method performs a single print operation, which takes constant time.
✅ Total Time Complexity:
O(1)
💾 Space Complexity: 🧠
No additional data structures or variables are used.
✅ Total Space Complexity:
O(1)
⚠️ Key Considerations:
1️⃣ No Main Method in Geeks:

To run this code, it should be called from another class with a main method.
2️⃣ Enhancements:

You can modify the method to print custom messages:
void printMessage(String message) {
    System.out.println(message);
}
3️⃣ Static Alternative:

To avoid creating an object:
static void printHello() {
    System.out.println("Hello World");
}
Call it directly using:
Geeks.printHello();
🏆 Final Verdict:
✅ Simple and Effective Hello World Program
✅ Time Complexity: O(1)
✅ Space Complexity: O(1)
✅ Perfect for Java Beginners

🎉💯 "Hello World" — the first step towards Java mastery! 🚀🔥
GFG LINK : https://www.geeksforgeeks.org/problems/start-coding-java/0
 */ 