public class Calculator {
    int pierwszaLiczba;
    int drugaLiczba;

    public Calculator(int pierwszaLiczba, int drugaLiczba) {
        this.pierwszaLiczba = pierwszaLiczba;
        this.drugaLiczba = drugaLiczba;
    }

    int obliczSumęDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        int sum = pierwszaLiczba + drugaLiczba;
        return sum;
    }

    int obliczIloczynDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        int iloczyn = pierwszaLiczba * drugaLiczba;
        return iloczyn;
    }

    double obliczKwadratDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        double kwadrat = Math.pow(pierwszaLiczba + drugaLiczba, 2);
        return kwadrat;
    }
}
