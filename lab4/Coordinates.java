package ioop.lab4;

public class Coordinates {
    public final static Coordinates NORTH_VECTOR = new Coordinates(1, 0);
    public final static Coordinates SOUTH_VECTOR = new Coordinates(-1, 0);
    public final static Coordinates EAST_VECTOR = new Coordinates(0, 1);
    public final static Coordinates WEST_VECTOR = new Coordinates(0, -1);
    public final static Coordinates STATIONARY = new Coordinates(0, 0);

    private int x;
    private int y;

    // Task 1.1
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Task 1.1
    public void addCoordinates(Coordinates vector) {
        this.x += vector.x;
        this.y += vector.y;
    }

    // Task 1.1
    public Coordinates findSafeMove(World world) {
        int xBound = world.getxDimension();
        int yBound = world.getyDimension();

        if (x + 1 <= xBound) {
            return NORTH_VECTOR;
        } else if  (y + 1 <= yBound) {
            return EAST_VECTOR;
        } else if (x - 1 >= 0) {
            return SOUTH_VECTOR;
        } else if (y - 1 >= 0) {
            return WEST_VECTOR;
        } else {
            return STATIONARY;
        }
    }

    // Task 1.2
    public Coordinates getNextStepTo(Coordinates destination) {
        if (Math.abs(destination.x - this.x) > Math.abs(destination.y - this.y)) {
            if (this.x < destination.x) {
                return NORTH_VECTOR;
            } else {
                return SOUTH_VECTOR;
            }
        } else if (Math.abs(destination.x - this.x) < Math.abs(destination.y - this.y)) {
            if (this.y < destination.y) {
                return EAST_VECTOR;
            } else {
                return WEST_VECTOR;
            }
        } else {
            return STATIONARY;
        }
    }

    // Task 1.3
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Coordinates check = (Coordinates) obj;
        if ((check.x == this.x) && (check.y == this.y)) {
            return true;
        } else {
            return false;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
