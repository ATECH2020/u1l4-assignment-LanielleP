import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Enter the number of students for each classroom:");
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();

        //my code :)
        int totalDesks = 0;
        
        totalDesks += (students1 / 2);
        if( (students1 % 2)!= 0 )totalDesks++;

        totalDesks += (students2 / 2);
        if( (students2 % 2)!= 0 )totalDesks++;

        totalDesks += (students3 / 2);
        if( (students3 % 2)!= 0 )totalDesks++;

        System.out.println(totalDesks+" desks");

        // closing the scanner object
        scanner.close();
    }
}