// Ali Cole
// My first Program

import java.awt.Toolkit; /*
imports extension that includes the 
programming to "beep" (when called upon) */
import java.util.Scanner; /*
imports extension that includes the 
programming to allow for user input (when called upon) */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); //prints Hello, World! in the terminal and then creates a new line
        Toolkit.getDefaultToolkit().beep(); //calls upon extention from earlier, plays a beep

        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?"); //prints What's your name? in the terminal and does not create a new line
        String name = input.nextLine(); //calls upon extenstion from earlier, asks for user input
        System.out.println("Hello, " + name + "!"); //prints Hello, then the string with the new user inputted value then !
    }
}
