package com.websiteofgames.AutoTyper;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static boolean start;

    Main() throws AWTException, InterruptedException, IOException {


    Robot robot = new Robot();

    Timer timer = new Timer();
    TimerTask timerTask =new TimerTask() {
        int time = 3;
        @Override
        public void run() {
            if (time > 0) {

                System.out.println(time);
                Frame.timeUntilStart.setBounds(300, 475,1000,50);
                Frame.timeUntilStart.setText("AutoTyper Starting In " + (time));
                time--;
            } else {
                System.out.println("AutoTyper Enabled");

                Frame.timeUntilStart.setBounds(357, 475,1000,50);
                Frame.timeUntilStart.setText("Started!");
                time--;
            }


            if (time < 0) {

                timer.cancel();


                FileWriter writer = null;
                try {
                    writer = new FileWriter(String.valueOf(getClass().getResourceAsStream("autotyper.txt")));
                } catch (IOException e) {
                    e.printStackTrace();
                }


                String toType =
                        Frame.toType.getText();

                System.out.println("Typing: "  + toType);

                try {
                    writer.write(toType);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


                char typeOutChar[];
                String typeOut = "";


                int timesToPaste = Integer.parseInt(Frame.timestopaste.getText());

                for(int q = 0; q<timesToPaste; q++){
                    File file = new File((String.valueOf(getClass().getResourceAsStream("autotyper.txt"))));
                    Scanner scan = null;
                    try {
                        scan = new Scanner(file);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    while (scan.hasNextLine()){


                        typeOut = "";
                        typeOut += scan.nextLine();
                        typeOutChar =  typeOut.toCharArray();


                        for (int i = 0; i< typeOutChar.length; i++) {
                            int keyCode = KeyEvent.getExtendedKeyCodeForChar(typeOutChar[i]);

                            if (KeyEvent.CHAR_UNDEFINED == keyCode) {



                                throw new RuntimeException("Key code not found for character '" + typeOutChar[i] + "'");
                            }


                            robot.keyPress(keyCode);

                            robot.keyRelease(keyCode);

                        }
                        System.out.println(typeOutChar);

                        robot.keyPress(KeyEvent.VK_ENTER);
                        robot.keyRelease(KeyEvent.VK_ENTER);


                        try {
                            int timeBetweenPastes =    Integer.parseInt(Frame.timebetweenpastes.getText());

                            Thread.sleep(timeBetweenPastes);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }



                }
                Frame.timeUntilStart.setBounds(355, 475,1000,50);
                Frame.timeUntilStart.setText("Finished!");
                System.out.println("Finished!");



            }

        }
        };
    timer.scheduleAtFixedRate(timerTask, 0, 1000);




}









    public static void main(String[] args) throws IOException {




new Frame();






    }
}
