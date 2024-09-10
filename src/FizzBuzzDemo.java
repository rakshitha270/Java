import java.util.ArrayList;
import java.util.List;

class FizzBuzzDemo {

    // Method to generate FizzBuzz for numbers from 1 to n
    public List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of FizzBuzzDemo
        FizzBuzzDemo demo = new FizzBuzzDemo();

        // Set the value of n
        int n = 15; // You can change this to any number

        // Call the fizzBuzz method and store the result
        List<String> result = demo.fizzBuzz(n);

        // Print the result
        for (String s : result) {
            System.out.println(s);
        }
    }
}
