import java.util.Scanner;

public class InstrukcjeWarunkoweZad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if (age >= 18 && age >= 0){
            System.out.println("Dziękujemy za zakupy");
        }else if (age <0 ) {
            System.out.println("Wprowadź poprawną wartość");
        }else {
            System.out.println("Jesteś niepełnoletni, nie możesz kupić alkoholu");
        }
    }
}
