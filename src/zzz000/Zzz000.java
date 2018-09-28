package zzz000;

public class Zzz000 {

    /**
     *
     * @param x
     *
     */
    public static double power(double base, int exponent) {
        
        double total = base;

        if (exponent ==1) {
            return base;
        } else {
            total= total * (power(base , exponent -1 ));
            return total;
        }
        }

    public static void main(String[] args) {

        System.out.println(power(2.0, 2));
    }

}
