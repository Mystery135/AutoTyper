package com.websiteofgames.AutoTyper;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Frame {
    private static JButton startButton;
    public static JTextArea toType;
    private static JLabel toTypeLabel;
    public static JLabel timeUntilStart;
    private static JLabel title;
    public static JTextField timebetweenpastes;
    public static JTextField timestopaste;
    public static JTextField timebetweenlettertypes;
    public static JLabel timebetweenpasteslabel;
    public static JLabel timestopastelabel;
    public static JLabel timebetweenlettertypeslabel;
    public static JCheckBox fastestSetting;
    public static JCheckBox paste10times;

public Frame() throws IOException {



    JPanel panel= new JPanel();
    JFrame frame = new JFrame("AutoTyper v1.2");

    startButton = new JButton("Start!");
    startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    startButton.setBounds(325, 430,150,50);
    startButton.addActionListener(new StartActionListener());



    toTypeLabel = new JLabel("Text:");
    toTypeLabel.setBounds(50, 200,100,50);
    toTypeLabel.setFont(new Font(null,Font.BOLD,25));

    title = new JLabel("AutoTyper v1.2");
    title.setBounds(300, 20,1000,50);
    title.setFont(new Font(null,Font.BOLD,30));

    toType = new JTextArea();
    toType.setBounds(150, 100,500,275);

    timebetweenpastes = new JTextField();
    timebetweenpastes.setBounds(200,415,100,25);

    timestopaste = new JTextField();
    timestopaste.setBounds(200,450,100,25);
    timebetweenlettertypes = new JTextField();
    timebetweenlettertypes.setBounds(200,485,100,25);


    timebetweenpasteslabel = new JLabel("Time Between Words (ms): ");
    timebetweenpasteslabel.setBounds(20,415,175,25);

    timestopastelabel = new JLabel("Times To Paste:");
    timestopastelabel.setBounds(20,450,100,25);

    timebetweenlettertypeslabel = new JLabel("Type Speed (ms):");
    timebetweenlettertypeslabel.setBounds(20,485,225,25);

    fastestSetting = new JCheckBox("Use Fastest Setting");
    fastestSetting.setBounds(500,450,200,25);
    fastestSetting.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    fastestSetting.addItemListener(new fastestSettingItemListener());


    paste10times = new JCheckBox("Paste 10 Times");
    paste10times.setBounds(500,430,200,25);
    paste10times.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    paste10times.addItemListener(new paste10timesItemListener());




    timeUntilStart = new JLabel("");
    timeUntilStart.setBounds(300, 500,1000,50);
    timeUntilStart.setFont(new Font(null,Font.BOLD,20));







panel.add(paste10times);
panel.add(fastestSetting);
    panel.add(timebetweenlettertypes);
    panel.add(timebetweenlettertypeslabel);
    panel.add(timestopastelabel);
    panel.add(timebetweenpasteslabel);
panel.add(timestopaste);
panel.add(timebetweenpastes);
panel.add(title);
panel.add(timeUntilStart);
panel.add(toTypeLabel);
panel.add(toType);
panel.add(startButton);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(panel);
panel.setLayout(null);

    frame.setResizable(false);
    frame.setSize(800,600);




}






}
