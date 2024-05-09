class Stack {


    // Any problem you faced while coding this : NA
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top == 0? true : false;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top = 0;
    }
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top <  MAX){
            a[top++] = x;
            return true;
        } else{
            return false;
        }
    }
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(!isEmpty()){
            return a[--top];
        } else{
            return 0;
        }
    }
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    int peek() 
    { 
        //Write your code here
        return a[top - 1];
    } 
} 
  
// Driver code 
class Excercise_1 {
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30);
        System.out.println("Top element is " + s.peek());
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.pop() + " Popped from stack");
    } 
}
