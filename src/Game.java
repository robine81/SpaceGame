import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Game {

static Game singleObject;
ArrayList planets = new ArrayList<Planet>();
//    Avatar avatar = new Avatar("Princess Leia", "Laser sword fighter");
//    Player player = new Player("PlayerOne");
private Planet planetVenus;
private Planet planetMars;
private Planet planetJupiter;

    public static void displayMainMenu() {
        System.out.println("\n=== SPACE TRAVEL ===");
        System.out.println("\nLet's play a game");
        System.out.println("\nLet's go Space Captain, choose what planet to visit and let the adventure begin");
        System.out.println("1. Visit Venus");
        System.out.println("2. Visit Mars");
        System.out.println("3. Visit Jupiter");
        System.out.println("0. Avsluta");

    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);

        boolean quitMainLoop = false;

        while (!quitMainLoop) {
            displayMainMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    if(planetVenus)

                }
                case 0:
                    quitMainLoop = true;
            }
        }
        scanner.close();
    }

    public void startGame(){
        // Initialize as fields (not locals)
        planetVenus   = new Planet("Venus", 50,  false);
        planetMars    = new Planet("Mars",  200, true);
        planetJupiter = new Planet("Jupiter", 120, true);

        planets.add(planetVenus);
        planets.add(planetMars);
        planets.add(planetJupiter);
        runMenu();
    }

    public static Game getInstance(){
        if(singleObject == null){
            singleObject = new Game();
        }
        return singleObject;
    }
}
                