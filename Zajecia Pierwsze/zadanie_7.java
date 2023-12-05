import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę pracowników w przedsiębiorstwie: ");
        int employeeCount = scanner.nextInt();

        System.out.print("Podaj obrót roczny przedsiębiorstwa (w euro): ");
        double annualRevenue = scanner.nextDouble();

        String sizeCategory;

        if (employeeCount >= 1 && employeeCount <= 9) {
            if (annualRevenue <= 2) {
                sizeCategory = "Mikrofirma";
            } else if (annualRevenue <= 10) {
                sizeCategory = "Mała Firma";
            } else if (annualRevenue <= 50) {
                sizeCategory = "Średnia Firma";
            } else {
                sizeCategory = "Duża Firma";
            }
        } else if (employeeCount >= 10 && employeeCount <= 50) {
            if (annualRevenue <= 10) {
                sizeCategory = "Mała Firma";
            } else if (annualRevenue <= 50) {
                sizeCategory = "Średnia Firma";
            } else {
                sizeCategory = "Duża Firma";
            }
        } else if (employeeCount >= 50 && employeeCount <= 250) {
            if (annualRevenue <= 50) {
                sizeCategory = "Średnia Firma";
            } else {
                sizeCategory = "Duża Firma";
            }
        } else if (employeeCount > 250) {
            sizeCategory = "Duża Firma";
        } else {
            sizeCategory = "Nieznana kategoria";
        }

        System.out.println("Wielkość przedsiębiorstwa: " + sizeCategory);

        scanner.close();
    }
}