import ch.aplu.jgamegrid.*;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Control extends GameGrid  {

    public static void main(String[] args) {
        Control control = new Control();
    }

    private final static int nbHorzCells = 29;
    private final static int nbVertCells = 20;

    static Daisy daisy;



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

        addKeyListener(daisy);


        /*
        panel.add(button_start);

        button_start.addActionListener(this);
        this.addKeyListener(this);

        add(panel);
        setVisible(true);
        */
        start();
        setVisible(true);
    }

    void start() {
        System.out.println("LEEEEROY JENKINNNNS");
        daisy = new Daisy();
        //start game
    }


    private void drawGrid(GGBackground bg) {
        Labyrinth labyrinth = new Labyrinth();
        bg.clear(Color.cyan); //Wall

        Color color_terrain = Color.CYAN;
        Color color_wall = Color.DARK_GRAY;
        Color color_eat = Color.MAGENTA;
        Color color_portal = Color.RED;

        for (int x = 0; x < nbHorzCells; x++) {
            for (int y = 0; y < nbVertCells; y++) {
                int[][] felder = labyrinth.getLabyrinth();
                    //Eat
                if (felder[x][y] == FeldArt.EAT) {
                    Feld feld = new Feld(x, y, FeldArt.EAT);
                    bg.fillCell(feld, color_terrain);

                    bg.setPaintColor(color_eat);
                    bg.fillCircle(toPoint(feld), 3);
                    //Terrain
                }else if (felder[x][y] == FeldArt.TERRAIN){
                    Feld feld = new Feld(x, y, FeldArt.TERRAIN);
                    bg.fillCell(feld, color_terrain);
                    //Portal
                }else if (felder[x][y] == FeldArt.PORTAL1) {
                    Feld feld = new Feld(x, y, FeldArt.PORTAL1);
                    bg.fillCell(feld, color_terrain);

                    bg.setPaintColor(color_portal);
                    bg.drawCircle(toPoint(feld), 10);

                }else if (felder[x][y] == FeldArt.PORTAL2) {
                    Feld feld = new Feld(x, y, FeldArt.PORTAL2);
                    bg.fillCell(feld, color_terrain);

                    bg.setPaintColor(color_portal);
                    bg.drawCircle(toPoint(feld), 10);

                }else if (felder[x][y] == FeldArt.PORTAL3) {
                    Feld feld = new Feld(x, y, FeldArt.PORTAL3);
                    bg.fillCell(feld, color_terrain);

                    bg.setPaintColor(color_portal);
                    bg.drawCircle(toPoint(feld), 10);

                    //Wall
                }else if (felder[x][y] == FeldArt.WALL) {
                    Feld feld = new Feld(x, y, FeldArt.WALL);
                    bg.fillCell(feld, color_wall);


                }
            }
        }


    }

    /*
        //KeyListener

        public boolean keyReleased (KeyEvent e){
            System.out.println("hay");
            return false;
        }



        @Override
        public boolean keyPressed (KeyEvent e){

            int Key = e.getKeyCode();
            switch (Key) {

                case KeyEvent.VK_P:
                case KeyEvent.VK_ESCAPE:
                    //pause
                    break;

                case KeyEvent.VK_A:
                case KeyEvent.VK_LEFT:
                    System.out.println("links");
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_S:
                    System.out.println("unten");
                    break;
                case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                    System.out.println("rechts");
                    break;
                case KeyEvent.VK_UP:
                case KeyEvent.VK_W:
                    System.out.println("oben");
                    break;
                default:
                    System.out.println("NOPE");

            }

            return false;
        }

        */



    }
