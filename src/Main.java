
// Beskrivning:
// Du är en rymdkapten som kan resa till olika planeter! Systemet ska kunna:
// Låta kaptenen välja mellan olika planeter (Mars, Venus, Jupiter).
// Varje planet har olika risker (t.ex. syrebrist, stormar, farliga aliens).
// Användaren ska få välja vad de gör på planeten (utforska, samla resurser, fly).
// En loop ska låta spelaren resa till flera planeter tills de väljer att avsluta.
// Utmaning:
// Hur hanterar du olika konsekvenser med if-else beroende på vilken planet och val spelaren gör?

public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.startGame();
    }
}
