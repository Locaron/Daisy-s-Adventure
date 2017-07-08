import ch.aplu.jgamegrid.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Control extends GameGrid implements KeyListener, ActionListener  {

    public static void main(String[] args) {
        Control control = new Control();
    }

    private final static int nbHorzCells = 20;
    private final static int nbVertCells = 20;


    /*
    JButton button_start = new JButton("START");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hier könnte ihre Werbung stehen");
    */


    Control() {
        super(nbHorzCells, nbVertCells,15, false);
        setTitle("Daisy´s Adventure");
        setSimulationPeriod(40);
        GGBackground background = getBg();
        drawGrid(background);




        /*
        panel.add(button_start);

        button_start.addActionListener(this);
        this.addKeyListener(this);

        add(panel);
        setVisible(true);
        */
        setVisible(true);
    }

     void start() {
        System.out.println("LEEEEROY JENKINNNNS");


        //start game
    }


    private void drawGrid(GGBackground bg)
    {
        Labyrinth grid = new Labyrinth();
        bg.clear(Color.BLACK); //Wall

        /*
        bg.setPaintColor(Color.GREEN); //Eat
        for (int y = 0; y < nbVertCells; y++)
        {
            for (int x = 0; x < nbHorzCells; x++)
            {
                Feld feld = new Feld(x, y, FeldArt.EAT);
                int a = grid.getLocation(feld);
                if (a == 1 || a == 2)
                    bg.fillCell(feld, Color.MAGENTA); //Terrain
                if (a == 1)  // Pill
                    bg.fillCircle(toPoint(feld), 3);
            }
        }
        */

    }


    //KeyListener
    @Override
    public void keyReleased(KeyEvent e){    }

    @Override
    public void keyTyped(KeyEvent e){    }

    @Override
    public void keyPressed(KeyEvent e){

        int Key = e.getKeyCode();
        switch (Key){

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

    }



        //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("START")){
           start();
       }

    }
}