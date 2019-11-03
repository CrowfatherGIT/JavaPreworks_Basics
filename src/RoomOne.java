import java.util.Scanner;

public class RoomOne {
    public static void main(String[] args) {
        Room room = new Room(6, 6, 3);

        int surface = room.surface();
        System.out.println(surface + " m^2");

        int volume = room.volume();
        System.out.println(volume + " m^3");


        Scanner in = new Scanner(System.in);
        System.out.println("Cik gara ir istaba?");
        int lenght = in.nextInt();

        System.out.println("Cik plata ir istaba?");
        int width = in.nextInt();

        System.out.println("Cik augsta ir istaba?");
        int height = in.nextInt();



    }
}

