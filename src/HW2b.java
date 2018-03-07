public class HW2b {

    public static void main (String [] args) {
        int a = 0, b = 0, c = 0;
        a = 2;
        b = 3;
        c = 4;

        double z;

        z = (b + Math.sqrt( Math.pow (b,2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + b;
        if (a != 0) {
            z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + b;
        }
        System.out.println("Значение выражения = " + z) ;
    }
}


