

import ch.aplu.jgamegrid.*;


public class Feld extends Location{


    int feldart;


    Feld(int x, int y, int feldart){

        if(feldart==FeldArt.WALL){
            feldart=FeldArt.WALL;

        }else if(feldart==FeldArt.EAT){
            feldart=FeldArt.EAT;

        }else if(feldart==FeldArt.TERRAIN) {
            feldart = FeldArt.TERRAIN;

        }else if(feldart==FeldArt.PORTAL1) {
            feldart=FeldArt.PORTAL1;
        }else if(feldart==FeldArt.PORTAL2) {
            feldart=FeldArt.PORTAL2;
        }else if(feldart==FeldArt.PORTAL3) {
            feldart=FeldArt.PORTAL3;

        }else{
            System.out.print("Feld " + x +" " + y + "hat keine FeldArt");
        }
        //Location
        this.x = x;
        this.y = y;
    }

    public void setfeldArt(int feldart){

        if(feldart==FeldArt.WALL){
            feldart=FeldArt.WALL;

        }else if(feldart==FeldArt.EAT){
            feldart=FeldArt.EAT;

        }else if(feldart==FeldArt.TERRAIN) {
            feldart = FeldArt.TERRAIN;

        }else if(feldart==FeldArt.PORTAL1) {
            feldart=FeldArt.PORTAL1;
        }else if(feldart==FeldArt.PORTAL2) {
            feldart=FeldArt.PORTAL2;
        }else if(feldart==FeldArt.PORTAL3) {
            feldart=FeldArt.PORTAL3;

        }else{
            System.out.print("Feld " + x +" " + y + "hat keine FeldArt,durch methode setfeldArt");
        }

    }

    public int getFeldart() {
        return feldart;
    }



}

