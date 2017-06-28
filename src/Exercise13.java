import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        char keepGoing = 'y';
        int userNumber = 0;
        Scanner entry = new Scanner(System.in);

        while(keepGoing == 'y') {
            System.out.print("Please enter a number: ");
            userNumber = entry.nextInt();

            for (int i = userNumber; i >= 0; i--) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println("Would you like to continue? (y/n)");
            keepGoing = entry.next().charAt(0);
        }
        System.out.println("Goodbye!");
    }
}
