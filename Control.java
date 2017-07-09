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
    Feld felder[][];



    /*
    JButton button_start = new JButton("START");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hier könnte ihre Werbung stehen");
    */


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
        addActor(daisy, new Location(14,10));
        addKeyListener(daisy);
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
        Color color_portal = Color.BLUE;

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
                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL1) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal);
                    bg.drawCircle(toPoint(felder[x][y]), 10);

                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL2) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal);
                    bg.drawCircle(toPoint(felder[x][y]), 10);

                }else if (felder[x][y].getFeldart() == FeldArt.PORTAL3) {
                    bg.fillCell(felder[x][y], color_terrain);

                    bg.setPaintColor(color_portal);
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
