// Written by Tarnala Sribatsa Patro on 29th August 2024

public class Fibonacci { 
    public static void main(String[] args) {
        // Print the first two numbers of the Fibonacci sequence
        System.out.print("0 1 ");

        for (int fVal = 0, sVal = 1, nVal = fVal + sVal; nVal <= 100; nVal = fVal + sVal) {
            // Print the next Fibonacci number
            System.out.print(nVal + " ");

            // Update the previous two values to move forward in the sequence
            fVal = sVal;
            sVal = nVal;
        }
    }
}
