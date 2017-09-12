public class Main {
    public static void main(String[] args) {
        GamePiece knight = new GamePiece();

        // basic test of the methods
        knight.getPositionX();
        knight.getPositionY();
        knight.getMinX();
        knight.getMaxX();
        knight.getMinY();
        knight.getMaxY();
        knight.getName();
        knight.setName("L-dude");
        knight.getName();
        knight.getColor();
        knight.setColor("black");
        knight.getColor();

        //test to ensure that frozen pieces do not move
        knight.freeze();
        knight.move(3,5);

        knight.unfreeze();
        knight.move(76,234);

        // test to ensure moves don't go out of bounds
        knight.move(-3, 500);
    }
}
