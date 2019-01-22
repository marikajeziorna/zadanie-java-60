import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int drugaLiczba = scanner.nextInt();

        Calculator calculator = new Calculator(pierwszaLiczba, drugaLiczba);


        if (pierwszaLiczba > drugaLiczba) {
            System.out.println("Suma dwóch liczb: " + calculator.obliczSumęDwóchLiczb(pierwszaLiczba, drugaLiczba));
        } else {
            System.out.println("Liczba pierwsza jest mniejsza od drugiej, nie wykonuje obliczeń.");
        }


        if (pierwszaLiczba < drugaLiczba) {
            System.out.println("Iloczyn dwóch liczb: " + calculator.obliczIloczynDwóchLiczb(pierwszaLiczba, drugaLiczba));
        } else {
            System.out.println("Liczba pierwsza jest mniejsza od drugiej, nie wykonuje obliczeń.");
        }


        if (pierwszaLiczba == drugaLiczba) {
            System.out.println("Kwadrat dwóch liczb: " + calculator.obliczKwadratDwóchLiczb(pierwszaLiczba, drugaLiczba));
        } else {
            System.out.println("Liczba pierwsza jest mniejsza od drugiej, nie wykonuje obliczeń.");
        }

    }
}
