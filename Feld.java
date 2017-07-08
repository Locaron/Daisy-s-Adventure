import javax.swing.*;
import java.awt.*;


public class Feld {

    int x,y;
    int feldart;
    ImageIcon iWall;
    ImageIcon iEat;
    ImageIcon iTerrain;

    Feld(int x,int y){

    }



    Feld(int x,int y,int feldart){



        if(feldart==FeldArt.WALL){

        }else if(feldart==FeldArt.EAT){

        }else if(feldart==FeldArt.TERRAIN){

        }else{
            System.out.print("Feld " + x +" " + y + "hat keine FeldArt");
        }


    }

    public void setfeldArt(int feldart){
        if(feldart==FeldArt.WALL){

        }else if(feldart==FeldArt.EAT){

        }else if(feldart==FeldArt.TERRAIN){

        }else{
            System.out.print("Feld " + x +" " + y + "hat keine FeldArt");
        }

    }

    public int getArt() {
        return feldart;
    }
}

