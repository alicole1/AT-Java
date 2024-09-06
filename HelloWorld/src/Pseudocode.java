/*
 * EXAMPLE PSEUDOCODE
 * What does the math look like?
 *  - 100
 *  - 5% mapr
 *  - 0.05 x 100 = 5
 *  - 100 + 5 = 105
 *  - 105 * 105 = x
 *  - 105 + x = ...
 * 
 * What do we need to know?
 *  - Ask the user for the initial investment amount.
 *  - Ask the user for the APY rate.
 *  - Ask the user for the investment term (in years).
 *  - Calculate and display the account balance each year over the life of the investment.
 * 
 * What might this look like?
 *  - Print the user prompt on the screen
 *  - Get input from the user through the keyboard.
 *  - Store the information in memory
 * 
 * Pseudocode Solution:
 *  - Prompt user for initial investment
 *      - Display prompt
 *      - Get input from keyboard
 *      - Store info in memory
 *  - Prompt user for APY
 *      - Display prompt
 *      - Get input from keyboard
 *      - Store info in memory
 *  - Prompt user for Term 
 *      - Display prompt
 *      - Get input from keyboard
 *      - Store info in memory
 *  - Current year = 0
 *  - Balance = Initial Investment
 *  - Repeat until Current Year equals N (where N is the number of years):
 *      - Current Year = Current Year + 1
 *      - Interested Earned = Balance * APY
 *      - Balance = Balance + Interest Earned
 *      - Print Current Year and Balance to the screen
 */

/*
 * PSEUDOCODE ALGORITHM HOMEWORK PART 1
 * Making mac and cheese (kraft):
 *  - Determine how many batches of mac and cheese to make
 *      - Define new variable as numberOfBatches
 *  - Gather ingredients
 *      - 6 cups of water * numberOfBatches
 *      - Box of macaroni * numberOfBatches
 *      - 1/2 cup of butter * numberOfBatches
 *      - 1/4 cup of milk * numberOfBatches
 *      - Cheese sauce mix packages * numberOfBatches
 *  - Make the mac and cheese
 *      - Pour water into pot. Wait until isBoiling = true
 *      - Pour macaroni into pot. 
 *      - If time = 3 minutes, stir pot, else wait
 *      - If time = 6 minutes, stir pot, else wait
 *      - If time = 8 minutes, drain pot of water, else wait
 *      - If time > 9 minutes, break out of loop
 *      - Pour butter, milk, and the contents of cheese sauce mix packages into pot
 *      - Mix well
 *      - Serve :)
 */

/*
 * PSEUDOCODE ALGORITHM HOMEWORK PART 2
 * Installing carpet costs:
 *  - Prompt user for length of room
 *      - Display prompt
 *      - Get input from keyboard
 *      - Store info in memory 
 *      - Set value to variable length
 *  - Prompt user for width of room
 *      - Display prompt
 *      - Get input from keyboard
 *      - Store info in memory
 *      - Set value to variable width
 *  - Prompt user for cost of desired carpet
 *      - Display prompt
 *      - Get info from keyboard
 *      - Store info in memory
 *      - Set value to variable costPerSqrFoot
 *  - Print a line to user stating estimated cost
 *      - Define variable estimatedCost as length * width * costPerSqrFoot
 *      - Display prompt stating "Your total is" + variable estimatedCost
 */


/*
* Pseudocode to real code : using help from Alex Moore :)
*/ 

import java.util.Scanner;

public class Pseudocode { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length? ");
        int length = input.nextInt();
        System.out.println("What is the width? ");
        int width = input.nextInt();
        System.out.println("What is the unit cost of your desired carpet? ");
        int costPerSqrFoot = input.nextInt();
        int estimatedCost = length * width * costPerSqrFoot;
        System.out.println("Your total is " + estimatedCost);
        input.close();
    }
}

/*
 * PSEUDOCODE ALGORITHM HOMEWORK PART 3
 * Finding the value of pi to 6 digits
 *  - Define some baseline variables
 *      - Define a new variable "currentSolution" and set = 1
 *      - Define a new variable "roundNumber" and set = 1
 *  - Start loop
 *      - Set variable "fraction" = (-1)^roundNumber * 1/(roundNumber*2 + 1)
 *      - Set variable "currentSolution" = currentSolution+fraction
 *      - If currentSolution * 4 has less than 6 significant digits...
 *          - Rerun loop
 *      - Else, break loop
 *  - Inform the user
 *      - Display "A solution has been reached! Our answer is " + currentSolution * 4
 */