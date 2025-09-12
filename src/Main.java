
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

public class Main {

    public static void displayMainMenu() {
        System.out.println("\n=== SPACE TRAVEL ===");
        System.out.println("\nLet's play a game");

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

        while (!quitMainLoop) {
            displayMainMenu();
        }
    }
}
