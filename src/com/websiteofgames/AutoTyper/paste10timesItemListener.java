package com.websiteofgames.AutoTyper;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class paste10timesItemListener implements ItemListener {

public static boolean paste10times;
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (Frame.paste10times.isSelected()){

            paste10times = true;

        }else {
            paste10times = false;


        }


    }
}
