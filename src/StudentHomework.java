// Stwórz 3 obiekty klasy student, Przypisz wartosci do pól, stworz tablice i dodaj studentow do tablicy.
// Przejdz przez studentow tablicy. wywołaj 4 metody

public class StudentHomework {
    public static void main(String[] args) {

        Student tomek = new Student();
        tomek.imie = "Tomek";
        tomek.nazwisko = "Kowal";
        tomek.nick = "tomekkowal";
        tomek.numerIndexu = 123;
        tomek.email = "tomek@kowal.pl";

        Student basia = new Student();
        basia.imie = "Basia";
        basia.nazwisko = "Mila";
        basia.nick = "basiamila";
        basia.numerIndexu = 456;
        basia.email = "basia@mila.pl";

        Student kitek = new Student();
        kitek.imie = "Kitek";
        kitek.nazwisko = "Kitkowski";
        kitek.nick = "kitekkitkowski";
        kitek.numerIndexu = 789;
        kitek.email = "kitek@kitkowski.pl";

        Student [] students = new Student[3];
        students[0] = tomek;
        students[1] = basia;
        students[2] = kitek;

        for (int i =0; i< students.length ; i++ ){
            students[i].przedstawSie();
            students[i].podajNrIndeksu();
            students[i].podajEmail();
            students[i].zalogujSie();
        }




    }

}
