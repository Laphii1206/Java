package Inheritance;

public abstract class Room {

    protected String name;
    protected float width, length, height;

    public Room(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public abstract float volume();
}
