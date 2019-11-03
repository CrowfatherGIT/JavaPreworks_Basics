package Dogg;

public class Doggg {

    public static void main (String[] args){
        Dog dog= new Dog ("Rexis", 1, 22, "Brown", "wof");
        Dog dog1 = new Dog ("Keksis", 17, 10, "brown", "blah blah blah");

        System.out.println(dog);
        System.out.println(dog1);

        System.out.println();

        dog.defaultSound();
        System.out.println();

        dog.sound();
        dog1.sound();




    }

}
