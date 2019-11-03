import java.util.Scanner;

public class treshaLekcija {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[]{10, 20, 30, 40, 50};

        for (int i = 0; i < arrayOfInts.length; i++) {             //Variants A
            System.out.println(arrayOfInts[i]);
        }
        for (int a : arrayOfInts) {                                     //Variants B
            System.out.println(a);

            int size, value;

            Scanner sc = new Scanner(System.in);

            System.out.println("Ievadiet masīva izmēru:");
            size = sc.nextInt();
            int[] arrayOfInts2 = new int[size];
            for (int b : arrayOfInts2) System.out.println(a);

        }
    }
}
