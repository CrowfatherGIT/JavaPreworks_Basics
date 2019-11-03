package Dogg;

public class Dog {
    private String name;
    private int age;
    private Integer weight;
    private String colour;
    private String sound;

    private static final int DEFAULT_LEG_COUNT = 4;

    public Dog(String name, int age, Integer weight, String colour, String sound) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.sound = sound;
    }

    public void defaultSound(){
        System.out.println("Default Bark");
    }

    public void sound(){
        if (age < 6) {
            System.out.println("default bark");
        } else if (age >15) {
            System.out.println("old bark");
        } else {
            System.out.println("grown bark");
        }
    }

    @Override
    public String toString() {
        return "Dogg.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
