import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj drugą liczbę: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Wybierz operację (+, -, *, /): ");
        String operation = scanner.nextLine();

        double result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                    return;
                }
                break;
            default:
                System.out.println("Błąd: Nieznana operacja.");
                return;
        }

        System.out.println("Wynik operacji: " + result);

        scanner.close();
    }
}