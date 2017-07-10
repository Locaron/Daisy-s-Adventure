import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.Location;
import com.sun.javafx.scene.traversal.Direction;

import java.util.Random;

public class Nocturne extends Actor {
    String farbe;
    Random rand;
    int random;
    Feld feld;
    Labyrinth labyrinth = new Labyrinth();
    Feld[][] felder;

    Nocturne(String farbe){
        super(false, "sprites/nocturne_" + farbe + ".gif",1);

        this.farbe = farbe;
        felder = labyrinth.getFelder();
        setDirection(Feld.NORTH);

        rand = new Random();
    }

    void start(){
        switch (farbe){
            case "blau":
                setLocation(new Location(14,10));
                break;
            case "rot":
                setLocation(new Location(14,5));
                break;
            case "grün":
                setLocation(new Location(14,10));
                break;
        }
    }


    public void act() {
        /*
        if(farbe.equals("grün")) {
        follow();
        } else {
            moveNormal();
        }
        */
        moveNormal();
    }

    void follow() {
        Location daiy_location;
        //muss noch geschrieben werden
    }

    //Troll
    void randomwalk() {
        Feld nextFeld = null;
        int moveOptions = 0;
        int nowX = -1;
        int nowY = -1;
        int nowFeldart = -1;
        double olddirection = getDirection();

        nowX = getLocation().getNeighbourLocation(olddirection).getX();
        nowY = getLocation().getNeighbourLocation(olddirection).getY();
        nowFeldart = felder[nowX][nowY].getFeldart();
        Feld(nowX,nowY,nowFeldart);
        if(canMove(feld)){
            setLocation(getNextMoveLocation());
        }else{
            random = rand.nextInt(4-0) + 1;

            if(random == 1) {
                setDirection(Feld.NORTH);
                setLocation(getNextMoveLocation());
            }else if(rand.nextInt(4) == 2) {
                setDirection(Feld.EAST);
                setLocation(getNextMoveLocation());
            }else if(rand.nextInt(4) == 3) {
                setDirection(Feld.WEST);
                setLocation(getNextMoveLocation());
            }else if(rand.nextInt(4) == 4) {
                setDirection(Feld.SOUTH);
                setLocation(getNextMoveLocation());
            }
        }

    }

    void  moveNormal(){
        boolean foundlocation = false;
        int moveOptions = 0;
        double oldDirection = getDirection();

        //Wie viele Möglichkeiten es gibt
        if (canMoveLocation(Location.SOUTH)){
            moveOptions++;
        }
        if (canMoveLocation(Location.NORTH)){
            moveOptions++;
        }
        if (canMoveLocation(Location.EAST)){
            moveOptions++;
        }
        if (canMoveLocation(Location.WEST)){
            moveOptions++;
        }

        switch (moveOptions) {
            case 1:
                //ändert richtung und bewegt sich dann
                if (270.0 == oldDirection) {         // 270.0 ist norden
                    setDirection(Location.SOUTH);
                } else if (0.0 == oldDirection) { //0.0 ist osten
                    setDirection(Location.WEST);
                } else if (90.0 == oldDirection) { //...
                    setDirection(Location.NORTH);
                } else if (180.0 == oldDirection) { //...
                    setDirection(Location.EAST);
                }
                setLocation(getNextMoveLocation());
                break;
            case 2:
                if (canMoveLocation(oldDirection)){
                    setDirection(oldDirection);
                    setLocation(getNextMoveLocation());
                } else {
                    goRandom();
                }

                break;
            case 3:
            case 4:
                goRandom();
                break;
        }

    }

    void goRandom() {
        boolean foundlocation = false;


        while(!foundlocation) {
            random = rand.nextInt(4) + 1;
            switch(random) {
                case 1:
                    if(canMoveLocation(Location.NORTH)) {
                        setDirection(Location.NORTH);
                        foundlocation = true;
                    }
                    break;
                case 2:
                    if(canMoveLocation(Location.SOUTH)) {
                        setDirection(Location.SOUTH);
                        foundlocation = true;
                    }
                    break;
                case 3:
                    if(canMoveLocation(Location.WEST)) {
                        setDirection(Location.WEST);
                        foundlocation = true;
                    }
                    break;
                case 4:
                    if(canMoveLocation(Location.EAST)) {
                        setDirection(Location.EAST);
                        foundlocation = true;
                    }
                    break;
                default:
                    System.out.println("random = " + random + ", cannot set Direction");
            }

        }
        setLocation(getNextMoveLocation());
    }
    boolean canMove(Feld nextFeld) {
        if (nextFeld.getFeldart() == FeldArt.WALL) {
            return false;
        } else {
            return true;
        }
    }

    public void  Feld(int x, int y, int feldart){
        feld = null;
        feld = new Feld(x ,y , feldart);
    }

    public boolean canMoveLocation(Location.CompassDirection direction){
        int x,y,feldart;
        x = getLocation().getNeighbourLocation(direction).getX();
        y = getLocation().getNeighbourLocation(direction).getY();
        feldart = felder[x][y].getFeldart();
        Feld(x,y,feldart);
        if(canMove(feld)) {
            return true;
        }else {
            return false;
        }
    }

    public boolean canMoveLocation(double direction){
        int x,y,feldart;
        x = getLocation().getNeighbourLocation(direction).getX();
        y = getLocation().getNeighbourLocation(direction).getY();
        feldart = felder[x][y].getFeldart();
        Feld(x,y,feldart);
        if(canMove(feld)) {
            return true;
        }else {
            return false;
        }
    }

}