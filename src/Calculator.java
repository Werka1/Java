import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Cześć, wykonamy parę operacji matematycznych ;)");
        System.out.println("Podaj proszę pierwszą liczbę");
            Scanner scanner = new Scanner(System.in);

            int firstNumber = scanner.nextInt();

        System.out.println("A teraz podaj drugą liczbę");

            int secondNumber = scanner.nextInt();
        System.out.println("Swietnie!");

            int addiction = firstNumber + secondNumber;
            int subtraction = firstNumber - secondNumber;
            int multiplication = firstNumber * secondNumber;
            int division = firstNumber / secondNumber;
            int modulo = firstNumber % secondNumber;

        System.out.println("Wynik dodawania Twoich liczb to: " + addiction);
        System.out.println("Wyniki odejmowania Twoich liczb to: " + subtraction);
        System.out.println("Wynik mnożenia Twoich liczb to: " + multiplication);
        System.out.println("Wynik dzielenia Twoich liczb to: " +  division);
        System.out.println("Reszta z dzielenia Twoich liczb to: " + modulo);
    }
}
