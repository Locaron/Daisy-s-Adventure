import ch.aplu.jgamegrid.Actor;

import javax.swing.*;


public  class Summoner extends Actor {

    int x, y, ms, hp;
    boolean targetable, riftwalk;


    Summoner(){


    }

    void laufen(char richtung) {

        switch (richtung) {
            case 'w':
                System.out.println("links");
            case 's':
                System.out.println("unten");
            case 'o':
                System.out.println("rechts");
            case 'n':
                System.out.println("oben");

        }
    }

    //getter
    public boolean getRiftwalk() {
        return riftwalk;
    }

    public boolean getTargetable() {
        return targetable;
    }


    public int getMs() {
        return ms;
    }

    public int getHp() {
        return hp;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter

    public void setMs(int ms) {
        this.ms = ms;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setTargetable(boolean targetable){
        this.targetable = targetable;
    }

    public void setRiftwalk(boolean riftwalk) {
        this.riftwalk = riftwalk;
    }

    public void tp(int x,int y){
        this.x = x;
        this.y = y;
    }
}
