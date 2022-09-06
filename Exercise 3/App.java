// Array implementation of Stack
public class App {
    public static void main(String[] args) {
  
      // Create new Stack Object
      Stack Notebook_stack = new Stack(5);
  
      // Insert new elements into the stack
      Notebook_stack.push("Brown Notebook");
      Notebook_stack.push("Yellow Notebook");
      Notebook_stack.push("Blue Notebook");
      Notebook_stack.push("Pink Notebook");
  
      // Show the size of the stack
      System.out.println("The size of the stack is: " + Notebook_stack.size());
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Notebook_stack.peek());
  
      // Remove top element in the stack
      Notebook_stack.pop();
  
      System.out.println("After pop");
  
      // Show all elements in Stack
      Notebook_stack.printStack();
  
      // Show top element in the stack
      System.out.println("The top of the stack is: " + Notebook_stack.peek());
    }
  }
