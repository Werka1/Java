public class DoWhileLoop {

    public static void main(String[] args) {
    // pętla do while wykona się chociaż raz przed sprawdzeniem warunku
        int number = 5;

        do {
            System.out.println("Moja wartość to : " + number + " i jest mniejsza od 20");
            number ++;

        } while (number <20);

    }
}

