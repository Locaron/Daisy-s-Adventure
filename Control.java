package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Control extends JFrame implements KeyListener, ActionListener  {

    JButton button_start = new JButton("START");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hier könnte ihre Werbung stehen");


    Control() {
        super("Daisy's Adventure");
        setSize(300,300);
        setResizable(false);
        setLocation(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        panel.add(button_start);


        button_start.addActionListener(this);
        this.addKeyListener(this);

        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        Control control = new Control();
    }

     void start() {
        System.out.println("LEEEEROY JENKINNNNS");
        button_start.setVisible(false);
        panel.add(label);

        //start game
    }





    //Lee Sin
    @Override
    public void keyReleased(KeyEvent e){
        System.out.print("TROLL");
    }

    @Override
    public void keyTyped(KeyEvent e){

    }

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
                label.setText("links");
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                label.setText("unten");
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                label.setText("rechts");
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                label.setText("oben");
                 break;
            default:
                System.out.println("NOPE");

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("START")){
           start();
       }

    }
}
