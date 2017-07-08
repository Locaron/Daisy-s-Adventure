import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class Feld {

    int x,y;
    int art;
    Image iWall;
    Image iEat;
    Image iTerrain;

    Feld(int x,int y){

    }



    Feld(int x,int y,int feldart){



        if(feldart==FeldArt.WALL){
            /*
            try {
                iWall = ImageIO.read(new URL("http://i0.kym-cdn.com/photos/images/newsfeed/000/096/044/trollface.jpg?1296494117"));
            }catch (IOException e){
                e.printStackTrace();
            }
            */
        }else if(feldart==FeldArt.EAT){

        }else if(feldart==FeldArt.TERRAIN){

        }else{
            System.out.print("Feld " + x +" " + y + "hat keine FeldArt");
        }


    }

    public void feldArt(int feldart){

    }

}

