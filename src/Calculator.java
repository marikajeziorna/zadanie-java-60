public class Calculator {
    int pierwszaLiczba;
    int drugaLiczba;

    public Calculator(int pierwszaLiczba, int drugaLiczba) {
        this.pierwszaLiczba = pierwszaLiczba;
        this.drugaLiczba = drugaLiczba;
    }

    public int getPierwszaLiczba() {
        return pierwszaLiczba;
    }

    public void setPierwszaLiczba(int pierwszaLiczba) {
        this.pierwszaLiczba = pierwszaLiczba;
    }

    public int getDrugaLiczba() {
        return drugaLiczba;
    }

    public void setDrugaLiczba(int drugaLiczba) {
        this.drugaLiczba = drugaLiczba;
    }

    int obliczSumęDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        int sum = getPierwszaLiczba() + getDrugaLiczba();
        return sum;
    }

    int obliczIloczynDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        int iloczyn = getPierwszaLiczba() * getDrugaLiczba();
        return iloczyn;
    }

    double obliczKwadratDwóchLiczb(int pierwszaLiczba, int drugaLiczba) {
        double kwadrat = Math.pow((getPierwszaLiczba() + getDrugaLiczba()), 2);
        return kwadrat;
    }
}
