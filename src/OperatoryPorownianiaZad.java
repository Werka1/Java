import java.util.Scanner;

public class OperatoryPorownianiaZad {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę, podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();

        System.out.println("Proszę, podaj drugą liczbę");
        int secondNumber = scanner.nextInt();

        System.out.println("A oto Twoje wyniki: ");

        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
    }
}
