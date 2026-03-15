public class TestRatinal {
    public static void main(String[] args) {
        Rational r1, r2, r3, r4, r5;
        double d1, d2;
        r1 = new Rational(2, 3);
        d1 = r1.getReal();
        System.out.println(r1.show() + " = " + d1);

        r2 = new Rational(7, 8);
        d2 = r2.getReal();

        System.out.println(r2.show() + " = " + d2);
        r3 = new Rational(4, 5);

        r4 = r1.plus(r3);
        System.out.println(r1.show() + " + " + r3.show() + " = " + r4.show() + " = " +
                r4.getReal());

        r5 = r1.plus(r2);
        System.out.println(r1.show());
        System.out.println(r1.show() + " + " + r3.show() + " = " + r2.show() + " = " +
                r5.show() + " = " + r5.getReal());
    }
}





