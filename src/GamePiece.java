import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    int minX;
    int maxX;
    int minY;
    int maxY;
    boolean frozen;
    String name;
    String color;

    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 500;
    }

    public int getPositionX() {
        System.out.println("positionX: " + positionX);
        return positionX;
    }

    public int getPositionY() {
        System.out.println("positionY: " + positionY);
        return positionY;
    }

    public int getMinX() {
        System.out.println("minX: " + minX);
        return minX;
    }

    public int getMaxX() {
        System.out.println("maxX: " + maxX);
        return maxX;
    }

    public int getMinY() {
        System.out.println("minY: " + minY);
        return minY;
    }

    public int getMaxY() {
        System.out.println("maxY: " + maxY);
        return maxY;
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
       // Random random = new Random(); - don't need this if users manually input moves
        if (this.frozen == false) {
            if (positionX < 0) {
                this.positionX = 0;
                System.out.printf("Sorry, your X coordinate cannot be less than 0. Setting your game piece of positionX at the lowest possible value of 0. Your new coordinate is now (%s, %s).%n", this.positionX, positionY);
            }
            else if (positionX > 100) {
                this.positionX = 100;
                System.out.printf("Sorry, your X coordinate cannot be greater than 100. Setting your game piece of positionX at the highest possible value of 100. Your new coordinate is now (%s, %s).%n", this.positionX, positionY);
            }
            else if (positionY < 0) {
                this.positionY = 0;
                System.out.printf("Sorry, your Y coordinate cannot be less than 0. Setting your game piece of positionY at the lowest possible value of 0. Your new coordinate is now (%s, %s).%n", positionX, this.positionY);
            }
            else if (positionY > 500) {
                this.positionY = 500;
                System.out.printf("Sorry, your Y coordinate cannot be greater than 500. Setting your game piece of positionY at the highest possible value of 500. Your new coordinate is now (%s, %s).%n", positionX, this.positionY);
            }
            else {
                this.positionX = positionX;
                this.positionY = positionY;
                System.out.printf("You have moved the piece to (%s, %s). %n", positionX, positionY);
            }

        }
        else { // when game piece is frozen = true;
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
