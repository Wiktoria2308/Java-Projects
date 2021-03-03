package sky;
import java.util.Scanner; // importing scannner to read user input

public class Navigation {

    Scanner scan = new Scanner(System.in); // declaring scanner as a scan

    private boolean finished = false; // variable finished is used in play() method to switch cases until user wants to finish program
    private Point point;
    private Table table;

    //default constructor
    public Navigation() {
    }

    /**
     * this method is used to declare size of a table and also start position of a point by the user
     */
    public void setStartPoint() {
        System.out.println("Write a size of a table eg (4 4): ");
        int a = scan.nextInt(); // a is x-coordinate
        int b = scan.nextInt(); // b is y-coordinate
        this.table = new Table(a, b); // assigning parameters to table
        System.out.println("Write position of a point eg (2 2): ");
        int c = scan.nextInt(); // c is x-coordinate
        int d = scan.nextInt(); // d is y-coordinate
        this.point = new Point(c, d, "north"); // assigning parameteres to point
    }

    /**
     * this method is printing commands to the console so user can choose between different choices
     */
    public void printCommands() {

        System.out.println(">> Pick an option:");
        System.out.println(">> (0) Quit simulation and print results.");
        System.out.println(">> (1) Move forward one step");
        System.out.println(">> (2) Move backwards one step");
        System.out.println(">> (3) Rotate clockwise 90 degrees (eg north to east)");
        System.out.println(">> (4) Rotate counterclockwise 90 degrees (eg west to south)");
        System.out.println(">> ");
    }

    /**
     * this method is a method which runs a program
     * first it runs setStartPoint() method;
     * secondly it runs printCommands() method;
     * thirdly it begins while loop where it switch between from 5 cases according to user choice
     *
     */
    public void play() {
        setStartPoint();
        printCommands();
        while (finished == false) {

            int choose = scan.nextInt();

            switch (choose) {
                //case 0  quits simulation and print results
                case 0:
                    // here it checks if position of the point is in the table,
                    // position of the point should be bigger or equal to 0 or smaller or equal to table position
                    if(point.getX() >= 0 && point.getY() >= 0 && point.getX() <= table.getX() && point.getY() <= table.getY()) {
                        //printing out position of the point
                        System.out.println("The position of the point is: " + point.getX() + ", " + point.getY());
                    }
                    else {
                        //if position of the point is out of a table it prints out position as -1,-1
                        System.out.println("The position of the point is: -1, -1.");
                    }
                    finished = true; // finishes loop and stops the program
                    break;
                    // case 1 is moving point one step forward
                case 1:
                    // accordning to current direction of the point it moves it one step forward
                    // for example if position is north so it moves only y-coordinate in that case it is subtract 1 from y-coordiante
                    // 3,4 is now 3,3
                    if(point.getDirection().equals("north")) {
                       point.setY(point.getY() - 1);

                    }
                    else if(point.getDirection().equals("west")){
                        point.setX(point.getX() -1);

                    }
                    else if(point.getDirection().equals("east")) {
                        point.setX(point.getX() + 1);

                    }
                    else {
                        point.setY(point.getY() +1);
                    }
                    printCommands(); // it prints out commands again
                    break;

                    //case 2 is moving point one step backwards
                case 2:
                    // accordning to current direction of the point it moves it one step backwards
                    // for example if position is north so it moves only y-coordinate in that case it is adding 1 to y-coordiante
                    // 3,4 is now 3,5
                    if(point.getDirection().equals("north")) {
                        point.setY(point.getY() + 1);
                    }
                    else if(point.getDirection().equals("west")){
                        point.setX(point.getX() + 1);
                    }
                    else if(point.getDirection().equals("east")) {
                        point.setX(point.getX() - 1);
                    }
                    else {
                        point.setY(point.getY() - 1);
                    }
                    printCommands(); // it prints out commands again
                    break;

                    // case 3 is rotating point clockwise 90 degrees
                case 3:
                    // it this case is changing direction of the point eg from north to east
                    // it first checks the current position of the point and then change it
                    if(point.getDirection().equals("north")) {
                        point.setDirection("east");
                    }
                    else if(point.getDirection().equals("west")){
                        point.setDirection("north");
                    }
                    else if(point.getDirection().equals("east")) {
                        point.setDirection("south");
                    }
                    else {
                        point.setDirection("west");
                    }
                    printCommands(); // printing again commands
                    break;

                    // case 4 is rotating point 90 degrees counterclockwise eg from north to west
                case 4:
                    // first it checks current direction of the point and then change it eg grom north to west
                    if(point.getDirection().equals("north")) {
                        point.setDirection("west");
                    }
                    else if(point.getDirection().equals("west")){
                        point.setDirection("south");
                    }
                    else if(point.getDirection().equals("south")) {
                        point.setDirection("east");
                    }
                    else {
                        point.setDirection("north");
                    }
                    printCommands(); // printing again commands
                    break;

            }


        }
    }
}