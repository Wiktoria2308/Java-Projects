package sky;

public class Table {
    private int x; // the x position of a table
    private int y; // the y position of a table


    // default constructor
    public Table() {

    }

    //constructor
    public Table( int x, int y){
        setX(x);
        setY(y);
    }

    /**
     * sets x position of a table
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * sets y position of a table
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * returns x position of a table
     * @return
     */
    public int getX(){

        return x;
    }

    /**
     * returns y position of a table
     * @return
     */
    public int  getY(){

        return y;
    }


}
