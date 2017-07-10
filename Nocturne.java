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
        rand = new Random();
        setDirection(Feld.NORTH);

    }


    public void act() {

        if(farbe.equals("grün")) {
           follow();
        } else {
            moveNormal();
        }
    }

    void follow() {
        Location daiy_location;

    }

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
        int moveOptions = 0;
        double oldDirection = getDirection();

        //Wie viele möglichkeiten gibt es
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
        System.out.println(moveOptions);

        switch (moveOptions) {
            case 1:
                if (Location.NORTH.equals(oldDirection)) {
                    setDirection(Location.SOUTH);

                } else if (Location.EAST.equals(oldDirection)) {
                    setDirection(Location.WEST);

                } else if (Location.SOUTH.equals(oldDirection)) {
                    setDirection(Location.NORTH);

                } else if (Location.WEST.equals(oldDirection)) {
                    setDirection(Location.EAST);
                }
                setLocation(getNextMoveLocation());
                break;


        }

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











    /*
    void  moveNormal(){
        Feld nextFeld = null;
        int moveOptions = 0;
        int nowX, nowY, nowFeldart;
        double olddirection = getDirection();

        //Nord

        nowX = getLocation().getNeighbourLocation(Location.NORTH).getX();
        nowY = getLocation().getNeighbourLocation(Location.NORTH).getY();
        nowFeldart = felder[nowX][nowY].getFeldart();
        Feld(nowX,nowY,nowFeldart);
        if(canMove(feld)) {
            moveOptions++;
        }

        //Ost
        nowX = getLocation().getNeighbourLocation(Location.EAST).getX();
        nowY = getLocation().getNeighbourLocation(Location.EAST).getY();
        nowFeldart = felder[nowX][nowY].getFeldart();
        Feld(nowX,nowY,nowFeldart);
        if(canMove(feld)) {
            moveOptions++;
        }

        //Sueden
        nowX = getLocation().getNeighbourLocation(Location.SOUTH).getX();
        nowY = getLocation().getNeighbourLocation(Location.SOUTH).getY();
        nowFeldart = felder[nowX][nowY].getFeldart();
        Feld(nowX,nowY,nowFeldart);
        if(canMove(feld)) {
            moveOptions++;
        }

        //Nord
        nowX = getLocation().getNeighbourLocation(Location.WEST).getX();
        nowY = getLocation().getNeighbourLocation(Location.WEST).getY();
        nowFeldart = felder[nowX][nowY].getFeldart();
        Feld(nowX,nowY,nowFeldart);
        if(canMove(feld)) {
            moveOptions++;
        }

        switch (moveOptions){

            case 2:
                setDirection(olddirection);
                setLocation(getNextMoveLocation());
                break;
            case 3:
                int direction = rand.nextInt(3);

                setDirection(direction);
                setLocation();
        }

    }
    */
}
