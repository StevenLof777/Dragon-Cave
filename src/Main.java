import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "You are in a land full of dragons. In front of you, " +
                        "you see two caves. In one cave,\nthe dragon is friendly\n" +
                        "and will share his treasure with you.\n" +
                        "The other dragon is greedy and hungry and will eat you on sight.\n" +
                        "Which cave will you go into? (1 or 2)\n");

        int caveChoice = 0;
        try {
            caveChoice = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        final String msg = caveChoice == 2
                ? "The dragon has given you treasure"
                : "The dragon has eaten you";

        System.out.println(msg);
    }
}