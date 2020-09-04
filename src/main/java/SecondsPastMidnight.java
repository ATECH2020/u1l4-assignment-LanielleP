import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        
        //System.out.print("Enter seconds past midnight: ");
          //may have caused autograding error
        
        int sec = scanner.nextInt();

        //Calculates minutes and hours
        int min = (sec / 60);
        int hour = (min / 60);
        
        //Prints result
        System.out.print(hour+" "+min);

        // closing the scanner object
        scanner.close();

    }//ends main method
}//ends SecondsPastMidnight class