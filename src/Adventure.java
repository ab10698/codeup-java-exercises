import java.util.Scanner;

public class Adventure {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";


	public static void main(String[] args){
//        -----intro-----
		Scanner sc = new Scanner(System.in);

		System.out.print(ANSI_YELLOW+ "\n" +
				" _____                     _    ___      _                 _                  \n" +
				"|  __ \\                   | |  / _ \\    | |               | |                 \n" +
				"| |  \\/_ __ __ _ _ __   __| | / /_\\ \\ __| |_   _____ _ __ | |_ _   _ _ __ ___ \n" +
				"| | __| '__/ _` | '_ \\ / _` | |  _  |/ _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\\n" +
				"| |_\\ \\ | | (_| | | | | (_| | | | | | (_| |\\ V /  __/ | | | |_| |_| | | |  __/\n" +
				" \\____/_|  \\__,_|_| |_|\\__,_| \\_| |_/\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|\n" +
				"                                                                              \n" +
				"                                                                              \n" + ANSI_RESET);

		System.out.println( " WELCOME TO ABA'RACH, ADVENTURER!");

		System.out.println("  ");
		System.out.println( " What is your name?");
		System.out.print( " > ");
		String  userName = sc.nextLine();
			if (userName.equals("")){
			 System.out.println( " (System: Er .... since you wont pick a name, lets just call you \"Vi\".) ");
				userName = "Vi";
			}
		System.out.println("  ");
		System.out.println(" So your name is " + userName + "? A fine name for an adventurer such as yourself.");
		System.out.println("  ");

//        -----Weapon choice-----
		System.out.println(" So, " + userName +" , I dont recall what weapon you use. Was it a 1.\"dagger\", a 2.\"spear\", or was it a 3.\"broadsword\"? (choose a matching number to the weapon you want.) ");
        System.out.print( " > ");
        String  userWeapon = sc.nextLine();
            if (userWeapon.equals("1")){
                userWeapon = "dagger";
            } else if (userWeapon.equals("2")){
                userWeapon = "spear";
            } else if (userWeapon.equals("3")){
                userWeapon = "broadsword";
            } else {
                System.out.print(" (System: Since you cant make up your mind on a weapon, im just going to give you a dagger...)");
                System.out.println("  ");
                userWeapon = "dagger";
            }
        System.out.println("  ");
        System.out.println(" How silly of me. Of course you use a " + userWeapon + ".");

		System.out.println(" I wish you the best of luck upon your adventure " + userName + "!");
		System.out.println("  ");
//        -----Starting the story now-----

		System.out.println(" (Do you wish to start your adventure? (yes/no) ");
		System.out.print( " > ");
		String  userStart = sc.nextLine();
		if (userStart.equals("no")){
//			-----End prompt-----
			System.out.println("That's too bad. Maybe another time...");
		} else if (userStart.equals("yes")){
//			-----Start Adventure-----
		System.out.println("  ");
		System.out.println(" ----- Creating story ----- ");
		System.out.println("  ");
		System.out.println(" You Have just arrived within the port city of Aba'rach. You have come here to earn some money, as you are currently broke.\n" +
				" The air is thick with the smell of salt water, the sun floats high above the horizon, casting warm rays upn the city, and the streets before you are full of travelers and citizens going about their day.");
		System.out.println("  ");

		System.out.println(" It would seem the particular street you have found yourself on is none other than the cities main fish market. The smell of fish cooking over a fire nearby lingers in the air.\n" +
				" A large, bald, burly  man seems to be staring at you from a distance, close to one of the vendor booths, and begins to walk towards you. Do you 1.\"stay\" or do you 2.\"flee\"? ");
		System.out.print( " > ");
		String  userEncounter1 = sc.nextLine();

//		-----First Choice-----

		if (userEncounter1.equals("2")){
			System.out.println(" You end up turning as quick as you can and booking it out of town full sprint. \"No way am I going back there!\" you think to yourself as you begin your travel to another town.");
			System.out.println(" -----GAME OVER-----");
			System.out.println("You have fled the town. never to be seen or heard from again. Some claim you are still running to this day.");
//		-------First Encounter Game Over-------


		} else if (userEncounter1.equals("1")){
			System.out.println(" You stand your ground, prepared for the worst as the man approaches closer.");
			System.out.println(" \"Hey " +userName+ "! You almost forgot to take this with you!\" ");
			System.out.println(" You realize that the man that was walking towards you was just your uncle Tommy, and you begin to calm down. You take a look at the item, and realize he was just bringing you a luck talisman for your journey. ");
			System.out.println("\"I know you probably didn't need this, with all the good luck you always have, but I just wanted to give it to you as a little present before you headed out! Hope it serves you well.\"");
			System.out.println("You wondered why Tommy was here in Aba'rach of all places, or how he heard of your journey, but you did not ponder on the matter for long.");
			System.out.println("You quickly thanked Tommy for the gift, and continued your journey down the fish market's road");
			System.out.println("  ");



		}



		}


	}
}
