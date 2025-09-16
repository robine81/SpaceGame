
import java.util.ArrayList;
import java.util.Scanner;
// Beskrivning:
// Du är en rymdkapten som kan resa till olika planeter! Systemet ska kunna:
// ● Låta spelaren välja mellan olika planeter (Mars, Venus, Jupiter).
// ● Varje planet har olika risker (t.ex. syrebrist, stormar, farliga aliens).
// ● Användaren ska få välja vad de gör på planeten (utforska, samla resurser, fly).
// ● En loop ska låta spelaren resa till flera planeter tills de väljer att avsluta.
// Utmaning:
// Hur hanterar du olika konsekvenser med if-else beroende på vilken planet och val spelaren gör?

//CONTINUE: line 93 addAvatar
public class Main {

    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static void displayAvatars(ArrayList<String> avats) {
        System.out.println("\nAvatars");
        for (int i = 0; i < avats.size(); i++) {
            int menuSelection = 4;
            menuSelection += i;
            System.out.printf("%d. %s%n", menuSelection, avats.get(i));
        }
    }

    public static void chooseAvatar(ArrayList<String> avatars) {

    }

    public static void displayGameMenu() {
        System.out.println("1. Choose Avatar");
        System.out.println("2. Start Game");
        System.out.println("3. Game stats");
    }

    public static void displayMainMenu() {
        System.out.println("\n=== SPACE TRAVEL ===");
        System.out.println("\nLet's play a game");
        System.out.println("\nLet's go Space Captain, choose your avatar and let the adventure begin");

        displayGameMenu();
        System.out.println("\n0. Avsluta");

    }

    public static void main(String[] args) {

        ArrayList<String> planetsArr = new ArrayList<>();
        ArrayList<String> challengesArr = new ArrayList<>();
        ArrayList<String> activitiesArr = new ArrayList<>();
        ArrayList<String> avatarArr = new ArrayList<>();

        //Pre-defined planets
        planetsArr.add("Mars");
        planetsArr.add("Venus");
        planetsArr.add("Jupiter");

        //Pre-defined challenges
        challengesArr.add("Oxygen Low");
        challengesArr.add("Space storm");
        challengesArr.add("Alien attack");

        //Pre-defined activities
        activitiesArr.add("Explore");
        activitiesArr.add("Collect resources");
        activitiesArr.add("Run for your life");

        //Pre-defined avatars
        avatarArr.add("Princess Leia");
        avatarArr.add("Neytiri");
        avatarArr.add("Ripley");

        Scanner scanner = new Scanner(System.in);

        boolean quitMainLoop = false;
        boolean quitAvatarLoop = false;

        while (!quitMainLoop && !quitAvatarLoop) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Avatars to choose from: Princess Leia, Neytiri, Ripley ");
                    String avatar = scanner.nextLine();
                    boolean correctAvatar = false;
                    while (!correctAvatar) {
                        if (avatar == "Princess Leia" || avatar == "Neytiri" || avatar == "Ripley") {
                            addAvatar(avatar);
                            correctAvatar = true;
                            break;

                        } else {
                            System.out.print("Please choose again");
                        }
                    }

                    addAvatar(bookTitles, bookAuthors, bookISBN, bookAvailable, title, author, isbn);
                    break;
                    break;
                case 4:
                    chooseAvatar(avatarArr);
                    break;

                case 0:
                    quitMainLoop = true;
            }
        }
        scanner.close();
    }
}
