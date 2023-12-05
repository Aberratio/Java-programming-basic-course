import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj początek zakresu: ");
        int rangeStart = scanner.nextInt();

        System.out.print("Podaj  zakresu: ");
        int rangeEnd = scanner.nextInt();

        if (rangeStart >= rangeEnd) {
            System.out.print("Podano zły zakres!");
        } else {
            System.out.println("Liczby parzyste w zakresie " + rangeStart + "-" + rangeEnd + ":");

            for (int i = rangeStart; i <= rangeEnd; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}