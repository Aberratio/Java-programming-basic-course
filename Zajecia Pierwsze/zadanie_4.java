class Scratch {
    public static void main(String[] args) {
        String welcomeMessage = "Hello world!";
        String welcomeMessageWithSpaces = "    Hello world!   ";

        System.out.println("Treść wiadomości: " + welcomeMessage);
        System.out.println("Liczba znaków wiadomości: " + welcomeMessage.length());
        System.out.println("Znak z indeksem 6: " + welcomeMessage.charAt(6));
        System.out.println("Fragment od indeksu 6 do końca: " + welcomeMessage.substring(6));
        System.out.println("Fragment od indeksu 0 do 3 (4 - 1): " + welcomeMessage.substring(0, 4));
        System.out.println("Wiadomość małymi literami: " + welcomeMessage.toLowerCase());
        System.out.println("Wiadomość wielkimi literami: " + welcomeMessage.toUpperCase());
        System.out.println("Wiadomość bez białych znaków: " + welcomeMessageWithSpaces.trim());
        System.out.println("Czy wiadomości są równe? " + welcomeMessage.equals("HEllo students!"));
        System.out.println("Czy wiadomości są równe (ignoruje wielokść liter)? " + welcomeMessage.equalsIgnoreCase("HEllo students!"));
        System.out.println("Czy wiadomość zaczyna się od Hello? " + welcomeMessage.startsWith("Hello"));
        System.out.println("Czy wiadomość kończy się na students!? " + welcomeMessage.endsWith("students!"));
        System.out.println("Czy wiadomość zawiera słowo students? " + welcomeMessage.contains("students"));
        System.out.println("Pierwsze wystąpienie (index): " + welcomeMessage.indexOf("!"));
        System.out.println("Ostatnie wystąpienie: " + welcomeMessage.lastIndexOf("e"));
        System.out.println("Zamiana ! na ?: " + welcomeMessage.replace("!", "?"));
        System.out.println("Zamiana Hello na Hi: " + welcomeMessage.replace("Hello", "Hi"));
        System.out.println("Podział tekstu ze względu na znak: " + welcomeMessage.split(" ")[0]);
        System.out.println("Łączenie tekstów: " + welcomeMessage.concat(" :)"));
    }
}