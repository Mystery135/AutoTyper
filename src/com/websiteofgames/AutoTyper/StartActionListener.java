package com.websiteofgames.AutoTyper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class StartActionListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {


        try {
            new Main();
        } catch (AWTException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
