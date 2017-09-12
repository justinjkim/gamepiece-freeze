public class Main {
    public static void main(String[] args) {
        GamePiece knight = new GamePiece();

        // basic test of the methods
        knight.getPositionX();
        knight.getPositionY();
        knight.getName();
        knight.setName("L-dude");
        knight.getName();
        knight.getColor();
        knight.setColor("black");
        knight.getColor();

        //test to ensure that frozen pieces do not move
        knight.freeze();
        knight.move();

        knight.unfreeze();
        knight.move();


    }
}
