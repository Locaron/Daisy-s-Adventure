import ch.aplu.jgamegrid.*;

import java.awt.*;
import java.awt.event.KeyEvent;

import static ch.aplu.util.QuitPane.setVisible;


public class Control extends GameGrid  {

    public static void main(String[] args) {
        Control control = new Control();
    }

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;

    static Daisy daisy;
    Nocturne nocturne_blau;
    Nocturne nocturne_grün;
    Nocturne nocturne_rot;
    Feld felder[][];



    Control() {
        super(nbHorzCells, nbVertCells, 30, false);
        setTitle("Daisy´s Adventure");
        setSimulationPeriod(40);
        GGBackground background = getBg();
        drawGrid(background);

        start();
        setVisible(true);

    }

    void start() {
        System.out.println("LEEEEROY JENKINNNNS");
        daisy = new Daisy();
        nocturne_blau = new Nocturne("blau");
        nocturne_rot = new Nocturne("rot");
        nocturne_grün = new Nocturne("grün");

        addActor(nocturne_blau,new Location(14,8));
        addActor(nocturne_grün,new Location(15,8));
        addActor(nocturne_rot,new Location(13,8));
        addActor(daisy, new Location(14,13));

        addKeyListener(daisy);

        daisy.setSlowDown(2);
        nocturne_grün.setSlowDown(4);
        nocturne_blau.setSlowDown(4);
        nocturne_rot.setSlowDown(4);


        nocturne_blau.start();
        nocturne_rot.start();
        doRun();
        show();

        //start game
    }


    private void drawGrid(GGBackground bg) {
        Labyrinth labyrinth = new Labyrinth();
        bg.clear(Color.cyan); //Wenn nicht ausgefüllt

        //Farben
        Color color_terrain = Color.GRAY;
        Color color_wall = Color.DARK_GRAY;
        Color color_eat = Color.YELLOW;
        Color color_portal1 = Color.BLUE;
        Color color_portal2 = Color.ORANGE;
        Color color_portal3 = Color.RED;


        for (int x = 0; x < nbHorzCells; x++) {
            for (int y = 0; y < nbVertCells; y++) { //Für alle Felder
                Feld[][] felder = labyrinth.getFelder();

                //Eat
                if (felder[x][y].getFeldart() == FeldArt.EAT) {
                    bg.fillCell(felder[x][y], color_terrain); //macht es zu Terrain

                    bg.setPaintColor(color_eat);              //zeichnet Essen hin
                    bg.fillCircle(toPoint(felder[x][y]), 3);
                    //Terrain
                }else if (felder[x][y].getFeldart() == FeldArt.TERRAIN){
                    bg.fillCell(felder[x][y], color_terrain); //macht es zu Terrain
                    //Portal
                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL1_1|felder[x][y].getFeldart() == FeldArt.PORTAL1_2) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal1);
                    bg.drawCircle(toPoint(felder[x][y]), 10);

                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL2_1|felder[x][y].getFeldart() == FeldArt.PORTAL2_2) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal2);
                    bg.drawCircle(toPoint(felder[x][y]), 10);

                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL3_1|felder[x][y].getFeldart() == FeldArt.PORTAL3_2) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal3);
                    bg.drawCircle(toPoint(felder[x][y]), 10);

                    //Wall
                }else if (felder[x][y].getFeldart() == FeldArt.WALL) {
                    bg.fillCell(felder[x][y], color_wall);

                }else {
                    System.out.println("FeldArt OutOfBoundsExeption bei Feld: " + x + " " + y);
                }



            }
        }


    }




    }
