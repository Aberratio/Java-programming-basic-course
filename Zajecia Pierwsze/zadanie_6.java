import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();

        char lastLetter = name.charAt(name.length() - 1);

        if (lastLetter == 'a' || lastLetter == 'A') {
            System.out.println("Dzień dobry Studentko!");
        } else {
            System.out.println("Dzień dobry Studencie!");
        }

        scanner.close();
    }
}