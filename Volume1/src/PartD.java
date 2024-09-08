import java.util.Scanner;

public class PartD {
    public static void main(String[] args) throws Exception {
        final double ACCELERATION = -9.81;
        
        Scanner input = new Scanner (System.in);
        System.out.println ("Hello! I am Robort, your personal physics companion.");
        System.out.print ("What is the initial height of your object (in meters)? ");
        double initialHeight = Double.parseDouble(input.nextLine());
            //Using same idea as in part A, but with doubles instead of integers
        System.out.print ("What is the initial velocity of your object (in meters per second)? ");
        double initialVelocity = Double.parseDouble(input.nextLine());
        System.out.print ("What is the total time (in seconds)? ");
        double time = Double.parseDouble(input.nextLine());

        double distance = initialHeight + initialVelocity * time + 0.5*ACCELERATION*Math.pow(time, 2);

        System.out.println ("Thank you! Now let me think about what the height is at that time.");
        System.out.println (".");
        System.out.println (".");
        System.out.println (".");
        System.out.println ("Great! The height at the specified time is " + distance + " meters");

    }
}