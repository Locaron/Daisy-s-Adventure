

import ch.aplu.jgamegrid.*;


public class Feld extends Location{


    int feldart;



    Feld(Location location, int feldart){
        this.feldart = feldart;
        //Location
        location.x = x;
        location.y = y;
    }

    Feld(int x,int y , int feldart){

        this.feldart =feldart;
        //Location
        this.x = x;
        this.y = y;


    }

    public void setfeldArt(int feldart){
        this.feldart = feldart;
    }

    public int getFeldart() {
        return feldart;
    }




}

