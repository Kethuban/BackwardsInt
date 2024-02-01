//importing scanner
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //DECLARE VARIABLES
        int num, root, rem;

        //using scanner to detect input from the keyboard
        Scanner keyboard = new Scanner(System.in);

        //Asking the user to enter a number
        System.out.println("Please enter an integer");
        //Detecting the input from the keyboard
        num = keyboard.nextInt();

        //While num is greater than 0 the following code will be executed
        while (num>0)
        {
            //obtaining the remainder of the number divided by 10
            rem = num%10;
            //dividing num by ten and then casting it out
            root = (int)num/10;
            //printing the number stored in rem
            System.out.print(rem);
            //storing num in root
            num = root;
        }
    }
}