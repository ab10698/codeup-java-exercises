import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 100;
//        Loop Basics
//
//1. While
//
//Create an integer variable i with a value of 5.
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.

//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//2. Do While
//
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//Alter your loop to count backwards by 5's from 100 to -10.

//        do {
//            System.out.println("i is " + i);
//            i-=5;
//        } while( i >= -10);

//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while(k < 1000000);

//3. Set up a FizzBuzz problem that loops through and prints out the results after being run.

//        for(int i = 0; i<=100;i++ ) {
//            if (i % 15 == 0){
//                System.out.println("fizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

// 4. Set up a number grade system that converts to a letter grade.
//        int grade = 82;
//        String a = "A";
//        String b = "B";
//        String c = "C";
//        String d = "D";
//        String f = "F";
//
//        if (grade <= 100 && grade >= 90) {
//            System.out.println("You got a " + a + ". Nice work!");
//        } else if (grade < 90 && grade >= 80) {
//            System.out.println("You got a " + b + ". Well done.");
//        } else if (grade < 80 && grade >= 70) {
//            System.out.println("You got a " + c + ". Its not great, but you passed.");
//        } else if (grade < 70 && grade >= 60) {
//            System.out.println("You got a " + d + ". You just barely made it. Please try harder next time");
//        } else if (grade < 60) {
//            System.out.println("You got a " + f + ". You failed...");
//        } else {
//            System.out.println("Error! That is not a grade!");
//        }

        Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter an integer: ");
         Long userLow = scanner.nextLong();
         System.out.println("choose a number to stop at: ");
         Long userHigh = scanner.nextLong();



        System.out.println("Number |  Squared | Cubed ");
        System.out.println("------ |  ------- | ----- ");

        for (long i = userLow; i <= userHigh; i++){
          Long userInputSquared = i * i;
          Long userInputCubed = i * i * i;
            System.out.println(i + "      | " + userInputSquared + "       | " + userInputCubed);
        }




    }
}
