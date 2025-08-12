
public class Main {
    public static int getRandomNumber(int min, int max) {
        int rand = (int) (Math.random() * (max - min + 1)) + min;
        return rand;
    }

    public static String Coinflip(int length) {
        if (Math.random() < 0.5) {
            return "Head";
        } else {
            return "Tail";
        }
    }

    public static int Diceroll() {
        int max = 6;
        int min = 1;
        int dice = (int) (Math.random() * (max - min + 1)) + min;
        return dice;

    }

    public static int Wheelspin() {
        return (int) (Math.random() * 8) + 1;

    }

    public static int Getpick() {
        return (int)(Math.random() * 99) + 1;


    }

    public static void main(String[] args) {

        double Random = Math.random();
        System.out.println("Random number: " + Random);
        int result = getRandomNumber(5, 15);
        System.out.println("Random number between 5 and 15: " + result);
        System.out.println("Coin flip: " + Coinflip(1));
        System.out.println("You rolled a " + Diceroll());
        System.out.println("Spinner result: " + Wheelspin());
        System.out.println("Your lottery picks:");
        for (int i = 0; i < 5; i++) {
            System.out.println(Getpick());
        }

    }
}