package com.minot;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame implements KeyListener {

    public GameWindow(){
        Notes.prepareSystem();

        addKeyListener(this);

        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        /* if (e.getKeyCode() == KeyEvent.VK_A){
            Notes.playNote(60);
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            Notes.playNote(61);
        }else if (e.getKeyCode() == KeyEvent.VK_D){
            Notes.playNote(62);
        }else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            Notes.stopNote(130);
        }*/
        Notes.playNote(e.getKeyCode());

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
