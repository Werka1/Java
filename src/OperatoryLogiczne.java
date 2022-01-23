public class OperatoryLogiczne {

    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && - operator logiczny "i"
        // true wtedy gdy oba wyrażenia składowe są równe true

        System.out.println(firstValue && secondValue); // false
        System.out.println(firstValue && fourthValue); // true
        System.out.println(secondValue && thirdValue); // false

        // || - operator logiczny "lub"
        // true wtedy gdy conajmniej jedna z wyrażeń składowych jest równa true

        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(secondValue || thirdValue); //true

        // ! negacja- zwraca wartośc przeciwną do wyrażenia przed którym się znajduje

        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true


    }
}
