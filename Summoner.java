package com.company;

import javax.swing.*;


public abstract class Summoner {

    int x, y, ms, hp;
    boolean targetable, riftwalk;

    JLabel label;

    void laufen(char richtung) {

        switch (richtung) {
            case 'a':
                label.setText("links");
            case 's':
                label.setText("unten");
            case 'd':
                label.setText("rechts");
            case 'w':
                label.setText("oben");

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
