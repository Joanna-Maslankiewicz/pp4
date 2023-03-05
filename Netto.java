public class Netto {

    public static double NettoValue(double brutto, double tax) {
        return brutto / (1 + (tax / 100));
    };

}