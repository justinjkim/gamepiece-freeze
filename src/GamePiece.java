import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
    }

    public int getPositionX() {
        System.out.println("positionX: " + positionX);
        return positionX;
    }

    public int getPositionY() {
        System.out.println("positionY: " + positionY);
        return positionY;
    }

    public String getName() {
        System.out.println("name: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        System.out.println("color: " + color);
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move(int positionX, int positionY) {
        Random random = new Random();
        if (this.frozen == false) {
            this.positionX = positionX;
            this.positionY = positionY;
            System.out.printf("You have moved the piece to (%s, %s). %n", positionX, positionY);
        }
        else {
            System.out.println("ERROR: Cannot move, you're frozen!");
        }
    }

    public void freeze() {
        System.out.println("You have frozen the piece!");
        this.frozen = true;
    }

    public void unfreeze() {
        System.out.println("You have unfrozen the piece!");
        this.frozen = false;
    }
}
