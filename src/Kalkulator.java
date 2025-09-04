public class Kalkulator {
    public static double dodaj(double x, double y){
        return x+y;
    }
    public static double Podziel(int x,int y){
        return (double)x/y;
    }
    public static boolean czyLiczbaPierwsz(int x) {
        if (x == 1) {
            return false;
        }
        double pierwiastek = Math.sqrt(x);
        for (int i = 2; i <= pierwiastek; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double potega(int x, int y){
        if(y == 0) {
            return 1;
        }
        return Math.pow(x,y);
    }
}
