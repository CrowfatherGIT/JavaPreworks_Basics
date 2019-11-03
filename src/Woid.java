java.util.Scanner;

public class Woid {
    public static void main(String[] args) {
/* Ar Double tiek piemērota skaitliska vērtība un var pievienot Int vai matemātiskas darbības
ar String tiek piemērotas gan vārdiskas, gan skaitliskas vērtības. Pēc datu ievades tiek nolasītas darbības.
 */

      Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.print(s);

        int x = 4;
        System.out.println(x++); // palielina vērtību par +1, drukā oriģinālo vērtību
        System.out.println(--x); // samazina vērtību par -1, drukā gala vērtību
        System.out.println(x % 3); // dala ar norādīto skaitu un uzrāda atlikumu
        System.out.println(11 % 2); // dala ar norādīto skaitu un uzrāda atlikumu
        System.out.println(7 % x++);//
        System.out.println(x == 4); // pārbauda vai vienības ir vienādas, ja ir tad true
        System.out.println(x != 4); // pārbauda vai ir vienāds, ja nav tad vērtība ir true

        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5); // salīdzinia x ar 10 + y ir mazāks par 5
        System.out.println(x <= y && y > 5); // salīdzina x ar y + pārbauda vai y>5
        System.out.println("abc" instanceof String); //








    }

}

