import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGKeyListener;
import ch.aplu.jgamegrid.Location;

import java.awt.event.KeyEvent;

public class Daisy extends Summoner implements GGKeyListener{

    static Location Portal1;
    Daisy() {
        x = 0;
        y = 0;
        ms = 5;
        riftwalk = false;
        targetable = true;
    }

    //KeyListener

    public boolean keyReleased (KeyEvent e){
        System.out.println("hay");
        return true;
    }




    @Override
    public boolean keyPressed(KeyEvent evt)
    {
        Feld nextFeld = null;
        switch (evt.getKeyCode())
        {
            case KeyEvent.VK_LEFT:
                nextFeld = (Feld) this.getLocation().getNeighbourLocation(Location.WEST);
                setDirection(Location.WEST);
                break;
            case KeyEvent.VK_UP:
                nextFeld = (Feld) getLocation().getNeighbourLocation(Location.NORTH);
                setDirection(Location.NORTH);
                break;
            case KeyEvent.VK_RIGHT:
                nextFeld = (Feld) getLocation().getNeighbourLocation(Location.EAST);
                setDirection(Location.EAST);
                break;
            case KeyEvent.VK_DOWN:
                nextFeld = (Feld) getLocation().getNeighbourLocation(Location.SOUTH);
                setDirection(Location.SOUTH);
                break;
        }

        if (nextFeld.getFeldart() == FeldArt.PORTAL1){

        }

        if (nextFeld != null && canMove(nextFeld)) {
            setLocation(nextFeld);

        }
        return true;
    }



    boolean canMove(Feld nextFeld) {
        if (nextFeld.getFeldart() == FeldArt.WALL) {
            return false;
        } else {
            return true;
        }
    }


     void eat(Feld feld){
        feld.setfeldArt(FeldArt.TERRAIN);
    }

}
