import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        Long userFirst = scanner.nextLong();
        System.out.println("choose a second integer to use: ");
        Long userSecond = scanner.nextLong();
        System.out.println("what would you like to do with these integers?: ");
        String userType = scanner.next();


        long i = userFirst;
        long y = userSecond;

        if (userType.equals("addition")){
            long userAddition = i + y;
            System.out.println("Result: " + userAddition);
        } else if (userType.equals("subtraction")){
            long userSubtraction = i - y;
            System.out.println("Result: " + userSubtraction);
        }

    }
}
