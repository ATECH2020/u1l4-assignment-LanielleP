import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        
        //System.out.println("Enter hours, minutes, and seconds of first time:");
          //may have caused autograding error

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        //System.out.println("Enter hours, minutes, and seconds of second time:");
          //may have caused autograding error
        
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        // my code :)
        int totalSec = 0;
        totalSec += ( (hours2 - hours1) * 60 * 60 );
        totalSec += ( (minutes2 - minutes1) * 60 ); 
        totalSec += (seconds2 - seconds1);

        //Displays result
        System.out.print(totalSec);

        // closing the scanner object
        scanner.close();
    }//ends main method
}//ends Timestamps class