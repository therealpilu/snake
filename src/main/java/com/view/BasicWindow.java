package main.java.com.view;

import javax.swing.JFrame;

import main.java.com.controller.GameObserver;

public interface BasicWindow {

    /**
     * Shows the window on the screen.
     */
    void show();

    /**
     * Sets the {@link GameObserver} for this window.
     * @param obs
     */
    void setObserver(GameObserver obs);

    /**
     * 
     * @return the frame of this BasicWindow.
     */
    JFrame getFrame();
}