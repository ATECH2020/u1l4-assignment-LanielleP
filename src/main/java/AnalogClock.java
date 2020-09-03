import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Enter the angle of the hour hand: ");
        int hourAngle = scanner.nextInt();

        //my code :)
        System.out.println( 12 * ( hourAngle % 30 ) );

        // closing the scanner object
        scanner.close();
    }//ends main method
}//ends AnalogClock class