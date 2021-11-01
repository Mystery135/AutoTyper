package com.websiteofgames.AutoTyper;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class fastestSettingItemListener implements ItemListener {
    public static boolean fastestSetting;
    @Override

    public void itemStateChanged(ItemEvent e) {
        if (Frame.fastestSetting.isSelected()){

            fastestSetting = true;

        }else {
            fastestSetting = false;

        }

    }
}
