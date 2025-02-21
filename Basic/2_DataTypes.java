// question - data types

class Geeks{
    
    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d){
        
        double p =c/b ;//c/b
        double q =b/a ;//b/a
        double r =c/a;//c/a
        double m =r+l ;//r+l
        int s =a/d ;//a/d
        
        //Printing all the results 
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
    }
}


// explanation
/* Explanation of Optimized Code

1. Directly compute all operations inside System.out.println() instead of storing them in separate variables.


2. (c/b), (b/a), (c/a), ((c/a) + l), and (a/d) are computed and printed in a single statement.


3. Eliminates unnecessary variable declarations, reducing memory usage.



Time Complexity

Each arithmetic operation (division, addition) runs in O(1) time.

Printing is O(1).

Overall time and space complexity : O(1). */


// GFG Links : https://www.geeksforgeeks.org/problems/data-types-java/0 

