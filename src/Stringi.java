import java.util.Scanner;

public class Stringi {

    public static void main(String[] args) {
/*
        String Str = ("Lorem ipsum dolor sit amet, consectetur adipiscing elit");
        System.out.println(Str.toLowerCase());
        System.out.println(Str.toUpperCase());
        System.out.println(Str.replace("a", "z"));
        System.out.println(Str.endsWith("elit"));

        System.out.println();

        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(a == b); // a un b ir vienādi
        System.out.println(a.equals(b)); // a un b ir vienādi
        System.out.println(b == c); // nav vienāda vērtība
        System.out.println(b.equals(c)); // ir vienāda vērtība

*/

/*
        Scanner in = new Scanner(System.in);
        int Age = in.nextInt();

        int Ape = 18;

        if (Age < 18) {
            System.out.println("You are teenager!");

        } else if (Age > 100){

            System.out.println("You are very old!");
        } else{

            System.out.println("You are adult!");
        }
    }

}

*/

        //If Statements

        Scanner in = new Scanner(System.in); // nolasa info
        Integer q = in.nextInt(); //definē skaitļus vai kombinēto (Integer vai String)

        System.out.println(q); // Izdrukā ievadīto informāciju

        if (q == 0) {
            System.out.println("!");
        }
        if (q == 1) {
            System.out.println("@");
        }
        if (q == 2) {
            System.out.println("£");
        }
        if (q == 3) {
            System.out.println("$");

        }
        if (q == 4) {
            System.out.println("&");
        }
        if (q == 5) {
            System.out.println("*");
        }
    }
}








