public class PartB {
    public static void main(String[] args) throws Exception { //this is the entry point into our program.
        int amount = 41;
        
        // Quarters
        int quarters = amount/25; // 2
        System.out.println("There are " + quarters + " quarters!");
        amount = amount % 25;

        // Dimes
        int dimes = amount/10;
        System.out.println("There are " + dimes + " dimes");
        amount = amount % 10;

        // Nickels
        int nickels = amount/5;
        System.out.println("There are " + nickels + " nickels");
        amount = amount % 5;

        // Pennies
        int pennies = amount;
        System.out.println("There are " + pennies + " pennies");
    }
}
