package Practice_Java;

import java.util.Scanner; // Import Scanner class to take input from user

public class Lab_Reverse_Particular_String__Full_String {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter full sentence
        System.out.println("Enter Full String");

        // Read complete line (including spaces)
        String str = sc.nextLine().trim(); 
        // Example: "I love laptop coding"

        // Print original string
        System.out.println("Actual Full String: " + str);

        // Ask user to enter target word
        System.out.println("Enter target String");

        // Read target word
        String target = sc.nextLine().trim(); 
        // Example: "laptop"

        // Print target
        System.out.println("Target String: " + target);

        // Split sentence into words using space
        String[] revarr = str.split(" ");
        // Example: ["I", "love", "laptop", "coding"]

        // Get number of words
        int leng = revarr.length;

        // Store final result
        String result = "";

        // OUTER LOOP → iterate each word
        for (int i = 0; i < leng; i++) {

            // Check if current word matches target
            if (revarr[i].equalsIgnoreCase(target)) {

                // Create empty string to store reversed word
                String rev = "";
                
                int MatchedStringleng=revarr[i].length() - 1;
                
                // INNER LOOP → reverse characters of word
                for (int j = MatchedStringleng ; j >= 0; j--) {

                    // Add characters from end to start
                    rev = rev + revarr[i].charAt(j);

                    // Example:
                    // laptop → p → po → pot → potp → potpa → potpal
                }

                // Add reversed word to result
                result = result + rev + " ";
            } 
            else {
                // If not target → keep word as it is
                result = result + revarr[i] + " ";
            }
        }

        // Print final result (trim removes extra space at end)
        System.out.println("Target string is reversed: " + result.trim());

        // Close scanner
        sc.close();
    }
}