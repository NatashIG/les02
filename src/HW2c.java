public class HW2c {

    public static void main (String [] args) {

        int r = 0;
        r = 8;

        double l, s;

        l = 2 * Math.PI * r;
        s = (Math.PI) * (Math.pow(r, 2));

        System.out.println("Длина окружности = " + String.format("%(.2f", l));
        System.out.println("Площадь круга = " + s);
    }
}
