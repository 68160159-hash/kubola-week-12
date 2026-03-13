public class Lab12_1 {
    public static void main(String[] args) {

        Bottle b1 = new Bottle(10, 0);
        Bottle b2 = new Bottle(7, 0);

        System.out.println(" --- Start --- ");
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After filled b1 --- ");
        b1.filled();
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After pour b1 to b2 until full --- ");
        b1.pourUntilFull(b2);
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After pour all b2 --- ");
        b2.pourAll();
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After pour all b1 to b2 ---- ");
        b1.pourAll(b2);
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After filled b1 ---");
        b1.filled();
        b1.showInfo();
        b2.showInfo();

        System.out.println(" --- After pour b1 to b2 until full --- ");
        b1.pourUntilFull(b2);
        b1.showInfo();
        b2.showInfo();
    }
}