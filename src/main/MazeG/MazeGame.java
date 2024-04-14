public class MazeGame {
    public static void main (String [] argv) {
        createMaze();
    }

    private static void createMaze () {
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        DoorWall d = new DoorWall(r1, r2 );

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, d);
        r1.setSide(Direction.EAST,	newWall());
        r1.setSide(Direction.SOUTH,	newWall());
        r1.setSide(Direction.WEST,	newWall());
        r2.setSide(Direction.NORTH,	newWall());
        r2.setSide(Direction.EAST,	newWall());
        r2.setSide(Direction.SOUTH,	d);
        r2.setSide(Direction.WEST,	newWall());

    }

    private static Wall newWall() {
        return new Wall(); // You can customize the creation of wall objects as needed
    }
}