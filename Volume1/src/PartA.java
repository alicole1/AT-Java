/*
 * Ali Cole
 * SW Design with Java
 * HW 03;
 */


import java.util.Scanner;

// This program calculates and displays volumes of soda
public class PartA {
    public static void main(String[] args) throws Exception { //this is the entry point into our program.
        int cansPerPack = 6; 
            /* 
            * variable of type int. 
            * set to number of cans
            */
        
        final double CAN_VOLUME = 0.355; 
            /* 
            * constant of type double. 
            * shows how much liquid per can.
            * as a constant, cannot be changed later.
            */

        System.out.println ("The total volume of soda in your pack of " + cansPerPack + " bottles is " + cansPerPack*CAN_VOLUME + " ounces!");
            // communicates to user total volume.

        final double BOTTLE_VOLUME = 2.0;
            /*
             * variable of ty[e int.
             * total volume for all cans.
             * as a constant, cannot be changed later.
            */

        System.out.println ("The total volume of soda in your pack of " + cansPerPack + " cans is " + BOTTLE_VOLUME + " ounces!");
            // communicates to user total volume of soda for a pack.
        System.out.println ("The volume of soda in one bottle is " + BOTTLE_VOLUME / cansPerPack + " ounces!");
            // communicates to user volume of soda in one bottle.

        // PERSONAL CHALLENGE: INTEGRATE USER INPUT

        // set up predetermined volumes per can depending on the type of soda
        final double SPRITE_CAN_VOLUME = 12.0;
        final double COKE_CAN_VOLUME = 16.5;
        final double DRPEPPER_CAN_VOLUME = 8.0;
        final double WATER_CAN_VOLUME = 24.0;

        // use user input to determine how many total packs there are
        Scanner input = new Scanner (System.in);
        System.out.print ("How many packs would you like? ");
        int numberOfPacks = Integer.parseInt(input.nextLine()); 
            /* 
            * this step was tough!
            * i found i couldn't easily make a string into an integer in the same way i could make a float into an integer 
            * see github for link to website i used to figure out Integer.parseInt() method
            */ 
        System.out.println ("You have selected " + numberOfPacks + " packs!"); 
        System.out.println ("Great choice. With " + cansPerPack + " bottles per pack, that means you have " + cansPerPack * numberOfPacks + " bottles!");
            // tells user total number of bottles. used mainly as a way to make sure my code was taking inputs right.

        // use user input to pick from four possible options of soda (and therefore can volume)
        System.out.print ("What type of soda would you like? Type s for Sprite, c for Coke, d for Dr. Pepper, or w for water. ");
        String sodaType = input.nextLine();
        if (sodaType.equals("s")) {
            /*
             * another tough step!
             * first i had to figure out how to make an if, else, if ladder in java.
             * then, i found i couldn't check strings in the same way i could check integers.
             * see github for link to website i used to figure out if, else, if ladder and sodaType.equals("string").
             */
            System.out.println ("I love Sprite! Best possible choice. You get a gold star. ");
                // confirms to me I got type of soda right
            System.out.println ("Sprite bottles have " + COKE_CAN_VOLUME + " ounces per bottle.");
            System.out.println ("With " + numberOfPacks * cansPerPack + " bottles in your " + numberOfPacks + " packs, you have " + SPRITE_CAN_VOLUME * numberOfPacks * cansPerPack + " ounces of Sprite in total.");
            System.out.println ("Don't drink it all in one sitting!");
                //math math math!
        }
        else if (sodaType.equals("c")) {
            System.out.println ("Sorry, we don't have Coke. Is Pepsi okay? Just kidding, of course we have Coke.");
                // confirms to me I got the type of soda right
            System.out.println ("Coke bottles have " + COKE_CAN_VOLUME + " ounces per bottle.");
            System.out.println ("With " + numberOfPacks * cansPerPack + " bottles in your " + numberOfPacks + " packs, you have " + COKE_CAN_VOLUME * numberOfPacks * cansPerPack + " ounces of Coke in total.");
            System.out.println ("Don't drink it all in one sitting!");
                //math math math!
        }
        else if (sodaType.equals("d")) {
            System.out.println ("Dr. Pepper! That's certainly an option...");
                // confirms to me I got the type of soda right
            System.out.println ("Dr. Pepper bottles have " + DRPEPPER_CAN_VOLUME + " ounces per bottle.");
            System.out.println ("With " + numberOfPacks * cansPerPack + " bottles in your " + numberOfPacks + " packs, you have " + DRPEPPER_CAN_VOLUME * numberOfPacks * cansPerPack + " ounces of Dr. Pepper in total.");
            System.out.println ("Don't drink it all in one sitting!");
        }
        else if (sodaType.equals("w")) {
            System.out.println ("I said type of soda, and you picked water? Eww. You have objectively bad taste.");
                // confirms to me I got the type of soda right
            System.out.println ("Coke bottles have " + WATER_CAN_VOLUME + " ounces per bottle.");
            System.out.println ("With " + numberOfPacks * cansPerPack + " bottles in your " + numberOfPacks + " packs, you have " + WATER_CAN_VOLUME * numberOfPacks * cansPerPack + " ounces of water in total.");
            System.out.println ("Don't drink it all in one sitting!");
        }

        else {
            System.out.println ("Hmm... somethings wrong. Run the program again, and make sure your answer is in lowercase.");
                // just in case something is wrong
        }


    }
}
