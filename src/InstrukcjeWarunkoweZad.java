import java.util.Scanner;

public class InstrukcjeWarunkoweZad {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("Dziękujemy za zakupy");
        }else {
            System.out.println("Jesteś niepełnoletni, sprzedaż alkoholu zabroniona");
        }
    }
}
