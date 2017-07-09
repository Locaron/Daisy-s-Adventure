import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGKeyListener;
import ch.aplu.jgamegrid.Location;
import com.sun.javafx.scene.traversal.Direction;

import java.awt.event.KeyEvent;

public class Daisy extends Actor implements GGKeyListener{

    static Location Portal1;
    int[][]Felder;
    Labyrinth labyrinth = new Labyrinth();

    Daisy() {
        super(false, "bilder/trollface.gif", 1);

        Felder = labyrinth.getLabyrinth();
    }

    //KeyListener

    public boolean keyReleased (KeyEvent e){

        return true;
    }




    @Override
    public boolean keyPressed(KeyEvent evt) {
        Location nextFeld_Location = null;
        Feld nextFeld_Feld = null;


        switch (evt.getKeyCode()) {
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                nextFeld_Location = getLocation().getNeighbourLocation(Feld.WEST);
                setDirection(Location.WEST);
                break;
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                nextFeld_Location = getLocation().getNeighbourLocation(Location.NORTH);
                setDirection(Location.NORTH);
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                nextFeld_Location = getLocation().getNeighbourLocation(Location.EAST);
                setDirection(Location.EAST);
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                nextFeld_Location = getLocation().getNeighbourLocation(Location.SOUTH);
                setDirection(Location.SOUTH);
                break;
            default:
                System.out.println("JA GEGE");
        }




        /*
        if (nextFeld != null && canMove(nextFeld)) {
         setLocation(nextFeld);
             //eat(nextFeld);
        }
        */


        return true;
    }

    public Feld getFeld(){
        return  new Feld(getLocation(),getFeld().feldart);
    }



    boolean canMove(Location nextFeld) {

        /*
        if (nextFeld.getFeldart() == FeldArt.WALL) {
            return false;
        } else {
            return true;
        }
        */
        if (Felder[nextFeld.x][nextFeld.y] == FeldArt.WALL) {
            return false;
        } else {
            return true;
        }

    }

    /*

     void eat(Location next_feld){
        if(Felder[next_feld.x][next_feld.y] == FeldArt.EAT){

        }


    }
    */


}
