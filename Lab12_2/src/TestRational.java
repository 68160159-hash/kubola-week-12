public class TestRational {
    public static void main(String[] args) {
        Rational r1,r2,r3,r4,r5;
        double d1,d2;
        r1 = new Rational(1,2);
        d1 = r1.getReal();
        System.out.println(r1.show() + " = " + d1);


        r2 = new Rational(4,3);
        d2 = r2.getReal();
        System.out.println(r2.show()  + " = " + d2);

        r3 = new Rational(3,2);

        r4 = r1.plus(r3);
        System.out.println(r4.show());

        r5 = r1.plus(r2);
        System.out.println(r5.show());
    }
}

