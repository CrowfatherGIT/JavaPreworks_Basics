public class Room {
    private int width;
    private int height;
    private int length;


    public Room(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;


    }

    public int surface() {
        int surface = width * length;
        return surface;
    }

    public int volume() {
        int volume = width * length * height;
        return volume;
    }


}
