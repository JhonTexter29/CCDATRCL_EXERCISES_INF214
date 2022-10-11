import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Classmates = new LinkedList<>();

        // Adds elements to the queue
        Classmates.add("Estimadora, Jhon Texter");
        Classmates.add("Bablis, Winna Jane");
        Classmates.add("Papina, Marianne Jovi");
        Classmates.add("Vargas, Jethro Ruiz");
        Classmates.add("Laureano, Neal Allen");

        // Display all elements of the queue.
        System.out.println(Classmates);

        // Returns the number of elements in the queue.
        System.out.println(Classmates.size());

        // Shows the element at the front of the queue
        System.out.println(Classmates.peek());

         // Removes the element at the front of the queue
         Classmates.remove();
         Classmates.remove();
         Classmates.remove();
         Classmates.remove();
         Classmates.remove();

        // Display all elements of the queue.
        System.out.println(Classmates);

        Classmates.add("Gavin, Kyle Torres");
        Classmates.add("Gonzales, Marvin John");
        Classmates.add("Calalang, Victor Vinnie Lars");
        Classmates.add("Tenerife, Tristan Angelo");
        Classmates.add("Dapitillo, Kean John");

          // Display all elements of the queue.
          System.out.println(Classmates);

          // Returns the number of elements in the queue.
          System.out.println(Classmates.size());
  
          // Shows the element at the front of the queue
          System.out.println(Classmates.peek());
  

    }
}
