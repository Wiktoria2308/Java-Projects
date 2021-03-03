package sky;

public class Point {
    private int x; // the position x of the point
    private int y; // the position y of the point
    private String direction; // this variable represents direction in which the point is directed

    //DEFAULT CONSTRUCTOR
    public Point (){

    }

    //CONSTRUCTOR
    // point initialized from parameters
    public Point(int x, int y, String direction) {
        setX(x);
        setY(y);
        setDirection(direction);
    }

    /**
     *
     * @param direction sets direction of a point
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     *
     * @return returns direction of a point
     */
    public String getDirection(){

        return direction;
    }

    /**
     *
     * @param x sets x position of a point
     */
    public void setX(int x) {
            this.x = x;
    }

    /**
     *
     * @param y sets y position of a point
     */
    public void setY(int y) {
            this.y = y;
    }

    /**
     * returns x position of a point
     * @return
     */
    public int getX(){

        return x;
    }

    /**
     * returns y position of a point
     * @return
     */
    public int  getY(){

        return y;
    }


}
