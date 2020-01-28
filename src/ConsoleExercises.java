import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %3.4s", pi);


        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Enter something: ");
//
//
//        String userInput = scanner.next();
//
////        String word1, word2, word3;
////
////        word1 = scanner.next();
////        word2 = scanner.next();
////        word3 = scanner.next();
//
//        System.out.printf("You entered: --> \"" + userInput + "\" <--");

        System.out.print("\nEnter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.printf("\nThe sentence is: \"%s\n", sentence);

    }
}
