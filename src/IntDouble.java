public class IntDouble {

    public static void main(String[] args) {
        System.out.println("What the fuck!");

//nosaka max vērtību
        int a = Integer.MAX_VALUE;

        System.out.println();

        double b = 3.23523;
        double c = a+b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c+1);
//noapaļo uz 2 decimāldaļām
        System.out.printf("%3.2f", 3.23523);

        System.out.println();

        System.out.println();
//pārveido sakitļus HEX - x vai X nosaka burtu izmērus
        System.out.printf("%02X", 192);
        System.out.print(":");
        System.out.printf("%02X", 168);
        System.out.print(":");
        System.out.printf("%02X", 1);
        System.out.print(":");
        System.out.printf("%02X", 10);

        System.out.println();












    }
}
