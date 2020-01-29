import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ask Bob a question: ");
        String userInput = sc.nextLine();
        String bob = "Bob: ";

        if(userInput.endsWith("?")){
            System.out.println(bob + "Sure.");
        } else if (userInput.endsWith("!")){
            System.out.println(bob + "Whoa, chill out! Why are you so mean all of a sudden?");
            String userAngerInput = sc.nextLine();
            if (userAngerInput.endsWith("!")){
                System.out.println(bob + "Man, im done talking to you...");
            } else if (userAngerInput.equals("Im sorry.")){
                System.out.println(bob + "Its okay. Just dont go off on me like that.");
            } else {
                System.out.println(bob + "I dont know what your issue is, but im leaving...");
                System.out.println(">Bob has left the chat");
            }
        } else if (userInput.equals("")){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever...");
        }
    }
}
